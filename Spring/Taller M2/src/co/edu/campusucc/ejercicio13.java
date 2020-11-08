package co.edu.campusucc;

import java.util.Scanner;

public class ejercicio13 {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
		System.out.println(".            Fecha: 29/10/2020              .");
		System.out.println(".         Ingeniería Industrial             .");
	    System.out.println(".        Taller 1M2 ejercicio 13            .");
		System.out.println(".............................................");

		
		String a,b = "";
		int an, bn = 0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("digite la producccion de Hobbies: ");
		a =scan.next();	
		an= Integer.parseInt(a);
		
		bn=(an*2/3);
		System.out.println("la produccion de Calvin es: " + bn);
	}
}
