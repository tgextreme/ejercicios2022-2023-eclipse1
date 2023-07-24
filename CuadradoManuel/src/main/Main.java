package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese tamaño del cuadrado: ");
		int n = teclado.nextInt();
		String asteriscos = "";
		int grosor = (int) (n * 0.15);
		for (int i = 0; i < grosor; i++) {
			asteriscos = asteriscos + "*";
		}

		if (n >= 20 && n <= 150) {
			for (int o = 0; o < grosor; o++) {
				for (int i = 0; i < n; i++) {
					System.out.print("*");
				}
				System.out.println();

			}
			for (int i = 0; i < n - 2; i++) {
				for (int o = 0; o < grosor / 2; o++) {
					System.out.print(asteriscos);
					for (int contador = 0; contador < n - grosor * 2; contador++) {
						System.out.print(" ");
					}
					System.out.println(asteriscos);
				}
			}

			for (int o = 0; o < grosor; o++) {
				for (int i = 0; i < n; i++) {

					System.out.print("*");
				}
				System.out.println("");
			}
		} else {
			System.out.println("Error. debe " + "estar entre 20 y 150");
		}
	}
}
