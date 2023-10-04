package IfElse;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Variables 
		int num, res;
		String chain;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número entre 0 y 99.999 ");
		num = sc.nextInt();
		
		if (num >= 0 && num <= 99999) {
								
			chain = Integer.toString(num);
			res = chain.length();
			
			if (num<10) {
				System.out.println("Tu número tiene " + res + " cifra");
			}
			else {
				System.out.println("Tu número tiene " + res + " cifras");			
			}
		}
		else {
			System.out.println("Tu número no está entre 0 y 99999!! ");
		}

		sc.close();
	}

}
