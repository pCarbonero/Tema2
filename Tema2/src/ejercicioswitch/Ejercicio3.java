
package ejercicioswitch;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Variables
		float num1, num2, res = 0;
		Scanner sc = new Scanner(System.in);
		String op;
		
		System.out.println("Dame un número ");
		num1 = sc.nextFloat();
		System.out.println("Dame otro número ");
		num2 = sc.nextFloat();
		op = sc.nextLine();

		
		System.out.println("A.SUMAR LOS NÚMEROS\r\n"
				+ "B.RESTAR LOS NÚMEROS\r\n"
				+ "C.MULTIPLICAR LOS NÚMEROS\r\n"
				+ "D.DIVIDIR LOS NÚMEROS\r\n"
				+ "");
		/*System.out.println("A.SUMAR LOS NÚMEROS");
		System.out.println("A.SUMAR LOS NÚMEROS");
		System.out.println("A.SUMAR LOS NÚMEROS");
		System.out.println("A.SUMAR LOS NÚMEROS");*/
		op = sc.nextLine();
		
		switch (op) {
		case "A": {
			res = num1 + num2;
			break;
		}
		case "B":{
			res = num1 - num2;
			break;
		}
		case "C":{
			res = num1 * num2;
			break;
		}
		case "D":{
			res = num1/num2;
			break;
		}
		default:
			System.out.println("No es ninguna opción");
		}
		System.out.println(res);
		sc.close();
		
	}

}
