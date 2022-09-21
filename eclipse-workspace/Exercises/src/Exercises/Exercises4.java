package Exercises;

import java.util.Scanner;

public class Exercises4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime la longitud de un círculo");
		float longitud;
		longitud = sc.nextFloat();
		System.out.print("Introduce su area");
		float area;
		float radio;
		radio = longitud / 2;
		float total = (Math.PI * 2 * radio;);
		System.out.println("Círculo" + total);
		}
}
}
