public class ProgramaArgumentos02{
  public static void main(String[] args){ 
    System.out.println(".............................................");
    System.out.println(".      Autor: Jenny Fernanda Díaz Gomez     .");
	System.out.println(".         Fecha: 17/10/2020                 .");
	System.out.println(".      Ingeniería Industrial                .");
    System.out.println(".Este es mi primer programa en JAVA jfdiaz  .");
	System.out.println(".          Programa Argumentos02 : resta    .");
	System.out.println("..........................................  .");
	
	System.out.println("argumento 1 = "+args[0]);
	System.out.println("argumento 2 = "+args[1]);
	
	int num1 = Integer.parseInt(args[0]);
	int num2 = Integer.parseInt(args[1]);
	int resultadoResta = num1 - num2;
	
	
	System.out.println("Operacion Matematica: num1 = "+num1+", num2 = "+num2);
	System.out.println("RESTA num1 - num2 = "+resultadoResta);
	
	
  }
}
