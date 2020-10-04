Algoritmo ejercicioenclase
	//Definir variables
	Definir m, lo, p Como Entero
	Definir a, b, c Como Real
	
	m <- 6; lo <- 8; p <- 5;
	
	a <- 3.5; b <- 4.5; c <- 4.2;
	
	//Proceso 
	
	m <- lo * p;
	lo <- p + m;
	p <- m + lo;
	
	a <- a/3;
	b <- b*2/a
	c <- c + a - a * b
	
	//salida
	
	Escribir "El valor de a es: ", a
	Escribir "El valor de b es: ", b
	Escribir "El valor de c es: ", c
	Escribir "El valor de m es: ", m
	Escribir "El valor de lo es: ", lo
	Escribir "El valor de p es: ", p
	
FinAlgoritmo
