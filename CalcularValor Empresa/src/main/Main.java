package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double precio, ganancia, impuesto, precioFinal;
		Scanner sc= new Scanner(System.in);
		System.out.println("Escríbeme un valor");
		precio=sc.nextDouble();
		ganancia=precio*0.20;
		impuesto=(precio+ganancia)*0.20;
		precioFinal=precio+ganancia+impuesto;
		System.out.println("Para el precio "+precio+" la ganancia sería "+ganancia+" Los empleados, empresario y empresa se llevan 0,33 de ganancia, es decir,"+(ganancia*0.33)+" el estado se lleva de impuestos "+impuesto+" el precio final es "+precioFinal);

	}

}
