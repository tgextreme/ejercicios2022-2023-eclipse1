package examples;

import java.util.Scanner;

public class Ejercicio13_Figuras {
	Scanner s = new Scanner(System.in);

	private String forma;
	private int tamaño;
	
	public Ejercicio13_Figuras() {
		System.out.println("Creando una figura...");
		
	}
	
	public Ejercicio13_Figuras(String f, int t) {
		forma = f;
		tamaño = t;
		
	}
	
	public String setForma(String figura) {
		System.out.print("Establece la forma a dibujar: (Cuadrado, Triangulo, Rombo o Salir)");
		forma = s.next();
		String noForma = "Salir";
		if (forma.equals("Cuadrado") || forma.equals("Triangulo") || forma.equals("Rombo")) {
			return forma;
		}
		else if (forma.equals("Salir")){
			return noForma;
		}
		else {
			return null;
		}
	}
	
	public int setTamaño(int tamaño) {
		System.out.print("Establece el ancho de la figura a dibujar: ");
		this.tamaño = s.nextInt();
		if (this.tamaño % 2 == 0) {
			this.tamaño = this.tamaño + 1;
		}
		return this.tamaño;
	}
	
	public void dibujar () {
		if (forma.equals("Cuadrado")) {
			int a = 0, i = 0;
			
			do {
				for (a = tamaño; a > 0; a--) {
					for (i = tamaño; i > 0; i--) {
					System.out.print("*");
					
					}
					System.out.println();
				}	
				
			}while(a > 0 && i > 0);
			
		}
		else if (forma.equals("Triangulo")) {
			int a = 0, i = 0;
			
			do {
				for (a = tamaño; a > 0; a--) {
					for (i = tamaño; i > 0; i--) {
					System.out.print("*");
					
					}
					System.out.println();

					tamaño = tamaño - 1;
				}	
				
			}while(a > 0 && i > 0);
		}
		else if (forma.equals("Rombo")) {
			int a = 0, b = 0, i = 0;
			
			int div = tamaño/2 + 1;
				
			for(a = 1; a <= div; a++){
				for(b = 1; b <= div - a; b++){
					System.out.print(" ");
				}
				for(i = 1; i <= (2*a) - 1; i++){
					System.out.print("*");
				}
				System.out.println("");			
			}
			
			div--;
			
			for(a = 1; a <= div; a++){
				for(b = 1; b <= a; b++){
					System.out.print(" ");
				}
				for(i = 1; i <= (div-a) * 2 + 1; i++){
					System.out.print("*");
				}
				System.out.println();
			}
		
		}
		else {
			System.out.println("La forma no es posible de realizar.");
		}
	}
	
}
