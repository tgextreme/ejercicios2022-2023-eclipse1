package main;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("¿De cuánto tamaño quieres el cuadrado?");
		int tamanyo=15;
		for(int i=0;i<tamanyo;i++) {
			for(int o=0;o<tamanyo;o++) {
				if(o==0 || i==0|| i>=tamanyo-1 || o>tamanyo-2 ) {
					System.out.print("x");				}else {
						System.out.print(" ");
					}
				
			}
			System.out.println("");
		}
	}

}
