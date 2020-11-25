package co.edu.campusucc;

import java.util.Random;
import java.util.Scanner;

public class nprimos {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
		System.out.println(".            Fecha: 16/11/2020              .");
		System.out.println(".         Ingeniería Industrial             .");
	    System.out.println(".         Taller M3 002 ejercicio06         .");
		System.out.println(".............................................");
		
		
		String num;
		int contador =0;
	     int i;
		int intRandom;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite el numero para saber si es primo: ");
		  num=scan.next();
		  intRandom = Integer.parseInt(num);
		  scan.reset ();
		
			for(i = 1; i <= intRandom; i++)
	        {
	            if((intRandom % i) == 0)
	            {
	                contador++;
	            }
	        }
	 
			System.out.println ("Estoy dentro del ciclo mientras; random=" +intRandom);
			
	        if(contador <= 2)
	        {
	            System.out.println("El numero es primo");
	        }else{
	            System.out.println("El numero no es primo");
	        }
	    }
	}