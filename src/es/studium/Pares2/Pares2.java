package es.studium.Pares2;

import java.util.Scanner;

public class Pares2
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2;
		int i = 0;
		System.out.println( "Dame un numero" );
		numero1=teclado.nextInt();
		System.out.println( "Dame un segundo" );
		numero2=teclado.nextInt();
		for (i=numero1;i<=numero2;i++)
		{
			if(i%2==0)/*if(i%2!=0)*/
				{
				System.out.println(i);
				}
		}
		teclado.close();
	}
}

/*PROGRMA EJERCICIO4
VARIABLES
ENTERO a, b, i
INICIO
ESCRIBIR "Introduce el número"
LEER a
ESCRIBIR "Introduce el número"	
LEER b
PARA i=a HASTA i<=b HACER
	SI i%2 = 0 ENTONCES
		ESCRIBIR i 
	SINO 
		LINEANUEVA()
	FINSI
FINPARA
FIN*/