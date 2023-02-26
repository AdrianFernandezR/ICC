
/**
 * Clase para manejar cuentas de debito
 * @author Adrian Felipe Fernandez Romero
 * @version 1ra edicion
 */
public class Cuenta {
    //Atributos

    private double saldo;
    private long numCuenta;

    /**
     * Crea una cuenta asociada a su saldo
     * @param nCta numero de cuenta
     * @param saldo saldo inicial 
     */

    public Cuenta(long nCta, double disponibleInicial) {

        if (disponibleInicial>=2500){

            saldo= disponibleInicial;
            numCuenta= nCta;
        } else { System.out.println ("No se puede crear cuenta " + nCta + " con $" + disponibleInicial +", el minimo es $2,500");}

    }

    public Cuenta (){

        saldo= 2500;
        numCuenta= 3160;



    }

    /**
    *Retira una cantidad de dinero en la cuenta 
    *@param monto cantidad que se desea retirar
    */
 
    public void retirar(double monto) { 

     if (monto < 0){

        System.out.println ("Solo se pueden hacer retiros positivos");
     }
     else{


      if (monto==0){

        System.out.println ("Solo se pueden hacer retiros de cantidades mayores a 0");

      }

       if (saldo == 0 || monto > saldo){

      System.out.println ("Los fondos son insuficientes para el retiro");   
      }

      else {

        saldo-=monto;
      }
  }

    }

    /**
    *Deposita una cantidad de dinero en la cuenta
    *@param monto cantidad que se desea depositar
    *
    */
 
    
    public void depositar(double monto) {

        if (monto >= 0) {

            saldo=saldo+monto;
        }
        if (monto < 0){
            System.out.println ("Los depositos deben ser positivos");
        } 


 
    }

    /**
    *Devuelve el disponible de la cuenta
    *@return regresa el saldo de la cuenta
    *
    */

  public double obtenerDisponible() {

    return saldo;

  }
  /**
  *Devuelve el número de identificación de la cuenta bancaria
  *@return regrese el numero de cuenta 
  *
  */
 

    public long obtenerNumCuenta() {

        return numCuenta;

    } 
}
