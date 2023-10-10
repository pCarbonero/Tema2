package ejercicioswitch;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// variable
		String letra;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime la letra de tu carnet de conducir ");
		letra = sc.nextLine();
		
		switch (letra) {
		case "E": {
			System.out.println("Remolques");
			break;
		}
		case "D": {
			System.out.println("Autobuses");
			break;
		}
		case "C1", "C2", "C3", "C4", "C5": {
			System.out.println("Camiones");
			break;
		}
		case "A": {
			System.out.println("Motocicletas");
			break;
		}
		case "B1", "B2": {
			System.out.println("Automóviles");
			break;
		}
		default:
			System.out.println("Categoría no contemplada ");
			break;
		}
		
		sc.close();
	}

}
