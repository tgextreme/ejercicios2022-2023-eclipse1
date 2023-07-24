package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f;
		int z;

		int eleccion = 0;
		while (eleccion != 3) {
			System.out.println("1) Dibujar por pantalla la letra F");
			System.out.println("2) Dibujar por pantalla la letra Z");
			System.out.println("3) Salir del programa");

			eleccion = sc.nextInt();

			switch (eleccion) {
			case 1:
				dibujarF();
				break;
			case 2:
				dibujarZ();
				break;
			case 3:
				System.out.println("Saliendo");
				break;
			}
		}
	}

	static void dibujarF() {
		for(int i=0;i<5;i++) {
			if(i%2==0 && i!=4) {
				System.out.println("******");
				
			}else {
				System.out.println("*");
								
			}
			
			
		}

	}

	static void dibujarZ() {
		
		for(int i=0;i<8;i++) {
			if(i==0||i==7) {
				System.out.println("********");
				
				
				
			}else {
				for(int o=i;o<7;o++) {
					System.out.print( " ");
				}
				System.out.print( "* \n");
			}
			
			
			
		}

	}
}
