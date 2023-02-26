import java.util.Scanner;

public class Edad {

    public static void main (String [] args){
	Scanner scan= new Scanner (System.in);

	//Variables
	System.out.println ("Hola, ¿Cual es tu nombre?");
	String nombre= scan.nextLine();

	//Saludo y preguntas

	System.out.println ("Mucho gusto " + nombre + "\n¿Me podrias decir que dia naciste?");
	int bDay= scan.nextInt();
	if (31<bDay || bDay<=0) {System.out.println("No creo que ese dia exista");}
	else {
		System.out.println("¿De que mes? Ponlo de forma numerica, sin colocar 0"); 
		int bMnth= scan.nextInt();
		if (bMnth>12 || bMnth<=0) {System.out.println ("El año solo tiene 12 meses");}
		else { 
			System.out.println ("¿De que año?");
			int bYear= scan.nextInt ();
			Fecha cumple = new Fecha (bDay, bMnth, bYear);
			if (bYear>2018){System.out.println ("Aun no llegamos a ese año");}
			else{ System.out.println ("Entonces eres del " + cumple + " ¡la fecha es correcta!");}
			
			//Edad
			Fecha hoy= new Fecha();
			int actYear= hoy.obtenerAnio ();
			int year= cumple.obtenerAnio ();
			int actMnth= hoy.obtenerMes();
			int mesCumple= cumple.obtenerMes();
			int diaCumple= cumple.obtenerDia();
			int diaHoy= hoy.obtenerDia();		
			int yearLess= (actYear-1);
			int edad1= (yearLess - year);
			int edad2= (actYear - year);
			if (actMnth>bMnth)  {
			   System.out.println ("Entonces tienes " + edad2+ " años");}
			else if (actMnth<bMnth){ 
			  System.out.println ("Entonces tienes " + edad1 + " años");}
			     else if (actMnth==bMnth &&  diaHoy>diaCumple){
			     	System.out.println ("Entonces tienes " + edad2 + " años");}
			     	else if  (actMnth==bMnth &&  diaHoy<diaCumple){
			     		System.out.println ("Entonces tienes " + edad1 + " años");}
			     		else if (actMnth==bMnth && diaHoy==diaCumple){System.out.println("Entonces tienes " + edad2 + " de edad, ¡Y los estas cumpliendo hoy!");}


			int diasHoy= hoy.diasTranscurridos ();
			int yearL= actYear+1;
			if (bMnth==1){
				Fecha nxtB = new Fecha (diaCumple, bMnth, yearL);
				int daysLeft= nxtB.diasTranscurridos();
				int restYear= (daysLeft-diasHoy);
				int mEnero=31;
				int restYearEne= (restYear-32);
				System.out.println("Faltan " + restYearEne +" dias para tu cumpleaños");}
		     else if (bMnth<actMnth) {
		     	Fecha nxtB = new Fecha (diaCumple, bMnth, yearL);
				int daysLeft= nxtB.diasTranscurridos();
				int restYear= (daysLeft-diasHoy);
				System.out.println ("Faltan " + restYear + " dias para tu cumpleaños");}
		          else {
					Fecha nxtB = new Fecha (diaCumple, bMnth, actYear);
				    int daysLeft= nxtB.diasTranscurridos();
				    int restYear= (daysLeft-diasHoy);
				    System.out.println ("Faltan " + restYear + " dias para tu cumpleaños");
				   if (restYear==0) {System.out.println ("¡Porque hoy es tu cumpleaños!");}}
				
				    if (edad1<17 ||edad2<17){System.out.println ("Eres menor de edad");}
				    else if ((edad1>=18 && edad1<30) ||(edad2>=18 && edad2<30)) {System.out.println ("Eres un adulto");}
				         else if (edad1>=30 || edad2>=30){System.out.println("Eres un adulto mayor");}}
				    



			
		









			  }

			}
		}
	







