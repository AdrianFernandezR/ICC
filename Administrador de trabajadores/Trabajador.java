public class Trabajador{
    
    protected String numTrabajador;
    protected double sueldo;
    

    public Trabajador(String numTrabajador, double sueldo){
		this.numTrabajador= numTrabajador;
		this.sueldo = sueldo;
    }
    
    public String toString(){

		return "Numero de Trabajador: " + numTrabajador + "\n" + "Sueldo:" + sueldo;
    }
}                                                                                      

