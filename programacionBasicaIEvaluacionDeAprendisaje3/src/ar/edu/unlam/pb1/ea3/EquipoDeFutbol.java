package ar.edu.unlam.pb1.ea3;


import java.util.Scanner;

public class EquipoDeFutbol{
	private String nombre;
	private Jugador equipo[];
	private final int CANTIDAD_MAXIMA_DE_JUGADORES;
	private int cantidadActualDeJugadores;
	
	public EquipoDeFutbol(String nombre){
		this.nombre=nombre;
		this.CANTIDAD_MAXIMA_DE_JUGADORES=23;
		this.equipo=new Jugador[CANTIDAD_MAXIMA_DE_JUGADORES];
		cantidadActualDeJugadores=0;
	}
	
	public boolean agregarJugador(Jugador jugador){
        boolean resultado = true;
        for (int i= 0;i<cantidadActualDeJugadores;i++){
        	if((equipo[i].getNombre()).equals(jugador.getNombre())){
        		equipo[cantidadActualDeJugadores]=null;
        		resultado = false;       
            	}
        }
        	if((cantidadActualDeJugadores<equipo.length)&&(resultado==true)){
        		equipo[cantidadActualDeJugadores++] = jugador;
        			resultado = true;   
        	}else {
        		resultado=false;
        		}
        return resultado;
	}
  
	public boolean cambiarJugador(Jugador saliente, Jugador entrante){
		for(int i=0; i<cantidadActualDeJugadores; i++){
			if(equipo[i].getNombre().equals(saliente.getNombre())){
				equipo[i]=null;
				equipo[i]=entrante;
				return true;
			}
		}
		return false;
	}
	
	public Jugador[] getJugadores(){
		return this.equipo;
	}
	
	public void setJugadores(Jugador[] equipo){
		this.equipo=equipo;
	}

	public String toString(){
		String plantel="";
		for(int i=0; i<cantidadActualDeJugadores;i++){
			plantel+="["+ i +"]" + equipo[i].getNumero()+ "-" + equipo[i].getNombre() + "-" + equipo[i].getPrecio() + "\n";
		}
		return plantel;
	}
	
	public Jugador buscar(int numero){
		Jugador resultado=null;	
		for(int i=0; i<cantidadActualDeJugadores; i++){
				if(equipo[i].getNumero()==numero){
				resultado=equipo[i];
			}
			}
			return resultado;
	}
	
	public Jugador buscar(String nombre){
		Jugador resultado=null;
		for(int i=0; i<cantidadActualDeJugadores; i++){
			if(equipo[i].getNombre().equals(nombre)){
				resultado=equipo[i];	
			}
		}
		return resultado;
	}
	
	public double calcularElValorDelEquipo(){ 
		double valorEquipo=0.0;
		for(int i=0; i < cantidadActualDeJugadores; i++) {
			valorEquipo+=equipo[i].getPrecio();
		}
		return valorEquipo;
	}
	
	public double calcularElPrecioPromedio(){
			double precioPromedio=(calcularElValorDelEquipo()/cantidadActualDeJugadores);
		return precioPromedio;
	}	




}

