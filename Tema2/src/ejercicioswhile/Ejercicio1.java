package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// variables
		int num, suma = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserte un numero entero ");
		num = sc.nextInt();
		
		while (num>=0) {
			suma += num;	
			System.out.println("Dame otro número entero, si quieres parar introduce uno negativo ");
			num = sc.nextInt();
		}
		
		System.out.println("La suma de todos los numeros es " + suma);
		
		sc.close();
	}

}
