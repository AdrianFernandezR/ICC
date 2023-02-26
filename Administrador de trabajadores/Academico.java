public class Academico extends Trabajador{
                                                                                                                                     
    protected Materia m1;
    protected Materia m2;
    protected String grado;

                                                                                                                                     
    public Academico(String numTrabajador,double sueldo,String grado){
		
		super(numTrabajador,sueldo);
		this.grado = grado;

    }

   public String toString(){

        return "Numero de Academico: " + numTrabajador + "\n" + "Sueldo:" + sueldo
        		+ "\n" + "Primera materia: " + m1 + "\n" + "Segunda Materia: " + m2;
    }
}
