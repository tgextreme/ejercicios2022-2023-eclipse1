package examples;

import java.util.Scanner;

public class Ejercicio12 {
	static int planta = 0;
		
	public static void main(String[] args) throws InterruptedException {
		Scanner s = new Scanner(System.in);
		System.out.print("¿En qué planta estás? ");
		planta = s.nextInt();
		System.out.print("¿A qué planta quieres ir? ");
		int p = s.nextInt();
		irA(p);
		
		System.out.printf("El ascensor se encuentra en la planta "+planta);
		
		s.close();
	}
	
	private static int irA(int a) throws InterruptedException {
		
		if (a < 0){
			a = 0;
		}
		else {
			if (a > 10) {
				a = 10;
			}
		}
		
		cerrarPuerta();
		if (a > planta) {
			System.out.println(planta);
			Thread.sleep(1000);
			for (int i = planta+1; i <= a; i++) {
				subir();
				Thread.sleep(1000);
				System.out.println(planta);
			}
		}
		else {
			System.out.println(planta);
			Thread.sleep(1000);
			for (int i = planta; i >= a+1; i--) {
				bajar();
				Thread.sleep(1000);
				System.out.println(planta);
			}
		}
		abrirPuerta();
		Thread.sleep(1000);
		
		planta=a;
		return planta;
	
	}	
	
	private static int subir() {
		if (planta == 10) {
			System.out.println("No puedes subir");
		}
		else {
			planta=planta+1;
		}
		return planta;
		
	}
	
	private static int bajar() {
		if (planta == 0) {
			System.out.println("No puedes bajar");
		}
		else {
		planta=planta-1;
		}
		return planta;
		
	}
	
	private static void abrirPuerta() {
		System.out.println("Abriendo puerta.");
		
	}
	
	private static void cerrarPuerta() {
		System.out.println("Cerrando puerta.");
		
	}
}
