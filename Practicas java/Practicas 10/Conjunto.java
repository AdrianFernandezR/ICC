/**
 *  
 *  Clase que implementa la representacion de un Conjunto de numeros enteros
 *  cuyo valor esta entre 1 y 100.
 *
 *  <p>El Conjunto se representa como un arreglo de valores booleanos, donde si elementos[i]
 *  tiene valor true, significa que el entero i esta en el conjunto y si es false
 *  significa que el entero i no esta en el conjunto.
 *
 *  @author Nombre del autor de la clase
 *
 */
public class Conjunto {

    private boolean [] elementos;
    
    /*
     *  Arreglo que nos sirve para determinar que elementos
     *  pertenecen al Conjunto.
     */
    
    /**
     *  Constructor que inicializa un Conjunto vacio.
     *  Es decir, un Conjunto sin ningun elemento.
     */
    public Conjunto() {

        elementos= new boolean [100];

    }
    
    /**
     *  Metodo que inicializa un Conjunto que contenga
     *  los enteros pasados como parametro.
     *  El arreglo pasado como parametro contiene, solamente,
     *  enteros cuyo valor esta entre 1 y 100.
     *  @param elementosIniciales Elementos que debera de contener el nuevo Conjunto.
     */
    public Conjunto(int[] elementosIniciales){

        elementos= new boolean [100];
        for(int i=0; i< elementosIniciales.length; i++){

            if (elementosIniciales[i]>0 && elementosIniciales[i]<101){

                elementos[elementosIniciales[i]]= true;
            }

        }

    }
    
    /**
     *  Devuelve un Conjunto que contiene la union de el Conjunto
     *  que manda a llamar al metodo con el Conjunto c.
     *  @param c Conjunto que se va a unir.
     *  @return Nuevo Conjunto resultado de la union de ambos Conjuntos.
     */
    public Conjunto union(Conjunto c){

        Conjunto union= new Conjunto();
        for(int i=1; i<101; i++){

            if (pertenece2(i) || c.pertenece2(i)){

                union.introduceMenos(i);
            }
        } return union;
     
    }
    
    /**
     *  Devuelve un Conjunto que contiene la interseccion de el Conjunto
     *  que manda a llamar al metodo con el Conjunto c.
     *  @param c Conjunto que se va a unir.
     *  @return Nuevo Conjunto resultado de la interseccion de ambos Conjuntos.
     */
    public Conjunto interseccion(Conjunto c){

     Conjunto interseccion = new Conjunto();
        for(int i = 1; i < 101; i++){
            if (pertenece2(i) && c.pertenece2(i)){
            interseccion.introduceMenos(i);
            }
        }
        return interseccion;


    }
    
    /**
     *  Devuelve un Conjunto resultado de la diferencia entre el Conjunto
     *  que llama al metodo y el Conjunto c.
     *  @param c Conjunto cuyos elementos seran restados al Conjunto que llama al metodo.
     *  @return Resultado de la diferencia entre ambos Conjuntos.
     */
    public Conjunto diferencia(Conjunto c){

        Conjunto diferencia= new Conjunto();
        for (int i= 1; i<101; i++){

            if (pertenece2(i) && !c.pertenece2(i)){

                diferencia.introduceMenos(i);
            }
        }
        return diferencia;


    }
    

   private boolean pertenece2(int elemento){


        if(elementos[elemento-1]){
        return true;
            }else{

                return false;
        }
    }


    /**
     *  Determina si el elemento pasado como parametro pertenece o no
     *  al Conjunto.
     *  @param elemento Elemento que sera buscado dentro del Conjunto.
     *  @return true - Si el elemento esta en el Conjunto. false - En otro caso.
     */
    public boolean pertenece(int elemento){

        int pert= elemento;

        for(int i=0; i<101; i++){

            if(i == pert){

                return true;
            }
        } return false;
    }
    
    /**
     *  Metodo que introduce un nuevo elemento al Conjunto.
     *  @param elemento Elemento que sera introducido al Conjunto.
     */
    public void introduce(int elemento){

        if (elemento<100 && elemento>1){

            elementos[elemento]=true;        
        } else if(elemento<0){System.out.println("No se puede agregar el elemento"+ elemento);}

    }    


    private void introduceMenos(int elemento){

        if (elemento<101 && elemento>0){

            elementos[elemento-1]=true;        
        } else{new Error ("Indice invalido");}

    }   
    
    /**
     *  Metodo que elimina un elemento del Conjunto.
     *  @param elemento Elemento que sera eliminado del Conjunto.
     */
    public void elimina(int elemento){

        if (elemento>0 && elemento<101){

            elementos[elemento-1]= false;            
        }else{

            new Error ("Indice invalido");
        }
    }    
    
    /**
     *  Metodo que determina si dos Conjuntos son o no iguales.
     *  @param c Conjunto que sera comparado.
     *  @return true - Si son iguales. false - En otro caso.
     */
    public boolean equals(Conjunto c){

        for (int i=0; i<100; i++){
            if (elementos[i] != c.elementos[i]){
                     return false;
         }
     }
     return true;
              
    }
    
    
    /**
     *  Metodo que devuelve la representacion en cadena del Conjunto.
     *  La cadena resultante tiene un formato como el que sigue:
     *  {4, 6, 80, 99}
     *  @return Representacion en cadena del Conjunto.
     */
    public String toString(){

        String bracketI= "{";
        String bracketF= "}";
        for (int i=0; i<100; i++){

            if (elementos[i]){

                bracketI= bracketI + i+ ",";
            }
        }
        String sucia= bracketI;
        String limpia= sucia.substring(0, sucia.length()-1);
        if (limpia.length()>=1){
        return limpia + bracketF;
        }else { return sucia + bracketF;} 

    }
    
}
