package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dígame palabra");
		String palabra = sc.nextLine();
		String guion = cambiarPalabra(palabra);
		System.out.println(guion);
	}

	public static String cambiarPalabra(String str) {
		String intermedio = "";
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == ' ' || str.charAt(i) == 'i'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'á' || str.charAt(i) == 'é'
					|| str.charAt(i) == 'í' || str.charAt(i) == 'ó' || str.charAt(i) == 'ú') {

				intermedio = intermedio + str.charAt(i);

			} else {
				intermedio = intermedio + "_";
			}
		}
		return intermedio;
	}
}
