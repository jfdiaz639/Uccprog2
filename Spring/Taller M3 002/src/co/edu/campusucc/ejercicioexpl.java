package co.edu.campusucc;

import java.util.Random;

public class ejercicioexpl {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda D�az Gomez     .");
		System.out.println(".            Fecha: 14/11/2020              .");
		System.out.println(".         Ingenier�a Industrial             .");
	    System.out.println(".        Taller M3 002 explicaci�n          .");
		System.out.println(".............................................");
		
		
		boolean condicion = false;
		
		do {
			Random random = new Random ();
			int intRandom = random.nextInt(10);
			
			condicion = true;
			if (intRandom < 3) condicion = false;
			
			System.out.println ("Estoy dentro del ciclo mientras; random=" +intRandom+ " Condicion de salida ciclo >>" +condicion);
		}while (condicion);

	}
}