package ejerciciosbuclefor;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Variable para guardar los números
		int a, b;
		//creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//pedimos los numeros y los guardamos en las variables
		System.out.println("Dime el primer número ");
		a = sc.nextInt();
		System.out.println("Dime el segundo número. Tiene que ser mayor que el anterior ");
		b = sc.nextInt();
		
		if (b > a) {			
			for (int i = a; i <= b; i++) {
				System.out.println(i);
			}
		}
		else if (b < a){
			System.out.println("No es posible hacerlo ya que b es menor que a");
		}
		else if(a == b) {
			System.out.println("No es posible hacerlo ya que b es igual que a");
		}
		
		//cerramos el escaner
		sc.close();
	}

}
