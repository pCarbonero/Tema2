package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Variables
		int num, res, factor = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un numerito ");
		num = sc.nextInt();
		do {
			res = num*factor;
			System.out.println(num + " * " + factor + " = " + res);
			factor++;
		} while (factor<=10);
		sc.close();
	}

}
