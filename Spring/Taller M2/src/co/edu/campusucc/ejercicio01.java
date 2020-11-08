package co.edu.campusucc;

import java.util.Scanner;

public class ejercicio01 {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
		System.out.println(".            Fecha: 29/10/2020              .");
		System.out.println(".         Ingeniería Industrial             .");
	    System.out.println(".        Taller M2 ejercicio 01             .");
		System.out.println(".............................................");

		
		String a = "";
		int n = 0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("digite un numero: ");
		a =scan.next();	
		n= Integer.parseInt(a);
		
		int resultado = (int) Math.pow(n,3);
		
		System.out.println("resultado del numero al cubo es: " + resultado);
		
	}
}