package examples;

import java.util.Scanner;

public class Ejercicio13_Test {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int a = 1;
		
		while (a > 0 && a < 3) {
			System.out.print("Elige constructor (1 o 2): ");
			a = s.nextInt();
			if (a == 1) {
				Ejercicio13_Figuras figura1 = new Ejercicio13_Figuras();
				String salir = figura1.setForma(null);
				if (salir.equals("Salir")) {
					System.out.println("Saliste del programa.");
					a = 0;
				}
				else {
					figura1.setTamaño(0);
					figura1.dibujar();
				}
			}
			else {	
				System.out.println("Establece la forma a dibujar: (Cuadrado, Triangulo, Rombo o Salir)");
				String forma = s.next();
				if (forma.equals("Salir")) {
					System.out.println("Saliste del programa");
					a = 0;
				}
				else {
					System.out.println("Establece el ancho de la figura a dibujar: ");
					int tamaño = s.nextInt();
					Ejercicio13_Figuras figura2 = new Ejercicio13_Figuras(forma,tamaño);

					figura2.dibujar();
				}
			}
		}
		s.close();
	}
		
}
