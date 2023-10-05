package ifelse;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Variables
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número");
		num = sc.nextInt();
		
		if (num%2 == 0) {
			
			System.out.println("Tu número es par");
		}
		else {
			System.out.println("Tu número es impar");
		}
		
		sc.close();
	}

}
