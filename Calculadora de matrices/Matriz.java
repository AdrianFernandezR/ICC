public class Matriz {

	private double [][] mat;

	public Matriz(double[][] m){

		mat= new double [m.length][];
		for(int i=0; i<mat.length; i++){
			mat[i]= new double [m[i].length];
			for(int j=0; j<mat[i].length; j++){
				mat [i][j]= m[i][j];

			}
		}
	}


	public Matriz sumar(Matriz m){

		if (mat.length == m.mat.length && mat[0].length == m.mat[0].length){

			double [][] aux= new double[mat.length] [mat[0].length];
			 for (int i= 0; i < mat.length ; i++ ) {

				 for (int j= 0; j< mat[0].length ; j++ ) {

					aux [i][j]= mat[i][j]+m.mat[i][j];
	
				} 
			
			} 
		
				Matriz suma= new Matriz(aux);
				return suma;

		} else { 

			    return null; } 
	 
 
    }

  public Matriz multiplicacion (Matriz m){

  	if (mat[0].length != m.mat.length){

  		System.out.println ("No se puede realizar la multiplicacion");
  	}

  	double [][] productos= new double [mat.length] [m.mat[0].length];
  	Matriz producto= new Matriz (productos);
  	for(int i= 0; i<producto.mat.length; i++){

  			for(int j= 0; j<producto.mat[0].length; j++){

  				for(int k=0; k<mat[0].length; k++){

  					producto.mat[i][j]+= (mat[i][k]*m.mat[k][j]);
  				}
  			}
  		}

  		return producto;
 	}



  public Matriz multiplicacionEscalar(double r){

  		double [][] aux= new double [mat.length][mat[0].length];
  		for(int i=0; i< aux.length; i++){
  			for(int j= 0; j<aux[0].length; j++){
  				aux[i][j]= mat[i][j] * r;
  			}
  		}
  		Matriz mE= new Matriz(aux);
  		return mE;
	} 

	public Matriz traspuesta(){

		double [][] aux= new double [mat[0].length][mat.length];
		for(int i=0; i<mat.length; i++){

			for(int j=0; j<mat[0].length; j++){

				aux[j][i]= mat[i][j];
			}
		}
		return new Matriz(aux);
	}

	private double [][] filaPivote(int fila, double [][] mat2){

		double pivote= mat2[fila][fila];
		for (int i=fila; i<mat2.length; i++){

			mat2[fila][i]= mat2[fila][i]/pivote;
		}
		return mat2;
	}

	private void restarFila( int pivote, int fila,double [][] mat2){

		double constante= mat2[pivote][fila];
		for (int i= pivote; i< mat2.length; i++){

			mat2[i][fila]= mat2[i][fila] - constante*mat2[i][pivote];

		}
	}


	public void restarFilaInferior(int pivote,int fila, double [][] mat2){

		double constante= mat2[fila][pivote];
		for(int i=pivote; i<mat2[0].length; i++){

			mat2[fila][i]= mat2[fila][i]-constante*mat2[i][fila];
		}
	}

	private void eliminaColumna(int fila, double [][] mat2){

		this.pivotar(fila, mat2);
		for(int i= fila+1;i<mat2[0].length; i++){

			this.restarFila(fila, i, mat2);

		}
	}

	private void pivotar(int fila, double[][] mat2){

		double pivote= mat2[fila][fila];
		for(int i= fila; i< mat2.length; i++){
			mat2[i][fila]=mat2[i][fila]/pivote;
		}
	} 

	private void eliminaColumnaSuperior(int pivote, double [][] mat2){

		this.pivotar(pivote, mat2);
		for(int i= pivote-1; i>=0; i--){

			this.restarFila(pivote, i, mat2);

		}
	}

	private void diagonalSuperior(double[][]mat2){

		for(int i=0 ;i< mat2.length-1; i++){

			this.eliminaColumna(i, mat2);
		}
		this.pivotar(mat2.length-1, mat2);
	}

	private void diagonalInferior(double [][] mat2){

		for(int i= mat2.length-1; i>=0 ;i--){

			this.eliminaColumnaSuperior(i, mat2);
		}

	}

	public double [] gaussJordan(){

		if(this.mat[0].length != this.mat.length+1){

			System.out.println("No se puede realizar la operacion");
			double[] resultado= new double[0];
			return resultado;
		}else{
			double [][] aux= new double[this.mat.length][this.mat[0].length];
			for(int i=0; i< this.mat.length; i++){
				for(int j=0; j<this.mat[0].length; j++){
					aux[i][j]= this.mat[i][j];
				}
			}
			this.diagonalSuperior(aux);
			this.diagonalInferior(aux);

			double [] resultado= new double [this.mat.length];

			for(int i=0; i<resultado.length; i++){
				resultado[i]= aux[i][aux.length];
			}
			return resultado;
		}
	}

	public String toString(){

		String s= "";
		for(int i= 0; i< this.mat.length; i++){

			for(int j=0; j< this.mat[0].length; j++){

				s += this.mat[i][j] + " ";
			}
			s+="\n";

		}
		return s;
	}

	public Matriz asignarMatriz( Matriz m){



		double [][] clon= new double[m.mat.length] [m.mat[0].length];
	 	for (int i= 0; i < m.mat.length ; i++ ) {

			for (int j= 0; j< m.mat[0].length ; j++ ) {

					clon [i][j]= m.mat[i][j];
	
			} 
			
		} 
		
		Matriz clonada= new Matriz(clon);
		m= clonada;
		return m;

	}

    public double determinante(){

    	double det;
    	if(mat.length==2){
        	det=(mat[0][0]*mat[1][1]) - (mat[1][0]*mat[0][1]);
        	return det;
    	}
    	double suma=0;
    	for(int i=0; i<mat.length; i++){
      		double[][] nm = new double[mat.length-1][mat.length-1];
        		for(int j=0; j<mat.length; j++){
            		if(j!=i){
                		for(int k=1; k<mat.length; k++){
                  			int indice=-1;
                  			if(j<i){
                    			indice=j;
                  			}else{ if(j>i)
                    			indice=j-1;
                  		}
                  		nm[indice][k-1] = mat[j][k];
                }
            }
        }
        Matriz deter = new Matriz(nm);
        	if(i%2==0){
          		suma += mat[i][0] * deter.determinante();
        	}else{
         		 suma -= mat[i][0] * deter.determinante();
        }
    }
    return suma;
  }
	








} 





