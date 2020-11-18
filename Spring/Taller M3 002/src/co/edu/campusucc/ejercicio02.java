package co.edu.campusucc;

import java.util.Random;
import java.util.Scanner;

public class ejercicio02 {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
		System.out.println(".            Fecha: 16/11/2020              .");
		System.out.println(".         Ingeniería Industrial             .");
	    System.out.println(".         Taller M3 002 ejercicio02         .");
		System.out.println(".............................................");
		
		
		String num;
		int inum, r;
		int resultado=0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite el numero para saber si es capicua: ");
		num=scan.next();
		inum = Integer.parseInt(num);
		scan.reset ();
		
		while (inum > 0) {
			resultado += inum % 10;
			inum = inum/10;
			
	}

	System.out.println ("la suma de los digitos es: "+resultado);
		}
}