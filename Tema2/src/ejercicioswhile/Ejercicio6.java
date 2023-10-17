package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// variables
		int edad = 0, media = 0, suma = 0, cuenta = 0, overage = 0;
		Scanner sc = new Scanner(System.in);
		//////
		System.out.println("Dime la edad del primer alumno ");
		edad = sc.nextInt();
		
		while (edad >= 0) {
			cuenta++;
			suma += edad;
			media = suma / cuenta;
			if (edad >= 18) {
				overage++;
			}
			System.out.println("Dime la edad del siguiente, si quieres parar escribe uno negativo");
			edad = sc.nextInt();
		}
		
		System.out.println("La suma de las edades es " + suma);
		System.out.println("La media de las edades es " + media);
		System.out.println("Hay un total de " + cuenta + " alumnos");
		System.out.println("Hay un total de " + overage + " alumnos mayores de edad");


		sc.close();


	}

}
