package ejercicioswitch;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Variables
		int nota;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número ");
		nota = sc.nextInt();
		
		switch (nota) {
		case 0,1,2,3,4: {
			System.out.println("Insuficiente");
			break;
		}
		case 5:{
			System.out.println("Suficiente");
			break;
		}
		case 6:{
			System.out.println("Bien");
			break;
		}
		case 7,8:{
			System.out.println("Notable");
			break;
		}
		case 9,10:{
			System.out.println("Sobresaliente");
			break;
		}
		default:
			System.out.println("No puedes saar esa nota ");
			break;
		}
		
		sc.close();
	}

}
