Algoritmo entrenamiento_4
	//Definir variables
	Definir resp1, resp2, resp3, resp4, k Como Entero
	
	Escribir "¿ Benjamín Franklin invento el pararrayos (o) falso, (1) verdad? " 
	leer resp1
	
	Escribir "¿ Samuel morse inventó el telégrafo (0) Falso  (1) Verdad? "
	leer resp2
	
	Escribir "Perú es un país suramericano (0) falso, (1) verdad ? " 
	Leer resp3
		
	Escribir " ¿ 5 es un numero primo (0) falso (1) verdad ? " 
	Leer resp4
	
	si (resp1 >= resp2) y (resp3 == resp4) Entonces
		
		k <- 1;
	SiNo
		k <- 0;
		
	FinSi
	
	Escribir "El valor final vale ", k
	
	
FinAlgoritmo
