package Taab;

import java.util.Scanner;
public class Aplicacion {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner(System.in);
		
		tabla prueba = new tabla();
		
		System.out.println("Digite el numero");
		prueba.Imprimir_tabla(leer.nextInt());
		
		leer.close();
	
	}

}