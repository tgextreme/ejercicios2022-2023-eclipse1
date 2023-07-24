package examples;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Introduce un número de filas: ");
		int f = s.nextInt();
		System.out.print("Introduce un número de columnas: ");
		int c = s.nextInt();

		if (f > 10) {
			f = 10;
		}

		if (c > 10) {
			c = 10;
		}

		for (int a = f; a > 0; a--) {
			for (int i = c; i > 0; i--) {
				System.out.print("*");

			}
			System.out.println();
		}

		s.close();

	}

}
