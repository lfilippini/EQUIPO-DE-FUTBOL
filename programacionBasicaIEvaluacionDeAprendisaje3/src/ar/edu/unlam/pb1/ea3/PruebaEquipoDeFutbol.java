package ar.edu.unlam.pb1.ea3;

import java.util.Scanner;

public class PruebaEquipoDeFutbol {
static Scanner teclado = new Scanner(System.in);	

	public static void main(String[] args) {
				
			int numeroIngresado = 0;
			String nombre = "";
			int numero = 0;
			double precio = 0.0;			
			String nombreFutbol = "Unlam"; 
			
			
			EquipoDeFutbol Unlam;
			Unlam = new EquipoDeFutbol(nombreFutbol);
			
			Scanner teclado = new Scanner (System.in);
			
				
				while (numeroIngresado != 9) {
				       do {
				       mostrarMenu();
				       numeroIngresado = seleccionarOpcion();
					} while((numeroIngresado < 1) || (numeroIngresado > 6 && numeroIngresado != 9));				       			       						
				       switch(numeroIngresado) {
						case 1:
							System.out.println("INGRESE EL NUMERO DEL JUGADOR: ");
							numero = teclado.nextInt();					
							System.out.println("INGRESE EL APELLIDO DEL JUGADOR: ");
							nombre = teclado.next();
							System.out.println("INGRESE EL PRECIO DEL JUGADOR: ");
							precio = teclado.nextDouble();
							Jugador jugador01;
							jugador01 = new Jugador(numero, nombre, precio);
							Unlam.agregarJugador(jugador01);	
							System.out.println("EL PLANTEL SE COMPONE DE:\n"+Unlam.toString());
							break;
						case 2:
							System.out.println("\nCAMBIAR JUGADOR: ");																			
							System.out.println("\nEL PLANTEL SE COMPONE DE:\n"+Unlam.toString());
							System.out.println("INGRESE EL NUMERO DEL JUGADOR SALIENTE: ");
							numero = teclado.nextInt();					
							System.out.println("INGRESE EL NOMBRE DEL JUGADOR SALIENTE: ");
							nombre = teclado.next();
							System.out.println("INGRESE EL PRECIO DEL JUGADOR SALIENTE: ");
							precio = teclado.nextDouble();
							Jugador saliente;
							saliente = new Jugador (numero, nombre, precio);
							System.out.println("INGRESE EL NUMERO DEL JUGADOR SALIENTE: ");
							numero = teclado.nextInt();					
							System.out.println("INGRESE EL NOMBRE DEL JUGADOR SALIENTE: ");
							nombre = teclado.next();
							System.out.println("INGRESE EL PRECIO DEL JUGADOR SALIENTE: ");
							precio = teclado.nextDouble();
							Jugador entrante;
							entrante = new Jugador (numero, nombre, precio);
							if(Unlam.cambiarJugador(saliente,entrante)) {
								System.out.println("\nEL PLANTEL SE COMPONE DE :\n"+Unlam.toString());
							} else {
								System.out.println("\nNO SE PUEDE AGREGAR AL JUGADOR SELECCIONADO");
									}		
							break;
						case 3:
							System.out.println("\nBUSCAR JUGADOR POR NUMERO ");
							System.out.println("\nEL PLANTEL CREADO SE COMPONE POR:\n"+Unlam.toString());
							System.out.println("\nINGRESE EL NUMERO DEL JUGADOR: ");
							numero = teclado.nextInt();							
							System.out.println("\nEL JUGADOR BUSCADO ES:"+Unlam.buscar(numero).getNombre());
							break;
						case 4:
							System.out.println("\nBBUSCAR JUGADOR POR NOMBRE: ");
							System.out.println("\nEL PLANTEL CREADO SE COMPONE POR:\n"+Unlam.toString());
							System.out.println("\nINGRESE EL NOMBRE DEL JUGADOR: ");
							nombre = teclado.next();							
							System.out.println("\nEL JUGADOR BUSCADO ES:"+Unlam.buscar(numero).getNumero());
							break;
						case 5:
							System.out.println("\nCONOCER EL PRECIO DEL PLANTEL: ");							
							System.out.println("\nEL PRECIO DEL PLANTEL ES: "+Unlam.calcularElValorDelEquipo());									
							break;
						case 6:
							System.out.println("\nCONOCER EL PRECIO PROMEDIO: ");							
							System.out.println("\nEL PRECIO PROMEDIO DEL PLANTEL DEL EQUIPO ES: "+Unlam.calcularElPrecioPromedio());												
							break;
						case 9:					
							System.out.println("\nDESCONECTADO");								
							break;
						default:
							System.out.println("\nINGRESE UNA OPCION CORRECTA ENTRE 1 Y 6, CASO CONTRARIO INGRESE 9 PARA SALIR");
						}
				}
			  
				teclado.close();
			}	
		
	
	private static void mostrarMenu() {
	System.out.println("\nBIENVENIDO");
	System.out.println("*****************");
	System.out.println("MENU\n");
	System.out.println("1.AGREGAR JUGADORES");
	System.out.println("2.CAMBIAR JUGADORES");
	System.out.println("3.BUSCAR POR NUMERO");
	System.out.println("4.BUSCAR POR NOMBRE");
	System.out.println("5.CONOCER EL VALORE DEL EQUIPO");
	System.out.println("6.CONOCER EL VALOR PROMEDIO DEL EQUIPO");
	System.out.println("9.SALIR");
	System.out.println("*****************");
	System.out.println("INGRESE UNA OPCION\n");
}

private static int seleccionarOpcion() {
	 int opcion;
     opcion = teclado.nextInt();
     return opcion;	     
}
	
	

}