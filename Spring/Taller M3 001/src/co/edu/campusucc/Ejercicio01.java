package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
		System.out.println(".            Fecha: 07/11/2020              .");
		System.out.println(".         Ingeniería Industrial             .");
	    System.out.println(".        Taller M3 ejercicio01              .");
		System.out.println(".............................................");
		
		
		String sem, pro;
		int semes, prog, valor=0;
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Seleccione el programa economia (e), administracion (a), ciencias (c):");
		pro=scan.next();
		scan.reset ();
		
		
		System.out.println("En que semestre se encuentra");
		sem=scan.next();
		semes = Integer.parseInt(sem);
		scan.reset ();
		
		
		switch (pro) {
			case "e":
				switch (semes) {
			    case 1:
			    case 2:
			    case 3:
			    	valor = 1500;
			    break;
			    case 4:
			    case 5:	
			    case 6:	
			    case 7:
			        valor = 2200;
			    break;
			    case 8:
			    case 9:	
			    case 10:
			    	valor = 3000;
			    break;
			    default:
					valor=0;
					System.out.println("Entradas invalidas:");
					}
				break;
	    	case "a":
				switch (semes) {
				    case 1:
				    case 2:
				    case 3:
				    	valor = 2000;
				    	  break;
				    case 4:
				    case 5:	
				    case 6:	
				    case 7:
				        valor = 4000;
				    break;
				    case 8:
				    case 9:	
				    case 10:
				    	valor = 6000;
				    break;
				    default:
						valor=0;
						System.out.println("Entradas invalidas:");
						}
				break;
	    	case "c":
				switch (semes) {
				    case 1:
				    case 2:
				    case 3:
				    	valor = 1800;
				    	  break;
				    case 4:
				    case 5:	
				    case 6:	
				    case 7:
				        valor = 5000;
				    break;
				    case 8:
				    case 9:	
				    case 10:
				    	valor = 7000;
				    break;
				    default:
						valor=0;
						System.out.println("Entradas invalidas:");
						}
				break;
	    	default:
				valor=0;
				System.out.println("Entradas invalidas:");

	     	}
		System.out.println("La tarifa por concepto de carnet estudiantil es: $" +valor);
	}
}
