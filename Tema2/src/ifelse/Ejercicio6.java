package ifelse;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// variables
		double a, b, c;
		double x1, x2;
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("dame un valor para a ");
		a = sc.nextInt();
		System.out.println("dame un valor para b ");
		b = sc.nextInt();
		System.out.println("dame un valor para c ");
		c = sc.nextInt();
		
		if ((Math.pow(b, 2)-4*a*c) >= 0 && 2*a != 0) {
			
			x1=(-b + Math.sqrt((Math.pow(b, 2)-4*a*c)))/(2*a);
			x2=(-b - Math.sqrt((Math.pow(b, 2)-4*a*c)))/(2*a);	
			
			System.out.println("Las soluciones son " + x1 + " y " + x2);
		}
		else {
			System.out.println("No tiene solución ");				
		}
		
		sc.close();
	}

}
