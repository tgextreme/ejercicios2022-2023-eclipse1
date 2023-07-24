package examples;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int a = s.nextInt();
		
		do {
			System.out.println(a);
			a = a - 2;
		}
		while (a != 0 && a > 0);
		
		s.close();

	}

}
