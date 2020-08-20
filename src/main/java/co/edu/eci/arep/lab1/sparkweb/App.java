/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eci.arep.lab1.sparkweb;

/**
 *
 * @author Jairo Gomez
 */
import co.edu.eci.arep.lab1.sparkweb.calcuator.Calculator;
import co.edu.eci.arep.lab1.sparkweb.calcuator.EstadisticOp;
import co.edu.eci.arep.lab1.sparkweb.container.LinkedListImp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import spark.Request;
import spark.Response;
import static spark.Spark.*;

public class App {

        public static void main(String[] args) {
        port(getPort());
        get("/inputdata", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
        
       
    }

    private static String inputDataPage(Request req, Response res) {
        
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                +"<script>"
                +"var numbers=[];"
                +"function myFunction() {"
                +"var n = document.getElementById(\"numero\").value;"
                +"numbers.push(n);"
                +"console.log(numbers);"
                +"document.getElementById(\"numero\").value=\"\";"
                + "document.getElementById(\"lista\").value = numbers.toString()};"
                +"</script>"
                +"<center>"
                + "<h1>SparkWeb Calculator</h1>"
                + "<h3> Laboratorio Arep con Spark para calculos Estadisticos </h3>"
                + "<hr/>"
                + "<form action=\"/results\">"
                +"<label>"
                + "  ingrese los numeros a evaluar:<br>"
                + "  <input id=\"numero\" type=\"text\" name=\"numero\" placeholder=\"ingrese un numero\">"
                +"   <button type=\"button\" onclick=\"myFunction()\">agregar valor</button>"
                +" <br/>"
                +"</label>"
                +" <br/>"
                +"<label> "
                + " la lista a evaluar es: <br>"
                + " <input id=\"lista\" type=\"text\" name=\"lista\">"
                +"</label>"
               
                + "  <br>"
                + "  <br><br>"
                + "  <input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "<p>If you click the \"Submit\" button, the form-data will be sent to a page called \"/results\".</p>"
                +"<center>"                
                + "</body>"
                + "</html>";
        return pageContent;
    }

    
    private static String resultsPage(Request req, Response res) {
         Calculator calculator = new Calculator(); 
        // operation with function 
        EstadisticOp media = (x) -> calculator.media(x);
        EstadisticOp desviacion = (x) -> calculator.Desviacion(x);
        List datos = getLinkedList(req.queryParams("lista"));
        Double mean = calculator.StatOperation(datos, media);
        Double desv = calculator.StatOperation(datos, desviacion);
        String smean = "la media de los datos es : " + mean;
        String sdesv ="la desviacion estandar de los datos es :" + desv;
        System.out.println(smean +" " + sdesv);
         
         String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                +"<center>"
                + "<h1>SparkWeb Calculator</h1>"
                + "<h3> Laboratorio Arep con Spark para calculos Estadisticos </h3>"
                + "<hr/>"
                + "  Media:<br>"
                + "<p>" + smean + "</p>"
                + "  <br>"
                + "  Desviacion:<br>"
                + "<p>"+ sdesv +"</p>"
                + "  <br><br>"
           
                + "<p>los resultados dependen de los datos ingresado, verificar que sean correctos.</p>"
                + "<p>NOTA: Nan representa el valor de la desviacion </p>"
                + "</center>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    private static List getLinkedList (String toArr){
        LinkedListImp <Double> lk = new LinkedListImp <Double>();
        String[] parts = toArr.split(",");   
        List<String>  dat = (List<String>) Arrays.asList(parts);
        System.out.println(dat);
        for(String d : dat){
            Double val = Double.parseDouble(d);
            lk.add(val);
        }
        return lk;
    }
    /**
     * This method reads the default port as specified by the PORT variable in
     * the environment.
     *
     * Heroku provides the port automatically so you need this to run the
     * project on Heroku.
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}
