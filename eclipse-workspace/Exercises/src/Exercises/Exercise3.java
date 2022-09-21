package Exercises;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número");
		float numerone;
		numerone = sc.nextFloat();
		System.out.print("Introduce otro");
		float numerdos;
		numerdos = sc.nextFloat();
		float total = ((numerone + numerdos)/2);
		System.out.println("La media de esos dos numeros es " + total);
		}
}
