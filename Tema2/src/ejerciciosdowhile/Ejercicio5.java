package ejerciciosdowhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variable
		int max, min, randNum;
		Random rand = new Random();
		String comp = "";
		Scanner sc = new Scanner(System.in);
		
		min = 1;
		max = 101;
		randNum = rand.nextInt(min, max);
		

		do {
			System.out.println("Tu número es... " + randNum);	
			comp = sc.nextLine();
			
			if (comp.equals("menor")) {	
				max = randNum;
				randNum = rand.nextInt(min, max);
			}
			else if (comp.equals("mayor")) {	
				min = randNum;
				randNum = rand.nextInt(min, max);
			}
			
			
		} while (!comp.equals("igual"));
		
		System.out.println("ACERTÉ! Tu número es " + randNum);
		sc.close();
	}

}
