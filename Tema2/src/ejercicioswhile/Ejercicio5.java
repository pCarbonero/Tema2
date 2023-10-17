package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Variables
		int num, cuenta = 0, suma = 0, media = 0, totnegative = 0, negcount = 0, total = 0;
		Scanner sc = new Scanner(System.in);
		
		//System.out.println();
		
		while (total < 10) {
			total++;
			System.out.println("Dame un número entero ");
			num = sc.nextInt();
			
			if (num>0) {
				suma += num;
			}
			else if(num < 0) {
				negcount++;
				totnegative += num;
				media = totnegative/negcount;
			}
			else if(num == 0) {
				cuenta++;
			}
		}
		System.out.println("La suma de los numeros positivos es " + suma);
		System.out.println("La media de los nuemro negativos es " + media);
		System.out.println("Y has escrito un total de  " + cuenta + " ceros");

		sc.close();
	}
}
