# Spark-Web
este programa calcula la media y la desviacion estandar de los datos ingresados por archivo.
estos datos deben cargarse a la ruta  dispuesta para ello.
 
  - media= La media se calcula como un promedio, siendo la suma y la division de la cantidad de datos.
        
      ![media](https://github.com/danielGomez1703/ARSW-OODesign/blob/master/resources/media.JPG)
        
  - LOC = esta forma cuenta e imprime unicamente las lineas de codigo, ignorando comentarios y espacios
       
      ![desviacion](https://github.com/danielGomez1703/ARSW-OODesign/blob/master/resources/desviacion.JPG)

## requsites
    -java version 1.7+
    -maven installed

## Installation
 ```sh
$ git pull https://github.com/danielGomez1703/AREP-Spark
$ cd AREP-Spark
$ mvn package
```

# MANUAL

una vez instalado el programa debe ejecutar el programa con la ruta del archivo que contengan los datos 
 
    java -cp -cp target/classes:target/dependency/* co.edu.eci.arep.lab1.sparkweb.App
	
para ingresar a la aplciacion web en heroku acceda por medio del link

    [despliegue en heroku](https://quiet-temple-36803.herokuapp.com/inputdata)

 
# DESPLEIGUE
esta es la imagen del inicio, donde el ususario va a ingresar los datos a promediar
![Inicio](https://github.com/danielGomez1703/AREP-Spark/blob/master/resources/inicio.JPG)

una vez entregados los valores se daran a conocer lso resultados de la media y de la desviacion estandar.
![resultado](https://github.com/danielGomez1703/AREP-Spark/blob/master/resources/resultado.JPG)

    
## Modelo
![Modelo](https://github.com/danielGomez1703/ARSW-OODesign/blob/master/resources/Model.JPG)

    Este modelo describe la interaccion del programa a nivel de sus componentes. en el modelo destacan **calculator** y el **LinkedList**
    el contendor es un implementacion propia de una lista en base a la implementacion LIST de java.
    CalculatorMain tiene la clase anonima de calculator, en el codigo podemos ver como se hace mediante una funcion lambda y tambien mediante una clase anonima.
    
	En este caso el file reader es el navegador y spark, los cuales guardan los datos y los recibe en el request del formulario
    

## Pruebas Unitarias

 estas son las pruebas que ejecuta la clase de pruebas del Programa. datos dados en la guia de trabajo con sus resultados esperados  
 ````
     private final String Ftest1 = "1,2,3,4,5,6,7";
     private final String Ftest2 = "2,4,6,8,10,20";
     
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
````
## Reporte Pruebas
El estado de actual de las pruebas son correctas las 2 que se hacen.

![pruebasInp](https://github.com/danielGomez1703/ARSW-OODesign/blob/master/resources/BuildSuccesTest.JPG)



Los resultados de las pruebas son los esperados con los de la guia.

![pruebasResult](https://github.com/danielGomez1703/ARSW-OODesign/blob/master/resources/ResulTest.JPG)

## Descripion
 Este programa consiste en una claculadora en principio con dos funciones estadisticas base como:
 
    -Media
    -Desviacion Estandar
 
 El contenedor del programa es una lista encadenada implmentada con base en las interfaces de LIST de java.
 
 como origen el programa hace la lectura del archivo y guarda en los contendores la informacion requerida para los operaciones que desea.
 depues de obtener los datos, procede directamente a realizar las operaciones estadisticas ya mencionadas. 
 
 el programa se compone de dos objetos clave la cual es la calculadora y la lista encadenada LINKEDLIST.
 
## Reporte

para consultar el reporte debe acceder al link 

[reporte de laboratorio](https://github.com/danielGomez1703/ARSW-OODesign/blob/master/resources/Design_OO.pdf)

## Author
    Daniel Felipe Gomez Suarez [danielgomez1703](https://github.com/danielGomez1703)
    
## BUILT IN
   Proyecto construido en [Maven](https://maven.apache.org/)
## License
----
para consultar su licencia vaya al link 
[leer aqui](https://github.com/danielGomez1703/ARSW-Primer/blob/master/LICENSE.txt)