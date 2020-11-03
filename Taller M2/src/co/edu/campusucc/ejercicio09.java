package co.edu.campusucc;

import java.util.Scanner;

public class ejercicio09 {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
		System.out.println(".            Fecha: 29/10/2020              .");
		System.out.println(".         Ingeniería Industrial             .");
	    System.out.println(".        Taller 1M2 ejercicio 09            .");
		System.out.println(".............................................");

		
		String a = "";
		int an, suma = 0;
		Scanner scan = new Scanner (System.in);
			
		System.out.println("Digite el numero inicial: ");
		a =scan.next();	
		an= Integer.parseInt(a);
		
		while (an>0) {
			suma = suma+an%10;
			an = an /10;
					}
			
		System.out.println("La suma de las cifras del numero inicial es: " + suma);
	}
}
