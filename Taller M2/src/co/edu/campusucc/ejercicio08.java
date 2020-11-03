package co.edu.campusucc;

import java.util.Scanner;

public class ejercicio08 {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
		System.out.println(".            Fecha: 29/10/2020              .");
		System.out.println(".         Ingeniería Industrial             .");
	    System.out.println(".        Taller 1M2 ejercicio 08            .");
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
		
		System.out.println("Horas extras trabajadas: ");
		c =scan.next();	
		cn= Integer.parseInt(c);

		int valorhorasn = (int) an*bn;
		int valorhorase = (int) ((an+(an*0.5))+cn);
		int valor = (int) valorhorasn+valorhorase;
		double valortotal = (double) valor-(valor*0.12);
			
		System.out.println("Valor total a pagar para el empleado es: " + valortotal);
		
	}
}
