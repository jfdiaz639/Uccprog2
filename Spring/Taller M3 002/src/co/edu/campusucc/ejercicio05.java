package co.edu.campusucc;

import java.util.Random;
import java.util.Scanner;

public class ejercicio05 {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
		System.out.println(".            Fecha: 16/11/2020              .");
		System.out.println(".         Ingeniería Industrial             .");
	    System.out.println(".         Taller M3 002 ejercicio05         .");
		System.out.println(".............................................");
		
		
		String n1;
		int n,m;

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite el numero para determinar su digito mayor ");
		  n1=scan.next();
		  n = Integer.parseInt(n1);
		  scan.reset ();
		
		System.out.println("Ingrese numero");

		m=0;

		while(n>0){

		if((n%10)>m){m=n%10;}

		n=n/10;}

		System.out.println(m+" es el digito mayor de "+ n1);		}
		
}