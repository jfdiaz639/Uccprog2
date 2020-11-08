package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
		System.out.println(".            Fecha: 07/11/2020              .");
		System.out.println(".         Ingeniería Industrial             .");
	    System.out.println(".        Taller M3 ejercicio03              .");
		System.out.println(".............................................");
		
		String carro,diag;
		int cargo=0, valor=0, diagn, total;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite el tipo de carro Mazda(M), Renault (R), Chevrolet (C), Fiat(F), Dodge (D), Otros(O)");
		carro=scan.next();
		scan.reset ();
				
		System.out.println("Digite el tipo de diagnostico cambio de aceite (1), alineacion y balance (2), engrase (3), cambio de filtro (4), lavado (5), otros (6): ");
		diag=scan.next();
		diagn = Integer.parseInt(diag);
		scan.reset ();
			
		switch (carro) {
			case "M": cargo=5000;
			break;
			case "R": cargo=3000;
			break;
			case "C": cargo=2500;
			break;
			case "F": cargo=2000;
			break;
			case "D": cargo=2200;
			break;
			case "O": cargo=1700;
			break;
			default:
				cargo=0;
				System.out.println("No se puede ejecutar:");
				}	
			switch (diagn){
				  case 1:  valor=3500;
				  break;
				  case 2: valor =2800;
				  break;
				  case 3: valor =1950;
				  break;
				  case 4: valor=2750;
				  break;
				  case 5: valor=3000;
				  break;
				  case 6: valor=1600;
				  break;			
			default:
			valor=0;
			System.out.println("No se puede ejecutar:");
			}		
		
			total=valor+cargo;
			
		System.out.println("El valor a facturar es: "+total);	
}
}
