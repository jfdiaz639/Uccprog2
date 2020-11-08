package co.edu.campusucc;

import java.util.Scanner;

public class ejercicio10 {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
		System.out.println(".            Fecha: 29/10/2020              .");
		System.out.println(".         Ingeniería Industrial             .");
	    System.out.println(".        Taller 1M2 ejercicio 10            .");
		System.out.println(".............................................");

		
		String a,b, c, d = "";
		int an, bn, cn = 0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Nombre del empleado: ");
		String nombre = scan.next();
		
		System.out.println("Valor horas: ");
		a =scan.next();	
		an= Integer.parseInt(a);
			
		System.out.println("Horas trabajadas: ");
		b =scan.next();	
		bn= Integer.parseInt(b);
		
		if (bn>48) {
			cn=bn-48;
		}
		
		System.out.println("Total horas extras: " + cn);

		int valorhorasn = (int) an*bn;
		int valorhorase = (int) ((an+(an*0.2))+cn);
		int valor = (int) valorhorasn+valorhorase;
			
			
		System.out.println("Valor total a pagar para el empleado es: " + valor);
		
	}
}