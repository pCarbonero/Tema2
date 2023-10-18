package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// varaibles
		int arbol, newArbol, highArbol = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuanto mide el primer árbol? ");
		newArbol = sc.nextInt();
		//arbol = newArbol;
		
		while (newArbol > -1) {
			
			if (newArbol > highArbol) {
				highArbol = newArbol;
			}
			
			System.out.println("Dime cuanto mide el siguiente árbol, si quieres parar escibre -1 ");
			newArbol = sc.nextInt();
		}
		
		System.out.println("El árbol más alto mide " + highArbol);
		sc.close();
	}

}
