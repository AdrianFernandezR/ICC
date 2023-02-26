  import java.io.*;

  public class DatosDeJugador implements Serializable{
	
  private String nombre;
  private int minas;
  private int celdas;

	

  
  
  public DatosDeJugador(String nombre, int mina, int casilla){
    
    super();
    this.nombre = nombre;
    this.minas = minas;
    this.celdas = celdas;
  
  }

  public String getNombre(){
  
    return nombre;
  }
  
  public int getMina(){
  
    return minas;
  }
  
  public int getTotalCeldas(){
    
    return celdas*celdas;
  }
  
  public String toString(){
    
    return( "Datos Del jugador:\nUsername: "+ getNombre() + "\nCantidad de celdas:" + getTotalCeldas() + " Total de minas en partida:" + getMina());
  
  }

}