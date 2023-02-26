public class Profesor extends Trabajador{

	private String grado;
	private Ayudante [] aspirantes;
	protected Materia mat;

	
	public Profesor(String numProfesor, String grado, Materia mat){

		super(numProfesor, 3000);
		this.grado=grado;
        this.mat=mat;
		aspirantes= new Ayudante[10];	
	}

	
	public String toString(){

		return "Cedula: " + numTrabajador + "\n" + "Sueldo:" + sueldo + "\nNivel de estudio:" + grado + "Materia:" + mat;
	}
    

    public void asignarAyudante(Ayudante asp){

    	aspirantes[0].asignarMateria(mat);
    }

    public void asignarAspirante(Ayudante aspirante){
		
		for(int i = 0; i<aspirantes.length; i++){
	    	
	    	if(aspirantes[i] == null){
				
				aspirantes[i] = aspirante;
	    	}
		}
    }

    public void quickSort(Ayudante[] aspirantes, int inicio, int fin){
		this.aspirantes=aspirantes;
        double pivote= aspirantes[inicio].obtenerPromedio();
        int elemIzq= inicio+1;
        int elemDer= fin;
        while(elemIzq<=elemDer){

        	while(elemIzq<=fin && aspirantes[elemIzq].obtenerPromedio()<pivote){
            	elemIzq++;
            	}
                        
            while(elemDer>inicio && aspirantes[elemDer].obtenerPromedio()>=pivote){
                                
            	elemDer--;
                }
                        
            if(elemIzq<elemDer){
                                
            	Ayudante t=aspirantes[elemIzq];
            	aspirantes[elemIzq]=aspirantes[elemDer];
            	aspirantes[elemDer]=t;
            	}
            }
                
        if(elemDer>inicio){
                Ayudante t=aspirantes[inicio];
                aspirantes[inicio]=aspirantes[elemDer];
                aspirantes[elemDer]=t;
           }
     	    quickSort(aspirantes, inicio, elemDer-1);
  	        quickSort(aspirantes, elemDer+1, fin);
    }

}

 