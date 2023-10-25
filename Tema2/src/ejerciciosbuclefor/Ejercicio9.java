package ejerciciosbuclefor;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// variable para almacenar el número
		int n;
		//variable para crear el escaner
		Scanner sc = new Scanner(System.in);
		
		//boolean para determinar si el nuemro es true o false
		boolean isPrime = true;
		
		//preguntamos al usuario por el numero
		System.out.println("Escribe un número y te dire si es primo ");
		//almacenamos el numero en la variable n
		n = sc.nextInt();
		
		//comprobamos si el numero es mayor de uno
		if (n > 1) {
			//bucle para dividir el numero entre todos los numeros entre dos y el mismo
			//para comprobar si es primo o no
			for (int i = 2; i <= n-1; i++) {
				
				if (n%i == 0) {
					isPrime = false;
				}				
			}
		}
		else {
			isPrime = false;
		}
		//imprimimos el mensaje
		if (isPrime) {
			System.out.println("Es primo ");
		}
		else {
			System.out.println("No es primo ");
		}
		//cerramos el escaner
		sc.close();
	}

}
