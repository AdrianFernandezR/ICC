/**
 * ....
 * @author ....
 * @version ...
 */
public class Transaccion {
    public static void main(String[] pps) {
	//Declara las dos cuentas y demas variables

    	Cuenta cuenta1 = new Cuenta (3160,5000);
    	Cuenta cuenta2 = new Cuenta (3508,3000);

    	System.out.println ("Se creo la cuenta " + cuenta1.obtenerNumCuenta() + " con un saldo de " + cuenta1.obtenerDisponible() + "$");
        System.out.println ("Se creo la cuenta " + cuenta2.obtenerNumCuenta() + " con un saldo de " + cuenta2.obtenerDisponible() + "$");



	//Toma dinero de una cuenta

        cuenta1.retirar(1500);

        System.out.println ("Se realizara un deposito de 1,500$ la cuenta " + cuenta1.obtenerNumCuenta() + " hacia la cuenta " + cuenta2.obtenerNumCuenta());


	//Deposita en la otra cuenta

         cuenta2.depositar(1500);

	// Muestra el saldo en ambas cuentas

         System.out.println ("El deposito se ha realizado de manera correcta\nLa cuenta " + cuenta1.obtenerNumCuenta() + " tiene un saldo de " + cuenta1.obtenerDisponible());
         System.out.println ("La cuenta " + cuenta2.obtenerNumCuenta() + " tiene un saldo de " + cuenta2.obtenerDisponible());


    }
}