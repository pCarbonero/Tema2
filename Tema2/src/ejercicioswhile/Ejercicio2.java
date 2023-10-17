package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Variables
		int num = 0, cuenta = 0;
		Scanner sc = new Scanner(System.in);
		//////
		System.out.println("Dame un número entero ");
		num = sc.nextInt();
		
		while (num >= 0) {
			cuenta++;
			System.out.println("Dame otro número, si quieres parar escribe uno negativo");
			num = sc.nextInt();
		}
		
		System.out.println("Has escrito " + cuenta + " números");
		sc.close();
		

	}

}
