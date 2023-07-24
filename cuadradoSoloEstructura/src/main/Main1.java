package main;

public class Main1 {
	public static void main(String[] args) {
		int numero = 15;
		int n1 = numero;
		for (int i = 0; i < numero; i++) {
			for (int o = 0; o < n1; o++) {
				System.out.print(" ");

			}
			
			for (int u = 0; u <= numero * 2 - n1*2; u++) {
				if (u == 0 || u >=(numero * 2 - n1*2)||i==numero-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			n1--;
			System.out.println("");
		}
		System.out.println(" ");
	}
}
