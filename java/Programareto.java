public class ProgramaArgumentos01 {
  public static void main(String[] args){ 
    System.out.println(".............................................");
    System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
	System.out.println(".         Fecha: 24/10/2020                 .");
	System.out.println(".      Ingeniería Industrial                .");
    System.out.println(".         programa en JAVA jfdiaz           .");
	System.out.println("..........................................  .");
	
	System.out.println("argumento 1 = "+args[0]);
	System.out.println("argumento 2 = "+args[1]);
	
	if ("H".compareToIgnoreCase (args[0]){
		//convierten a Hexadecimal
	}else if ("B".compareToIgnoreCase(args[0]) {
		//convierten a Binario
	}else {
	     //Mensaje indicando que no existe esa opcion para convertir el numero
	}
	
	int num1 = Integer.paraseInt (args[0]);
	int num2 = Integer.paraseInt (args[1]);
	int resultado = num1 - num2;
	
	System.out.println("Operacion Matematica: num1 = "+num1+", num2 = "+num2);
	System.out.println("SUMA num1 + num2 = "+resultado);
	
  }
}
