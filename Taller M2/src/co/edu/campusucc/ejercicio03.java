package co.edu.campusucc;

import java.util.Scanner;

public class ejercicio03 {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
		System.out.println(".            Fecha: 29/10/2020              .");
		System.out.println(".         Ingeniería Industrial             .");
	    System.out.println(".        Taller 1M2 ejercicio 03            .");
		System.out.println(".............................................");

		
		String a,b,c = "";
		double an, bn, cn = 0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Nombre del estudiante: ");
		String nombre = scan.next();
		
		System.out.println("digite la nota 1: ");
		a =scan.next();	
		an= Double.parseDouble(a);
		
		System.out.println("digite la nota 2: ");
		b =scan.next();	
		bn= Double.parseDouble(b);
		
		System.out.println("digite la nota 3: ");
		c =scan.next();	
		cn= Double.parseDouble(c);
		
		double resultadon1 = (double) an*0.3;
		double resultadon2 = (double) bn*0.3;
		double resultadon3 = (double) cn*0.4;
		
		double resultadofinal = (double) resultadon1+resultadon2+resultadon3;
	
		System.out.println("nota definitiva: " + resultadofinal);
				
	}
}