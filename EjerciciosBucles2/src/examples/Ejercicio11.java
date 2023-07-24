package examples;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.print("Introduce un número entero: ");
		int a = s.nextInt();
		
		for (int i = 1; i <= a-1; i++) {
			boolean b = esPrimo(i);
			
			if (b == true) {
				System.out.println(i+" ");
			}
		}
		
		s.close();

	}
	
	public static boolean esPrimo (int a) {
		for (int i = a-1; i > 1; i--) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}	
}
