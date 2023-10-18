package ejercicioswhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Variables
		Random ran = new Random(); 
		int num, guess = 0;
		String text;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intenta adivinar un número entre el 1 al 100 ");
		guess = sc.nextInt();
		
		num = ran.nextInt(1,101);
		
		while (guess != num && guess != -1) {
			
			if (guess > num) {
				System.out.println("El número es mayor ");
			}
			else {
				System.out.println("El número es menor ");
			}
			System.out.println("Intentalo otra vez o rindete escribiendo -1 ");
			guess = sc.nextInt();
		}
		
		if (guess == num) {
			System.out.println("Has acertado el número es " + num);
		}
		else {
			System.out.println("Lo siento :(, el número es " + num);
		}
		
		sc.close();
	}

}
