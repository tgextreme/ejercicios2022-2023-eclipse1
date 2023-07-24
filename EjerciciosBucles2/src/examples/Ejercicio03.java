package examples;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a = 0, mul = 0;
		
		do {
			System.out.println("Introduce un número entre el 1 y el 10.");
			a = s.nextInt();
		}
		while (a < 1 || a > 10);
		
		for (int i = 0; i <= 10; i++) {
			mul = a * i;
			System.out.println(a+"x"+i+"="+mul);
		}
		
		s.close();

	}

}
