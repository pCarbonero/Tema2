package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variables
		int num = 0;
		String men;
		Scanner sc = new Scanner(System.in);
		//////
		System.out.println("Dame un número entero ");
		num = sc.nextInt();
		
		while (num != 0) {		
			men = (num%2 == 0) ? "Es par" : "Es impar";
			
			System.out.println(men);
			System.out.println("Dame otro número, si quieres parar escribe 0");
			num = sc.nextInt();
		}
		
		System.out.println("Tu número es 0");
		sc.close();

	}

}
