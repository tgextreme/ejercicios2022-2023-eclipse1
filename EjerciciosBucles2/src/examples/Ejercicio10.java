package examples;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.print("Introduce un número entero: ");
		int a = s.nextInt();
		boolean b = esPrimo(a);
		System.out.println(b);
		
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
