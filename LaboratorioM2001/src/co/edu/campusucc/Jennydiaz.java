package co.edu.campusucc;

import java.util.Scanner;

public class Jennydiaz {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda D�az Gomez     .");
		System.out.println(".            Fecha: 29/10/2020              .");
		System.out.println(".         Ingenier�a Industrial             .");
	    System.out.println(".       Laboratorio Momento 2 001           .");
		System.out.println(".............................................");

		
		int l1,l2;		
		boolean resl1=false,resl2=false;
		boolean k;
	
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("�La tierra es redonda [0] ...falso [1] ...Verdad?  ");
			l1 = scan.nextInt();
			System.out.println("�25 es un cuadrado perfecto [0] ...falso [1] ...Verdad? ");
			l2 = scan.nextInt();
		
		}
			
		if (l1 !=0) resl1=true;
		if (l2 !=0) resl2=true ;
	
		k = resl1 && resl2;
			
				
		System.out.println("El valor de la variable k es: " + k);
	}
}

