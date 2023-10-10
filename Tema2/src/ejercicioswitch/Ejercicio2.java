package ejercicioswitch;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Variables
		int dia;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero del uno al 7 ");
		dia = sc.nextInt();
		
		switch (dia) {
		case 1: {
			System.out.println("Lunes ");
			break;
		}
		case 2:{
			System.out.println("Martes ");
			break;
		}
		case 3: {
			System.out.println("Miércoles ");
			break;
		}
		case 4: {
			System.out.println("Jueves ");
			break;
		}
		case 5: {
			System.out.println("Viernes ");
			break;
		}
		case 6:{
			System.out.println("Sábado ");
			break;
		}
		case 7:{
			System.out.println("Domingo ");
			break;
		}
		default:
			System.out.println("No existe un día de la semana para ese número :( ");
		}
		
		sc.close();
	}

}
