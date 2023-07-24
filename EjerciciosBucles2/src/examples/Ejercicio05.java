package examples;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		int a = s.nextInt();

		for (int i = a; i > 0; i = i - 2) {
			System.out.println(i + " ");
		}

		s.close();

	}

}
