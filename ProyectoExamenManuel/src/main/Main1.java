package main;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Figura figura = new Figura();
		int numero;
		while (true) {
			System.out.println("Dígame un número");
			numero=sc.nextInt();
			figura.dibujarFigura(numero);
			

		}
	}

}
