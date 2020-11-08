package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
		System.out.println(".            Fecha: 07/11/2020              .");
		System.out.println(".         Ingeniería Industrial             .");
	    System.out.println(".        Taller M3 ejercicio02              .");
		System.out.println(".............................................");
		
		String ubi, tam;
		int costo = 0, ubic, tama;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite la ubicacion norte(1), sur (2), orientegrande(3), occidente (4)");
		ubi=scan.next();
		ubic = Integer.parseInt(ubi);
		scan.reset ();
				
		System.out.println("Digite tamaño grande(01), pequeño (02), mediano (03): ");
		tam=scan.next();
		tama = Integer.parseInt(tam);
		scan.reset ();
			
		switch (tama) {
			case 01: 
				switch (ubic) {
				case 1: costo = 100;
				case 4: costo = 200;	
			    break;
				}
				break;
			case 02:
				switch (ubic) {
				case 1: costo = 500;
				case 2: costo = 400;
				case 4: costo = 400;
			    break;
				}
				break;
			case 03:
				switch (ubic) {
				case 1: costo = 250;
				case 2: costo = 200;
			    break;
				}
			    break;
		default:
			costo=0;
			System.out.println("La entrada no existe:");
			
			switch (ubic) {
			case 3: costo = 100;
			break;
			default:
				costo=0;
				System.out.println("La entrada no existe:");
			}			
	}
	System.out.println("El beneficio es de :" +costo+ "por minuto");	
}
}
