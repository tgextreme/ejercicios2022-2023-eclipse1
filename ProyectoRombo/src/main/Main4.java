package main;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n = 0;
		float m = 0;
		float suma = 0;
		do {
			System.out.println("Introduce el valor n: ");
			n = Float.parseFloat(sc.nextLine());
			System.out.println("Introduce el valor m: ");
			m = Float.parseFloat(sc.nextLine());
			if (n <= m)
				System.out.println("n tiene que ser mayor que m!");
		} while (n <= m);

		for (int x = 1; x <= m; x++) {
			float mul = 1;
			for (float s = n - x; s > 0; s--) {
				mul *= s;
			}
			suma = suma + x / mul;
		}

		System.out.printf("%.2f", suma);

	}

}
