package ifelse;

import java.util.Scanner;

public class Ejercio9 {

	private static final String TIJERAS = "tijeras";
	private static final String PAPEL = "papel";
	private static final String PIEDRA = "piedra";

	public static void main(String[] args) {
		// Variables
		String j1, j2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qué va a sacar el jugador 1? ");
		j1 = sc.nextLine();
		System.out.println("Qué va a sacar el jugador 2? ");
		j2 = sc.nextLine();
		
		if (j1.equals(PIEDRA) && j2.equals(PIEDRA)) {
			System.out.println("EMPATE");
		}
		else if (j1.equals(PIEDRA)&& j2.equals(PAPEL)) {
			System.out.println("GANA JUGADOR 2 ");
		}
		else if (j1.equals(PIEDRA) && j2.equals(TIJERAS)) {
			System.out.println("GANA JUGADOR 1 ");
		}
		else if (j1.equals(PAPEL) && j2.equals(PIEDRA)) {
			System.out.println("GANA JUGADOR 1 ");
		}
		else if (j1.equals(PAPEL) && j2.equals(PAPEL)) {
			System.out.println("EMPATE ");
		}
		else if (j1.equals(PAPEL) && j2.equals(TIJERAS)) {
			System.out.println("GANA JUGADOR 2 ");
		}
		else if (j1.equals(TIJERAS) && j2.equals(PIEDRA)) {
			System.out.println("GANA JUGADOR 2 ");
		}
		else if (j1.equals(TIJERAS) && j2.equals(PAPEL)) {
			System.out.println("GANA JUGADOR 1 ");
		}
		else if (j1.equals(TIJERAS) && j2.equals(TIJERAS)) {
			System.out.println("EMPATE ");
		}
		
		sc.close();
	}

}
