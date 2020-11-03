package co.edu.campusucc;

import java.util.Scanner;

public class ejercicio11 {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
		System.out.println(".            Fecha: 29/10/2020              .");
		System.out.println(".         Ingeniería Industrial             .");
	    System.out.println(".        Taller M2 ejercicio 11             .");
		System.out.println(".............................................");

		
		String a = "";
		int n = 0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("digite un numero: ");
		a =scan.next();	
		n= Integer.parseInt(a);
		
		int resultado = (int) Math.abs(n);
		
		System.out.println("el valor absoluto del numero digitado es: " + resultado);
		
	}
}