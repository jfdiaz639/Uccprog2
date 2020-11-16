package co.edu.campusucc;

import java.util.Random;

public class numerosprimos {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
		System.out.println(".            Fecha: 14/11/2020              .");
		System.out.println(".         Ingeniería Industrial             .");
	    System.out.println(".     Taller M3 003 numeros primos          .");
		System.out.println(".............................................");
		
		
	     int contador =0;
	     int i;
	
		
		Random aleatorio = new Random ();
		int intRandom = aleatorio.nextInt(50);
		
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