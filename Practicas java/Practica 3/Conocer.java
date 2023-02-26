public class Conocer {
    
	public static void main(String[] args) {
		int resultado1;
		double resultado2=0;

		//1
		resultado1 = 46/9;
		System.out.println ("El resultado es " + resultado1);
		//2
		resultado1 = 46 % 9 + 4 * 4 - 2;
		System.out.println("El siguiente resultado es " + resultado1);
		//3
		resultado1 = 45 + 43 % 5 * (23 * 3 % 2);
		System.out.println ("El tercer resultado es " + resultado1);
		//4
		resultado2 = 4 + resultado2 * resultado2 + 4;
		System.out.println ("El cuarto resultado es " + resultado2);
		//5
		resultado2 += 1.5* 3 + (++resultado1);
		System.out.println ("El quinto resultado es " + resultado2);
		//6
		resultado2 = 1.5 * 3 + resultado1++;
		System.out.println ("El ultimo resultado es " + resultado2);
	}
}
