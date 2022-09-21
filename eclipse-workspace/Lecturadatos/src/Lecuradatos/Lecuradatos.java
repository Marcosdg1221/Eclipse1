package Lecuradatos;

public class Lecuradatos {

	import java.util.Scanner;
	
	public class Lecturadatos {
		public static void main(String[] args) {
			Scanner lectura = new Scanner (System.in);
		System.out.println("Introduzca un numero:");
		double numero = lectura.nextDouble();
		
		System.out.println(numero);
		
		lectura.close();
		}
	}
}
