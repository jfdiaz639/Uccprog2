package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args) {
		System.out.println(".............................................");    
		System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
		System.out.println(".            Fecha: 07/11/2020              .");
		System.out.println(".         Ingeniería Industrial             .");
	    System.out.println(".        Taller M3 ejercicio03              .");
		System.out.println(".............................................");
		
		String serv,rut;
		int ruta=0;
		double util = 0, costo=0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite el tipo de servicio (corriente, ejecutivo)");
		serv=scan.next();
		scan.reset ();
				
		System.out.println("digite el numero de ruta:");
		rut=scan.next();
		ruta = Integer.parseInt(rut);
		scan.reset ();
			
		switch (serv) {
			case "corriente": costo=200;
				switch (ruta){
				  case 1:  util = costo - ((costo * 0.3)+(costo*0.1));
				  break;
				  case 2: util = costo - ((costo * 0.25)+(costo*0.15));
				  break;
				  case 3: util= costo - ((costo * 0.2)+(costo*0.2));
				  break;
				  case 4: util= costo - ((costo * 0.22)+(costo*0.20));
				  break;
				}
				break;
			case "ejecutivo": costo=300;
			switch (ruta){
			  case 1:  util = costo - ((costo * 0.3)+(costo*0.1));
			  break;
			  case 2: util = costo - ((costo * 0.25)+(costo*0.15));
			  break;
			  case 3: util= costo - ((costo * 0.2)+(costo*0.2));
			  break;
			  case 4: util= costo - ((costo * 0.22)+(costo*0.20));
			  break;
			}
			break;
				
			default:
			util=0;
			System.out.println("No se puede ejecutar:");
			}		
		
		System.out.println("La utilidad de la empresa es: "+util);	
}
}