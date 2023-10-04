package IfElse;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Variables
		int nota;
		Scanner sc = new Scanner(System.in); 			
		
		System.out.println("Dime que nota has sacado ");
		nota = sc.nextInt();
		
		
		if (nota >= 0 && nota < 5) {
			System.out.println("INSUFICIENTE");
		}
		else if (nota >= 5 && nota < 6) {
			System.out.println("SUFICIENTE");
		}
		else if (nota >= 6 && nota < 7) {
			System.out.println("BIEN");
		}
		else if (nota >= 7 && nota <9) {
			System.out.println("NOTABLE");
		}
		else if (nota >= 9 && nota<= 10) {
			System.out.println("SOBRESALIENTE");
		}
		else if (nota < 0 || nota > 10) {
			System.out.println("No puedes tener esa nota ");
		}
		
		sc.close();
	}

}
