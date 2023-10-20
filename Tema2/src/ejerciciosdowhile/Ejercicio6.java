package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Variables
		String j1 = "", j2 = "", continua = "";
		Scanner sc = new Scanner(System.in);
		
		do {
			do {
				System.out.println("Qué va a sacar el j1? ");
				j1 = sc.nextLine();
				
			} while (!j1.equals("TIJERAS") && !j1.equals("PAPEL") && !j1.equals("PIEDRA"));
			
			do {
				System.out.println("Qué va a sacar el j2? ");
				j2 = sc.nextLine();
				
			} while (!j2.equals("TIJERAS") && !j2.equals("PAPEL") && !j2.equals("PIEDRA"));
		
			if (j1.equals("PIEDRA") && j2.equals("PIEDRA")) {
				System.out.println("EMPATE");
			}
			else if (j1.equals("PIEDRA")&& j2.equals("PAPEL")) {
				System.out.println("GANA JUGADOR 2 ");
			}
			else if (j1.equals("PIEDRA") && j2.equals("TIJERAS")) {
				System.out.println("GANA JUGADOR 1 ");
			}
			else if (j1.equals("PAPEL") && j2.equals("PIEDRA")) {
				System.out.println("GANA JUGADOR 1 ");
			}
			else if (j1.equals("PAPEL") && j2.equals("PAPEL")) {
				System.out.println("EMPATE ");
			}
			else if (j1.equals("PAPEL") && j2.equals("TIJERAS")) {
				System.out.println("GANA JUGADOR 2 ");
			}
			else if (j1.equals("TIJERAS") && j2.equals("PIEDRA")) {
				System.out.println("GANA JUGADOR 2 ");
			}
			else if (j1.equals("TIJERAS") && j2.equals("PAPEL")) {
				System.out.println("GANA JUGADOR 1 ");
			}
			else if (j1.equals("TIJERAS") && j2.equals("TIJERAS")) {
				System.out.println("EMPATE ");
			}
			
			System.out.println("Quieres seguir? S/N");
			continua = sc.nextLine();

		} while (continua.equals("S"));
		
		System.out.println("Gracias por jugar");
		sc.close();
	
	}

}
