package ifelse;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// variables
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número ");
		num1 = sc.nextInt();
		
		System.out.println("Dime otro número ");
		num2 = sc.nextInt();
		
		System.out.println("Dime otro número ");
		num3 = sc.nextInt();
		
		if (num1 < num2 && num1 < num3 && num2 < num3) {
			System.out.println(num1 + "<" + num2 + "<" + num3);
		}
		else if (num1 == num2 && num2 == num3) {
			System.out.println("Son iguales ");
		}		
	}
	}
