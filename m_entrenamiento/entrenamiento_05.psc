Algoritmo entrenamiento_05
	//Defino Variables
	Definir x Como Entero
	Definir yy Como Logico
	Definir c Como Caracter
	
	x <- 10; yy <- falso; c <- 'a';
	
	//yy <- x;
	si x > 0 entonces 
		yy <- verdadero
	SiNo
		yy <- falso
	FinSi
	c <- 'b';
	yy <- verdadero;
	
	//Salida
	Escribir "El valor de x es: ", x
	Escribir "El valor de yy es: ", yy
	Escribir "El valor de c es: ", c
		
FinAlgoritmo
