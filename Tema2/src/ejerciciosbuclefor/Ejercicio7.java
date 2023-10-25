package ejerciciosbuclefor;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//variable para guardar el numero que vamos a introducir y para guardar 
		//el factorial
		int n;
		double factorial = 1;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dame un número para calcular su factorial ");
		n = sc.nextInt();		
		
		for (int i = n; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
		sc.close();
	}

}
