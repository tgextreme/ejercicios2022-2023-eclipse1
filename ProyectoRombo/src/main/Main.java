package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int rombo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dígame  tamaño del rombo");
		rombo = 26;
		int romboIntermedio = rombo;
		int contador = rombo;
		int contador2 = 1;

		while (contador > 0) {
			for (int i = 0; i < contador + 1; i++) {
				System.out.print(" ");

			}
			for (int i = 0; i < (contador2 * 2) - 1; i++) {
				System.out.print("a");

			}
			System.out.println("");
			contador--;
			contador2++;
		}
		contador2 = rombo-1;
		contador = 1;
		
		while (contador2 != 0) {
			System.out.print(" ");
			System.out.print(" ");

			for (int i = 0; i < contador; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i <= (contador2 * 2)-2 ; i++) {
				System.out.print("a");

			}
			System.out.println("");

			contador++;
			contador2--;
		}

	}
}
