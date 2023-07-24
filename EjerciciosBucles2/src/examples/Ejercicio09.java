package examples;

import java.util.Scanner;

public class Ejercicio09 {

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

		int a = 0, i = 0;

		do {
			a++;
			System.out.println();
			i = 0;
			do {
				System.out.print("*");
				i++;
			}while (i < c);
			
		} while (a < f);

		s.close();

	}

}
