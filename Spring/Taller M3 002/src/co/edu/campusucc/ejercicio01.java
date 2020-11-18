package co.edu.campusucc;

import java.util.Random;
import java.util.Scanner;

public class ejercicio01 {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
		System.out.println(".            Fecha: 16/11/2020              .");
		System.out.println(".         Ingeniería Industrial             .");
	    System.out.println(".         Taller M3 002 ejercicio01         .");
		System.out.println(".............................................");
		
		
		String num;
		int inum, r;
		int numi=0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite el numero: ");
		num=scan.next();
		inum = Integer.parseInt(num);
		scan.reset ();
		
		while (inum > 0) {
			r = inum % 10;
			numi = numi*10+r;
			inum /=10;
			
	}

	System.out.println ("Número invertido: "+numi);
		}
}