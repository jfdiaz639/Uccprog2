package co.edu.campusucc;

import java.util.Scanner;

public class ejercicio05 {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
		System.out.println(".            Fecha: 29/10/2020              .");
		System.out.println(".         Ingeniería Industrial             .");
	    System.out.println(".        Taller 1M2 ejercicio 05            .");
		System.out.println(".............................................");

		
		String c,p = "";
		double cn, pn = 0;
		Scanner scan = new Scanner (System.in);
			
		System.out.println("costo del producto: ");
		c =scan.next();	
		cn= Double.parseDouble(c);
		
		System.out.println("valor pagado: ");
		p =scan.next();	
		pn= Double.parseDouble(p);

		double devuelta = (double) pn-cn;
			
		System.out.println("Valor del cambio: " + devuelta);
				
	}
}
