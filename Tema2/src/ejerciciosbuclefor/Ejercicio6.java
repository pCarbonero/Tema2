package ejerciciosbuclefor;

public class Ejercicio6 {

	public static void main(String[] args) {
		//variable para almacenar la suma de los numeros
		int n = 0, cont = 0;
		
		//bucle que suma a i dos de forma que solo sea impar
		for (int i = 1; i <= 20; i+=2) {
			n += i;// suma cada valor de i
			cont++;//contador que suma uno cada vez que se suma un numero impar
			if (cont == 10) {//una vez sume los 10 primeros numeros para
				break;
			}
		}
		System.out.println(n);//imprime el resultado por la consola
	}

}
