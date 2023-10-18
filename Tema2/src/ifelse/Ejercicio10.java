package ifelse;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Variables
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número entero ");
		num1 = sc.nextInt();
		System.out.println("Dime un número entero ");
		num2 = sc.nextInt();
		System.out.println("Dime un número entero ");
		num3 = sc.nextInt();
		
		if (num1 + num2 == num3) {
			System.out.println("La suma de dos de esos numeros da el tercero ");
		}
		else if (num1 + num3 == num2) {
			System.out.println("La suma de dos de esos numeros da el segundo");
		}
		else if (num2 + num3 == num1) {
			System.out.println("La suma de dos de esos numeros da el primero ");
		}
		else {
			System.out.println("La suma de esos dos números no da el tercero ");
		}
		
		sc.close();
	}

}
