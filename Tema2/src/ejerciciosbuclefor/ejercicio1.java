package ejerciciosbuclefor;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// variable para el nuemro hasta el que queremos contar
		int n;
		//escaner
		Scanner sc = new Scanner(System.in);
		
		//pedimos el número al usuario
		System.out.println("Dime un núemro entero ");
		//guardamos el número en la variable n
		n = sc.nextInt();
		
		//creamos el bucle que hará que la variable i incremente de 1 al nº n
		for (int i = 1; i <= n; i++) {
			System.out.println(i);			
		}
		sc.close();
	}

}
