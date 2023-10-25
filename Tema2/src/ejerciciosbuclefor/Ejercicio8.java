package ejerciciosbuclefor;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// variable para guardar las notas
		int nota;
		boolean didPass = false;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Dime la nota del alumno ");
			nota = sc.nextInt();
			
			if (nota <= 4) {
				didPass = true;
			}
		}
		if (didPass) {
			System.out.println("Si hay");
		}
		else {
			System.out.println("No hay");
		}
		
		sc.close();
	}

}
