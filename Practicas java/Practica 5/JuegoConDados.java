import java.util.Scanner;
public class JuegoConDados{

    public static void main (String [] arg){

	Dado dado= new Dado();
	Scanner scan= new Scanner (System.in);
	//Saludo

	System.out.println ("Hola, ¿Como te llamas?");
	String Nombre= scan.nextLine();
	System.out.println ("Mucho gusto " + Nombre + ", ¡vamos a jugar!");

	//Reglas
	System.out.println ("En este juego se usan 2 dados,  si la suma de estos es 7 u 11, ¡Ganaste!.Pero si la suma es 2, 3 o 12 pierdes");
	System.out.println("Si la suma es un numero entre el 4 y el 10 (menos el 7) tendras que tirar de nuevo los dados: si la nueva suma de los dados es igual a la anterior o es 7 u 11 ganas");
	System.out.println ("¿Estas listo?");
	String ans= scan.nextLine();
	System.out.println("Venga, es mas sencillo de lo que parece, ¡vamos a jugar!");

	//lanzar
        int Dado1= dado.lanzar();
	int Dado2= dado.lanzar();
	int Suma= Dado1+Dado2;

	System.out.println ("Salio " + Dado1 + " y " + Dado2 + ", la suma es " + Suma);
	if (Suma== 7){System.out.println("ganaste");}
	else if (Suma== 11) {System.out.println ("ganaste");}
	else if (Suma== 2) {System.out.println("perdiste");}
	else if (Suma== 3){System.out.println("perdiste");}
	else if (Suma== 12){System.out.println("perdedor");}
	else if (Suma== 4 || Suma== 5 || Suma== 6 || Suma== 8 || Suma== 9|| Suma== 10){System.out.println("Tienes que volver a tirar");}
	if(Suma== 4 || Suma== 5 || Suma== 6 || Suma== 8 || Suma== 9|| Suma== 10){

	//Nuevo tiro
	int Dadito1= dado.lanzar();
	int Dadito2= dado.lanzar();
	int SumaDaditos= Dadito1+Dadito2;

	System.out.println ("Salio " + Dadito1 + " y " + Dadito2 + ", su suma es " + SumaDaditos);
    if (SumaDaditos==Suma){System.out.println("Salio el mismo que la tirada anterior, ¡Ganaste!");}
	else if (SumaDaditos== 7 || SumaDaditos== 11) {System.out.println("Ganaste");}
	else if(SumaDaditos== 2 ||SumaDaditos== 3 ||SumaDaditos== 12 || SumaDaditos!=Suma){System.out.println("Perdiste");};}

	
	

	
        
	
	



    }




}
