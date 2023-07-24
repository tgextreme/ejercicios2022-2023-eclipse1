package PruebaExamen;

import java.util.Scanner;

public class Examen {
	static int tam;

	public static void main(String[] args) {
		int op;
		boolean exit = false;
		Scanner sc = new Scanner(System.in);
	
		do {
			System.out.println("*****MENU*****");
			System.out.println("1) Multipicacion rusa");
			System.out.println("2)Dibujar un cuadrado");
			System.out.println("3)Salir");
			System.out.println();
 
			System.out.println("Introduce una opcion: ");
			try {
				op = Integer.parseInt(sc.nextLine());
				switch (op) {
				case 1 -> {
					System.out.println("Introduce el multiplicador: ");
						int num1 = Integer.parseInt(sc.nextLine());
					System.out.println("Introduce el multiplicando: ");
						int num2 = Integer.parseInt(sc.nextLine());
					
					System.out.println(MultiplicacionRusa(num1, num2));
					System.out.println();
				}
				case 2 -> {
					System.out.println("Introduce tamaño: ");
						tam = Integer.parseInt(sc.nextLine());
						while(tam%2!=0) {
							System.out.println("Introduce un numero par: ");
							tam=Integer.parseInt(sc.nextLine());
						}
					DibujarCuadrado();
					System.out.println();
				}
				case 3 -> exit = true;
	
				default -> {
					System.out.println("Opcion Invalida");
					System.out.println();
					}
				}
			}catch(Exception ex) {
				System.out.println(ex.toString());
				System.out.println();
			}

		} while (!exit);

		System.out.println("Has salido");
	}

	private static void DibujarCuadrado() {

		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				if ((i == 0 || j == 0) || (i == tam - 1 || j == tam - 1) || (i == j))
					System.out.print(" * ");
				else
					System.out.print("   ");

			}
			System.out.println();

		}
	}

	private static int MultiplicacionRusa(int multiplicador, int multiplicando) {
		
		if (multiplicador == 0) {
				return 0;
		}else {
			if(multiplicador%2==1)
				return multiplicando+MultiplicacionRusa(multiplicador / 2, multiplicando * 2);
			else
			return MultiplicacionRusa(multiplicador / 2, multiplicando * 2);
		}
		
	}

}
