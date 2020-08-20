package co.edu.eci.arep.lab1.sparkweb.calculator;
/**
 *
 * @author Jairo Gomez
 */
import co.edu.eci.arep.lab1.sparkweb.calcuator.Calculator;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author danip
 */
public class CalculatorTest {
     private ArrayList<Double> arr1 = new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0));
     private ArrayList<Double> arr2 = new ArrayList<Double>(Arrays.asList(2.0,4.0,6.0,8.0));
     private Calculator cl =  new Calculator();
     @Test
     public void testMediafile1(){
         try{
             cl.media(arr2);
         }catch(Exception e){
             e.printStackTrace();
         }
     }
     
      @Test
     public void testMediafile2(){
         try{
             cl.media(arr1);
         }catch(Exception e){
             e.printStackTrace();
         }
     }
     
       @Test
     public void testdevfile1(){
         try{
             cl.Desviacion(arr2);
         }catch(Exception e){
             e.printStackTrace();
         }
     }
     
      @Test
     public void testdesvfile2(){
         try{
             cl.Desviacion(arr1);
         }catch(Exception e){
             e.printStackTrace();
         }
     }
    
}
