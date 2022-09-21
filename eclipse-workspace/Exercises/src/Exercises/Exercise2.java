package Exercises;

import java.util.Scanner;

public class Exercise2 {
	
				public static void main(String[] args) {
					Scanner sc = new Scanner(System.in);
					System.out.print("¿Cuando naciste?");
					float numero;
					numero = sc.nextFloat();
					System.out.print("¿Cual es la fecha de hoy?");
					float fecha;
					fecha = sc.nextFloat();
					float total = (fecha - numero);
					System.out.println("Tienes: " + total);
					}
			}