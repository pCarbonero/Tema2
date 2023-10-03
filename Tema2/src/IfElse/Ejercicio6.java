package IfElse;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// variables
		double a, b, c;
		double x;
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("dame un valor para a ");
		a = sc.nextInt();
		System.out.println("dame un valor para b ");
		b = sc.nextInt();
		System.out.println("dame un valor para c ");
		c = sc.nextInt();
		
		x=(-b + Math.sqrt((Math.pow(b, 2)-4*a*c)));
	}

}
