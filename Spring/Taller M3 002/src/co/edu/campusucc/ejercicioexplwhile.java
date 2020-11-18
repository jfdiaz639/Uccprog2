package co.edu.campusucc;

import java.util.Random;

public class ejercicioexplwhile {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
		System.out.println(".            Fecha: 14/11/2020              .");
		System.out.println(".         Ingeniería Industrial             .");
	    System.out.println(".   Taller M3 002 explicación while         .");
		System.out.println(".............................................");
		
		
		boolean condicion = true;
		int contador =0;
		int acumulador =0;
		
		while (condicion) {
			contador=contador +1;
			Random aleatorio = new Random ();
			int intRandom = aleatorio.nextInt(50);
			
			acumulador = acumulador + intRandom;
			
			condicion = true;
			if (intRandom < 30 && intRandom > 25) condicion = false;
			
			System.out.println ("Estoy dentro del ciclo mientras; random=" +intRandom+ " Condicion de salida ciclo >>" +condicion);
	}

		System.out.println ("+---------------------------------+");
		System.out.println ("+      Ciclos resaltados: "+contador);
		System.out.println ("+------valor acumulado: "+acumulador);
		System.out.println ("+---------------------------------+");
			}
}