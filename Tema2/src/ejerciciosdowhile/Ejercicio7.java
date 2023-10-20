package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Variables
		float num1 = 0, num2 = 0, res;
		String op;
		Scanner sc = new Scanner(System.in);
		
		
		do {
						
			System.out.println("A.SUMAR LOS NÚMEROS\r\n"
					+ "B.RESTAR LOS NÚMEROS\r\n"
					+ "C.MULTIPLICAR LOS NÚMEROS\r\n"
					+ "D.DIVIDIR LOS NÚMEROS\r\n"
					+ "E.SALIR\r\n"
					+ "");
			op = sc.nextLine();
			
			if (!op.equals("E")) {
				System.out.println("Dame un número ");
				num1 = sc.nextFloat();
				System.out.println("Dame otro número ");
				num2 = sc.nextFloat();
				
			}

			
			switch (op) {
			case "A": {
				res = num1 + num2;
				System.out.println(res);
				op = sc.nextLine();//ESTO SIRVE PARA LIMPIAR LA VARIABLE Y ASI AL REPETIR EL BUCLE TE VUELVE A PEDIR LA LETRA
				break;
			}
			case "B":{
				res = num1 - num2;
				System.out.println(res);
				op = sc.nextLine();
				break;
			}
			case "C":{
				res = num1 * num2;
				System.out.println(res);
				op = sc.nextLine();
				break;
			}
			case "D":{
				res = num1/num2;
				System.out.println(res);
				op = sc.nextLine();
				break;
			}
			case "E":{
				System.out.println("Has salido");
				break;
			}
			default:
				System.out.println("No es ninguna opción");
			}
		} while (!op.equals("E"));
		
		sc.close();

	}

}
