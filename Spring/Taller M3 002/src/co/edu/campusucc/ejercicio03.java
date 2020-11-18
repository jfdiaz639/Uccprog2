package co.edu.campusucc;

import java.util.Random;
import java.util.Scanner;

public class ejercicio03 {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
		System.out.println(".            Fecha: 16/11/2020              .");
		System.out.println(".         Ingeniería Industrial             .");
	    System.out.println(".         Taller M3 002 ejercicio03         .");
		System.out.println(".............................................");
		
		
		String num;
		int inum, r, digit=0;
		int invertir=0;
		Scanner scan = new Scanner (System.in);
		
			  System.out.println("Digite el numero para saber si es capicua: ");
		  num=scan.next();
		  inum = Integer.parseInt(num);
		  scan.reset ();
		
		do {		
			 digit = inum %10;
			 inum = inum /10;
			 invertir=invertir*10+digit;
			} while (inum !=0);
		
				
		if (inum == invertir) {
			System.out.println("El numero es capicua");
		}else {
			System.out.println ("El numero no es capicua");
		}
		
	}
}