import java.util.Random;

public class Tablero{

	private Celda [] tab;

    Bomba bombon = new Bomba();
	Random random= new Random();
	CeldaAbierta abierta= new CeldaAbierta();
    

    public Tablero(){
		
		this.tab= new Celda [64];
		
		for(int i=0; i<10; i++){
			
			int b= random.nextInt(10);
			tab [b]= new CeldaBomba(bombon);
		}
	}

    
	public Tablero(int celdas, int cantBombas) throws RuntimeException{

		if(celdas > 7){
			
			this.tab= new Celda[celdas];
			
			for(int i=0; i<tab.length; i++){
				
				int bomb= random.nextInt(cantBombas);
				tab[bomb]= new CeldaBomba(bombon);
				
				}
	       
		} else{

			throw new RuntimeException("Tableros mayores a 8*8");
		}
	}

	public void abrirCelda(int elegida){
		if(tab[elegida]!=null){

			
		    if(tab[elegida].getCont().equals(bombon)){
		    	tab[elegida].getCont().revisarContenido();
		    }
			
			if(tab[elegida].getCont().equals(abierta)){
			System.out.println("Esta celda ya se ha revisado, intenta con otra");

		}

		}
		if (tab[elegida]==null){

			System.out.println("Celda libre de minas, sigue asi!");
			tab[elegida]= new Celda(abierta);
		}

		
	}

	public Celda[] getTamTab(){

		return tab;
	}

}
