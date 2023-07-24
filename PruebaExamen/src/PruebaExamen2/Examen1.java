package PruebaExamen2;

import java.util.Scanner;

public class Examen1 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	
		for(char letras='Z';letras>='A';letras--) {
			for(char letras1=letras;letras1>='A';letras1--) {
			System.out.print(letras1);
			}
			System.out.println();
		}
	}
}
	