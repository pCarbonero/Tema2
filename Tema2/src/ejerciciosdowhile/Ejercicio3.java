package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// variables
		int max, num = 0, suma = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número " );
		max = sc.nextInt();
		
		do {
			suma += num;
			num++;
		} while (num <= max);
		System.out.println(suma);
		sc.close();
	}

}
