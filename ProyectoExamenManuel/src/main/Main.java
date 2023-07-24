package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;

		Ternario ternario = new Ternario();
		String str;

		do {
			try {
				System.out.println("Dígame un número");
				numero = sc.nextInt();
				if (numero >= 1000) {
					throw new Exception("Has puesto un número menor a cero");
				} else if (numero == 0) {
					break;
				}
				str = ternario.comprobarNumero(numero);
				System.out.println(str);

			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		} while (true);

		

		System.out.println("Fin del programa, el usuario ha escrito cero");

	}
}
