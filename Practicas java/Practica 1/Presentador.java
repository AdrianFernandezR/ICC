import java.util.Scanner;

public class Presentador{

    public static void main(String [] args){

	String nombre = "Adrian".toUpperCase();
	String Fac = "Facultad de Ciencias".toUpperCase();
	String Carr = " La carrera de Ciencias de la computacion".toUpperCase();
	int edad = 18;
	Scanner scan= new Scanner (System.in);

	//Saludo
	System.out.println ("Hola, ¿Cual es tu nombre?".toUpperCase());
	String s= scan.nextLine ();
	System.out.print ("Mucho gusto ".toUpperCase() + s.toUpperCase());
	System.out.print (", yo soy ".toUpperCase());
	System.out.println (nombre.toUpperCase());

	//Edad 
	System.out.println ("¿Que edad tienes?".toUpperCase());
	String q= scan.nextLine();
	System.out.println ("No creo que tengas ".toUpperCase() + q + ", te ves mucho mas joven".toUpperCase());
	System.out.print ("yo tengo ".toUpperCase());
	System.out.print(edad);
	System.out.println (" años".toUpperCase());

	//Estudio
	System.out.println ("¿Donde estudias?".toUpperCase());
	String a= scan.nextLine ();
       	System.out.println ("He escuchando que los estudiantes de ".toUpperCase() + a.toUpperCase() + " tienen un gran nivel".toUpperCase());
	System.out.println ("¿Que carrera estas estudiando?".toUpperCase());
	String m= scan.nextLine ();
	System.out.println (m.toUpperCase() + " suena como una carrera muy demandante".toUpperCase());
	System.out.print ("Yo estudio en la ".toUpperCase());
	System.out.print (Fac);
	System.out.println (Carr);
      
;
	    
	
	
	
	
	   
	    }





}
