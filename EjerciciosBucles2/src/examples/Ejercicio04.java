package examples;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		
		System.out.print("Introduce un número para calcular su factorial: ");
		int a = s.nextInt();
		int b = 1;
		int c = a;
		
		do {
			b = b * a;
			a--;
		}
		while (a > 0);
		
		if (b > 0) {
		System.out.println("El factorial de "+c+" es: "+b);
		}
		else {
			System.out.println("No se puede calcular su factorial");
		}
		
		s.close();

	}

}
