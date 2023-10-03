package IfElse;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Variables
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número ");
		num1 = sc.nextInt();
		System.out.println("Dime un número ");
		num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println("Los dos números son iguales");
		}
		else {
			System.out.println("Los dos números son diferentes ");
		}
		
		sc.close();
	}

}
