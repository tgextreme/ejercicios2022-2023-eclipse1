package main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		boolean continuar = true;
		int numero;

		int[] factoresNumero1;
		int segundoNumero;
		int[] factoresNumero2;
		Scanner sc = new Scanner(System.in);
		boolean ambi = false;
		int contador=0;
		while (continuar) {
			try {

				System.out.println("Dígame número a comprobar");
				numero = sc.nextInt();
				contador=0;
				if (numero > 1000) {
					throw new Exception("Has puesto un número superior a 1000");
				}
				do {
					factoresNumero1 = factorizar(numero);
					segundoNumero = sumarCifra(factoresNumero1);
					// factoresNumero2 = factorizar(segundoNumero);
					// ambi = isAmbicioso(factoresNumero1, factoresNumero2);
					if (isPerfecto(segundoNumero)&& contador>0) {
						System.out.println("Es ambicioso y "+segundoNumero+" es perfecto");
						continuar=false;
						break;
					}
					/*
					 * if (ambi) { System.out.println("Es ambicioso"); continuar = false; } else {
					 * System.out.println("No es ambicioso"); }
					 */
					numero = segundoNumero;
					contador++;
				} while (factoresNumero1.length != 1);
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}

	}

	static int[] factorizar(int numero) {
		ArrayList<Integer> arr = new ArrayList();

		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				arr.add(i);
				// numero = numero / i;
				//System.out.println(i);
			}
		}

		int[] arr2 = new int[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			arr2[i] = arr.get(i);
		}
		Arrays.sort(arr2);

		return arr2;
	}

	static int sumarCifra(int[] arr) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}
		return total;
	}

	static boolean isAmbicioso(int[] arr1, int[] arr2) {
		int mayor = 0;
		int suma1 = 0, suma2 = 0;
		boolean ambicioso = true;
		if (arr1.length > arr2.length) {
			mayor = 1;
		} else {
			mayor = 2;
		}

		if (mayor == 1) {
			int cont = 1;
			for (int i = 0; i < arr2.length; i++) {
				if (arr1[i] == arr2[i]) {
					cont++;
				}

			}
			if (cont == arr2.length) {
				return true;
			} else {
				return false;
			}

		} else {
			int cont = 1;
			for (int i = 0; i < arr1.length; i++) {
				if (arr2[i] == arr1[i]) {
					cont++;
				}

			}
			if (cont == arr1.length) {
				return true;
			} else {
				return false;
			}
		}
	}

	static boolean isPerfecto(int numero) {
		int total = 0;
		ArrayList<Integer> arr = new ArrayList();

		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				arr.add(i);

			}
		}

		int[] arr2 = new int[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			arr2[i] = arr.get(i);
		}
		for (int i = 0; i < arr2.length; i++) {
			total = total + arr2[i];
		}
		if (numero == total) {
			return true;
		} else {
			return false;
		}

	}

	// return false;

}
