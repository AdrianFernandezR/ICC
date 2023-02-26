public abstract class Trabajador{

	protected String numTrabajador;
	protected double sueldo;
    protected Materia m1;
    protected Materia m2;

	public Trabajador(String numTrabajador, double sueldo){

		this.numTrabajador= numTrabajador;
		this.sueldo= sueldo;

	}

    public void asignarMateria(Materia b){
		
		if(m1 != null){
        	m2 = b;
        }
        else{
        	
        	m1 = b;
    	}
    }
    
	public String getNumUsuario(){

		return numTrabajador;
	}

	public double getSueldo(){

		return sueldo;
	}

	public abstract String toString();

}