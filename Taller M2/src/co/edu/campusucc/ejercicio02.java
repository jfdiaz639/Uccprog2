package co.edu.campusucc;

import java.util.Scanner;

public class ejercicio02 {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
		System.out.println(".            Fecha: 29/10/2020              .");
		System.out.println(".         Ingeniería Industrial             .");
	    System.out.println(".        Taller M2 ejercicio 02             .");
		System.out.println(".............................................");

		
		String a,b = "";
		int an, bn = 0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("digitte un numero: ");
		a =scan.next();	
		an= Integer.parseInt(a);
		
		System.out.println("digitte un numero: ");
		b =scan.next();	
		bn= Integer.parseInt(b);
		
		int resultadosuma = (int) an+bn;
		int resultadoresta = (int) an-bn;
		int resultadoproducto = (int) an*bn;
		double resultadopromedio = (double) ((an+bn)/2);
		
		System.out.println("La suma de los numeros es: " + resultadosuma);
		System.out.println("La resta de los numeros es: " + resultadoresta);
		System.out.println("El producto de los numeros es: " + resultadoproducto);
		System.out.println("El promedio de los numeros es: " + resultadopromedio);
				
	}
}