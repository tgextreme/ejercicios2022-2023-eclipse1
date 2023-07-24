package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra = obtenerPalabra();
		String palabra1 = espaciosPalabra(palabra);
		String descomponer = "";
		int numIntentos = 5;
		int posicion = 0;
		String letra;
		String intermedio = "";
		boolean ganar = false;
		while (numIntentos != 0) {
			descomponer = "";
			for (int i = 0; i < palabra1.length(); i++) {
				descomponer = descomponer + " " + palabra1.charAt(i);
			}

			System.out.println(numIntentos + " intentos ");
			System.out.println("La palabra " + descomponer);
			System.out.println("Dígame posición");
			posicion = (sc.nextInt() - 1);
			System.out.println("Dígame letra");
			letra = sc.next();
			intermedio = "";
			if (palabra.charAt(posicion) == letra.charAt(0)) {
				for (int i = 0; i < palabra.length(); i++) {
					if (i == posicion) {
						intermedio = intermedio + letra;
					} else {
						intermedio = intermedio + palabra1.charAt(i);
					}
				}
				palabra1 = intermedio;
			} else {
				numIntentos--;
			}
			
			if (palabra1.equals(palabra)) {
				ganar = true;
				break;
			}

		}
		if (ganar) {
			System.out.println("Has ganado");
		} else {
			System.out.println("Has perdido");
		}
	}

	public static String obtenerPalabra() {
		String a[] = { "humanidad", "humano", "persona", "gente", "hombre", "mujer", "adolescente", "caballero", "dama",
				"individuo" };

		int numero = (int) ((Math.random() * 1000) % a.length);
		String palabra = a[numero];
		return palabra;
	}
	
	public static String espaciosPalabra(String palabra) {
		String intermedio="";
		
		for(int i=0;i<palabra.length();i++) {
			if(i==0||i==palabra.length()-1) {
				intermedio=intermedio+palabra.charAt(i);
			}else {
				intermedio=intermedio+"_";
			}
		}
		
		
		
		return intermedio;
	}

}
