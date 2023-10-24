package ejerciciosbuclefor;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// variable para almacenar el numero insertado en la consola y para almacenar
		//el numero de multiplos de 3
		int n, contador = 0;
		//variable para el escaner
		Scanner sc = new Scanner(System.in);
		
		//pedimos el numero al usuario
		System.out.println("Inserta un número entero ");
		//guardamos el valor introducido en la variable
		n = sc.nextInt();
		
		for (int i = 0; i <= n; i++) {
			//condicional que comprueba si i entre 3 da de resto 0
			if (i%3 == 0) {
				contador++;
				//System.out.println(i);
			}
		}
		
		//imprimimos el re3sultado 
		System.out.println(contador);
		//cerramos el escaner
		sc.close();

	}

}
