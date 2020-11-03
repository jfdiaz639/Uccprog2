package co.edu.campusucc;

import java.util.Scanner;

public class ejercicio06 {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
		System.out.println(".            Fecha: 29/10/2020              .");
		System.out.println(".         Ingeniería Industrial             .");
	    System.out.println(".        Taller 1M2 ejercicio 06            .");
		System.out.println(".............................................");

		
		String a,b,c,d,e,f = "";
		int an, bn, cn, dn, en, fn = 0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Nombre del empleado1: ");
		String nombre = scan.next();
		
		System.out.println("Valor horas: ");
		a =scan.next();	
		an= Integer.parseInt(a);
		
		System.out.println("Horas trabajadas: ");
		b =scan.next();	
		bn= Integer.parseInt(b);

		int valor = (int) an*bn;
			
		System.out.println("Valor total a pagar para el empleado1 es: " + valor);
	
		System.out.println("Nombre del empleado2: ");
		String nombre2 = scan.next();
		
		System.out.println("Valor horas: ");
		c =scan.next();	
		cn= Integer.parseInt(c);
		
		System.out.println("Horas trabajadas: ");
		d =scan.next();	
		dn= Integer.parseInt(d);

		int valor2 = (int) cn*dn;
			
		System.out.println("Valor total a pagar para el empleado2 es: " + valor2);
				
		System.out.println("Nombre del empleado3: ");
		String nombre3 = scan.next();
		
		System.out.println("Valor horas: ");
		e =scan.next();	
		en= Integer.parseInt(e);
		
		System.out.println("Horas trabajadas: ");
		f =scan.next();	
		fn= Integer.parseInt(f);

		int valor3 = (int) en*fn;
			
		System.out.println("Valor total a pagar para el empleado3 es: " + valor3);
		
	}
}
