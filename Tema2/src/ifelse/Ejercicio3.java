package ifelse;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Variables
		float num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número decimal ");
		num = sc.nextFloat();
		
		if (num!=1 && num!=-1 && num!=0 &&(num>-1 && num<1)) {
			System.out.println("ES CASI 0");
		}
		else {
			System.out.println("NO ES");
		}
		
		sc.close();
	}

}
