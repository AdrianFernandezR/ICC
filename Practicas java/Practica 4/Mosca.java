public class Mosca{

    public static void main(String [] args){

	String cadenaOriginal= "Una mosca parada en la pared, en la pared              ";
	String rojo= " pintada de rojo";

	System.out.println("Cadena orgininal: " + "\"" + cadenaOriginal + "\"");
	System.out.println("Longitud de cadena: " + cadenaOriginal.length() + " caracteres");


	//nueva cadena
	String cadenaNueva= (cadenaOriginal.trim());
	System.out.println ("La cadena " + "\"" + cadenaNueva + "\"" + " tiene "  + cadenaNueva.length() + " caracteres");

	//Frases
	System.out.println("#Frase 1:" + cadenaOriginal);
	System.out.println("#Frase 2:" + cadenaNueva.toUpperCase());
	System.out.println("#Frase 3:"+ cadenaNueva.replace("a","i").replace ("o","i").replace("u","i").replace("e","i").toUpperCase());
	System.out.println("#Frase 4:"+ cadenaNueva.replace("a","u").replace ("o","u").replace("u","u").replace("e","u").toUpperCase());
	System.out.println(cadenaNueva. replace("mosca","moscota".toUpperCase()));
	System.out.println(cadenaNueva + rojo.toUpperCase());


    }



}
