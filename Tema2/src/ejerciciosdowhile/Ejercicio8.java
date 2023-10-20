package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Variables
		String t1, t2;
		int num1 = 0, num2 = 0, res = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Dame la primera tirada ");
			t1 = sc.nextLine();
			
			num1 = switch (t1) {
			case "UNO": {	
				yield 1;		
			}
			case "DOS": {	
				yield 2;
			}
			case "TRES": {
				yield 3;
			}
			case "CUATRO": {
				yield 4;
			}
			case "CINCO": {
				yield 5;
			}
			case "SEIS": {
				yield 6;
			}
			default:
				System.out.println("Algo has puesto mal espabila ");
				yield 0;
			};
			
		} while (num1 == 0);
		
		do {
			System.out.println("Dame la segunda tirada ");
			t2 = sc.nextLine();
			
			num2 = switch (t2) {
			case "UNO": {	
				yield 1;		
			}
			case "DOS": {	
				yield 2;
			}
			case "TRES": {
				yield 3;
			}
			case "CUATRO": {
				yield 4;
			}
			case "CINCO": {
				yield 5;
			}
			case "SEIS": {
				yield 6;
			}
			default:
				System.out.println("Algo has puesto mal espabila ");
				yield 0;
			};
			
		} while (num2 == 0);
		
		res = num1 + num2;
		System.out.println("La suma de tus tiradas es " + res);
		sc.close();

	}

}
