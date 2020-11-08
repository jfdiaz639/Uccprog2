package co.edu.campusucc;

import java.util.Scanner;

public class ejercicio04 {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
		System.out.println(".            Fecha: 29/10/2020              .");
		System.out.println(".         Ingeniería Industrial             .");
	    System.out.println(".        Taller 1M2 ejercicio 04            .");
		System.out.println(".............................................");

		
		String s,d,ss,dd = "";
		int sn, dn,ssn,ddn = 0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Nombre del empleado1: ");
		String nombre1 = scan.next();
		
		System.out.println("digite salario: ");
		s =scan.next();	
		sn= Integer.parseInt(s);
		
		System.out.println("digite descuento: ");
		d =scan.next();	
		dn= Integer.parseInt(d);

		int valor1 = (int) sn-dn;
			
		System.out.println("Valor total a pagar al empleado1: " + valor1);
		
		System.out.println("Nombre del empleado2: ");
		String nombre2 = scan.next();
		
		System.out.println("digite salario: ");
		ss =scan.next();	
		ssn= Integer.parseInt(s);
		
		System.out.println("digite descuento: ");
		dd =scan.next();	
		ddn= Integer.parseInt(d);

		int valor2 = (int) ssn-ddn;
			
		System.out.println("Valor total a pagar al empleado2: " + valor2);
				
	}
}