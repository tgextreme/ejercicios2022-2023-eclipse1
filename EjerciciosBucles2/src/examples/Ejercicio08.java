package examples;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int a = 0;
		
		do {
			System.out.print("Introduce un número entre 1 y 10: ");
			a = s.nextInt();
			
			if (a > 0 && a < 11) {
				for (int i = 0; i <= 10; i++) {
					System.out.println(a+" x "+i+" = "+(a*i));
				}
				System.out.println();
			}
			
		}while (a != 0);
		
		s.close();

	}

}
