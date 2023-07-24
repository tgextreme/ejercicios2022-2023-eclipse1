package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		float a, b, c, formula;
		double resultado, resulta2;
		System.out.println("Escriba el Número A");
		a = entrada.nextFloat();
		System.out.println("Escriba el Número B");
		b = entrada.nextFloat();
		System.out.println("Escriba el Número C");
		c = entrada.nextFloat();
		if (a == 0) {
			System.out.println("Ecuación de Primer Grado");
			if (b == 0) {
				if (c == 0) {
					System.out.println("Siempre la solución es la misma (para todo X)");
				} else
					System.out.println("No tiene solución");
			} else {
				resultado = (-c / b);
				System.out.printf("El resultado es %.2f", resultado);
			}
		} else {
			formula = b * b - 4 * a * c;
			if (formula < 0) {
				System.out.println("Solo para matemáticos");
			}
			if (formula == 0) {
				resultado = -b / (2 * a);
				System.out.println("El resultado es " + resultado);
			}
			if (formula > 0) {
				resultado = (-b + Math.sqrt(formula)) / (2 * a);
				resulta2 = (-b - Math.sqrt(formula)) / (2 * a);
				System.out.printf("Los Resultados son %.2f y %.2f", resultado, resulta2);
			}

		}

	}

}
