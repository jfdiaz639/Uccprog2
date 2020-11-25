package co.edu.campusucc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Programamenu {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
		System.out.println(".            Fecha: 14/11/2020              .");
		System.out.println(".         Ingeniería Industrial             .");
	    System.out.println(".     Taller M3 003 numeros primos          .");
		System.out.println(".............................................");
		
		String opci, ejec ="";
		int opc;
	    Scanner scan = new Scanner (System.in);
				
		System.out.println("Digite 1 para el programa ....");
		System.out.println("Digite 2 para el programa ....");
	
	
		System.out.println("Digite el numero del programa a ejecutar ");
		opci=scan.next();
		opc = Integer.parseInt(opci);
				
		switch (opc) {
		case 1:
			ejec= "java co.edu.campusucc.Ejercicio00";
			break;
		case 2:
			ejec= "java ejercicio10";
			break;
		case 3:
			ejec= "java nprimos";			
			break;
		case 4:
			ejec= "java ejercicio05";			
			break;	
		case 5:
			ejec= "java ejercicio07";			
			break;				
		case 6:
			ejec= "java ejercicio09";			
			break;				
		case 7:
			ejec= "java ejercicio11";			
			break;					
		case 8:
			ejec= "java ejercicio01";			
			break;					
		case 9:
			ejec= "java ejercicioexplfor";			
			break;	
		case 10:
			ejec= "java Ejercicio04";			
			break;	
		case 11:
			ejec= "java ejercicioexpl";			
			break;
		case 12:
			ejec= "java numerosprimos";			
			break;
		case 13:
			ejec= "java ejercicioexplwhile";			
			break;
		case 14:
			ejec= "java ejercicio14";			
			break;			
		case 15:
			ejec= "java ejercicio02";			
			break;						
			
			
		default:
			break;
		}
				
		try {
		
		Process theprocess =null; 
		BufferedReader inStream = null;
		
		theprocess = Runtime.getRuntime().exec(ejec);
		inStream = new BufferedReader (new InputStreamReader(theprocess.getInputStream()));
      	System.out.println(inStream.readLine());
		}
		catch (Exception e)
		{
			System.err.println("Error en el metodo exec()");
			e.printStackTrace();
		}	
			
		
		
	}		
}
