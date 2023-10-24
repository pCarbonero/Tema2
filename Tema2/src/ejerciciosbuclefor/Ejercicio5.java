package ejerciciosbuclefor;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//variables para almacenar el numero insertado, para guardar la suma de todos
		//y para guardar la media de los números
		int n, media, suma = 0;
		//variable escaner
		Scanner sc = new Scanner(System.in);
		
		//bucle que cada vez que i suma 1 pregunta por un numero nuevo
		for (int i = 1; i <= 10; i++) {	
			System.out.println("Dame un número ");
			n = sc.nextInt();//almacena el numero en la variable n
			suma += n;//suma el valor de n a suma
		}
		//hacemos la media de los números
		media = suma/10;
		//imprimimos el resultado
		System.out.println("La media de esos números es " + media);
		//cerramos el escaner
		sc.close();
	}

}
