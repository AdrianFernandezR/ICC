import java.util.Scanner;

public class Psicologo {

    public static void main(String [] Args){

	Scanner scan= new Scanner (System.in);

	//Saludo
	System.out.println ("Bienvenido al consultorio, ¿Cual es su nombre?");
	String paciente= scan.nextLine();
	System.out.println ("Mucho gusto " + paciente + ", ¿Cual es su problema?");
	String problema= scan.nextLine();
	System.out.println ("MMM... ya veo\nY digame...\n¿Por que dice que " + "\"" + problema + "\""+ "?");

	String respuestaP= scan.nextLine();
	System.out.println("Muy interesante, hablaremos de ello con mas detalle en la siguiente sesion");
	



    }




}
