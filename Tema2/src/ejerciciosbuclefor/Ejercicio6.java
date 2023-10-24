package ejerciciosbuclefor;

public class Ejercicio6 {

	public static void main(String[] args) {
		//variable para almacenar la suma de los numeros
		int n = 0;
		
		//bucle que suma a i dos de forma que solo sea impar
		for (int i = 1; i <= 10; i+=2) {
			n += i;// suma cada valor de i
		}
		System.out.println(n);//imprime el resultado por la consola
	}

}
