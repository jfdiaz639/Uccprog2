package co.edu.campusucc;

import java.util.Scanner;

public class Jennydiaz4 {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda D�az Gomez     .");
		System.out.println(".            Fecha: 29/10/2020              .");
		System.out.println(".         Ingenier�a Industrial             .");
	    System.out.println(".       Laboratorio Momento 2 003           .");
		System.out.println(".............................................");

		
		int l1,l2;
		boolean resl1=true ,resl2=true;
		boolean k;
	
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Inglaterra es un pa�s suramericano [0] ...falso [1] ...Verdad?  ");
			l1 = scan.nextInt();
			System.out.println("Marie Currie invent� el radio [0] ...falso [1] ...Verdad?  ");
			l2 = scan.nextInt();
		
		}
			
		if (l1 !=0) resl1=false;
		if (l2 !=0) resl2=false ;
	
		k = resl1 && resl2;
	
		System.out.println("El valor de la variable k es: " + k);
	}
}
