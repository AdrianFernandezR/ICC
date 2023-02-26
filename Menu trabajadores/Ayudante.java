public class Ayudante extends Trabajador{

	private String grado;
	private double promedio;

	public Ayudante(String numAyudante, String grado, double promedio){

		super(numAyudante, 2500);
		this.grado=grado;
		this.promedio=promedio;

	}


    public double obtenerPromedio(){
		
		return promedio;
    }


	
	public String toString(){

		return "Numero de Ayudante: " + numTrabajador + "\n" + "Sueldo:" + sueldo + "\nGrado:" + grado +"\nPromedio: "+ promedio;
	}

}