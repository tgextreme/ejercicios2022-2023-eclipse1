package examples;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		
		int a = r.nextInt(100)+1;
		int b = 0;
		int cont = 0;
		
		do {
			System.out.println("Intenta adivinar el número que he pensado.\nEscribe un número del 1 al 100");
			b = s.nextInt();
			if (b < a) {
				System.out.println("El número es más grande.");
			}
			else if (b > a){
				System.out.println("El número es más pequeño.");
			}
			else if (b == a) {
				System.out.println("Correcto.");
			}
			cont++;
		}
		while (b != a);
		
		System.out.println("¡Has acertado en "+cont+" intentos!");
		
		s.close();

	}

}
