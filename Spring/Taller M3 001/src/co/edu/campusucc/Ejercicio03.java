package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
		System.out.println(".            Fecha: 07/11/2020              .");
		System.out.println(".         Ingeniería Industrial             .");
	    System.out.println(".        Taller M3 ejercicio03              .");
		System.out.println(".............................................");
		
		String pro,uni;
		int unid=0, prec=0;
		double coniva=0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite el producto (a,b,c):");
		pro=scan.next();
		scan.reset ();
				
		System.out.println("digite el numero de unidades:");
		uni=scan.next();
		unid = Integer.parseInt(uni);
		scan.reset ();
			
		switch (pro) {
			case "a": 
				if (unid >0 && unid <501) 
				prec = 500;
				else if (unid>501);
				   prec = 1000;
				break;
			case "b": 
				if (unid >0 && unid <501) 
					prec = 800;
					else if (unid>501);
					   prec = 1400;
					break;
			case "c": 
				if (unid >0 && unid <501) 
					prec = 1000;
					else if (unid>501);
					   prec = 1600;
					break;
					
			default:
			prec=0;
			System.out.println("No se puede ejecutar:");
			}			
		
		System.out.println("El precio de venta es: "+unid*prec);	
		
		switch (pro) {
		case "a": 
			if (unid >0 && unid <501) 
			coniva = prec + (prec*0.07);
			else if (unid>501);
			coniva = prec + (prec*0.09);
			break;
		case "b": 
			if (unid >0 && unid <501) 
				coniva = prec + (prec*0.08);
				else if (unid>501);
				coniva = prec + (prec*0.11);
				break;
		case "c": 
			if (unid >0 && unid <501) 
				coniva = prec+(prec*0.05);
				else if (unid>501);
				coniva = prec + (prec*0.1);
				break;
				
		default:
		prec=0;
		System.out.println("No se puede ejecutar:");
		}			
	
	System.out.println("El valor a facturar es: "+unid*coniva);	
		
		
		
}
}
