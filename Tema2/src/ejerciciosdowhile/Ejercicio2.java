package ejerciciosdowhile;

public class Ejercicio2 {

	public static void main(String[] args) {
		// variables
		int num = 2;
		
		do {
			if (num%2 == 0) {
				System.out.println(num);
			}
			num++;
		} while (num <= 200);
	}

}
