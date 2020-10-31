package co.edu.campusucc;

import java.util.Scanner;

public class Jennydiaz5 {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
		System.out.println(".            Fecha: 29/10/2020              .");
		System.out.println(".         Ingeniería Industrial             .");
	    System.out.println(".       Laboratorio Momento 2 003           .");
		System.out.println(".............................................");

		
		int l1,l2;
		boolean resl1=true ,resl2=true;
		boolean k;
	
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("La tierra es un satélite [0] ...falso [1] ...Verdad?  ");
			l1 = scan.nextInt();
			System.out.println("azul es una obra de Ruben Dario [0] ...falso [1] ...Verdad?  ");
			l2 = scan.nextInt();
		
		}
			
		if (l1 !=0) resl1=false;
		if (l2 !=0) resl2=true ;
	
		k = resl1 && resl2;
	
		System.out.println("El valor de la variable k es: " + k);

	}
}
