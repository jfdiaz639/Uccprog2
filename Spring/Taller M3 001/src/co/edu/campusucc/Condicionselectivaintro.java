package co.edu.campusucc;

import java.util.Scanner;

public class Condicionselectivaintro {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
		System.out.println(".            Fecha: 07/11/2020              .");
		System.out.println(".         Ingeniería Industrial             .");
	    System.out.println(".        Taller M3 introduccion             .");
		System.out.println(".............................................");
		
		String nom,cat,suel;
		int cate;
		double sueldo = 0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite el nombre del empleado");
		nom=scan.next();
		scan.reset ();
				
		System.out.println("Digite la categoria por favor (entre 1 y 4):");
		cat=scan.next();
		cate = Integer.parseInt(cat);
		scan.reset ();
		
		System.out.println("Digite el sueldo por favor:");
		suel=scan.next();
		sueldo = Double.parseDouble(suel);
		scan.reset ();
		
		switch (cate) {
			case 1: sueldo=sueldo*1.15;
			break;
			case 2: sueldo=sueldo*1.10;
			break;
			case 3: sueldo=sueldo*1.08;
			break;
			case 4: sueldo=sueldo*1.07;
			break;
		default:
			sueldo=0;
			System.out.println("La categoria no existe:");
			
								
		}
		
		System.out.println("El sueldo a pagar a " +nom+ " es :" + sueldo);	
	}
}
