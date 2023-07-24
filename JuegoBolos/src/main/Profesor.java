package main;

import java.util.Scanner;

public class Profesor {
	public static int puntuacion;
	public static String NombreGanador;
	public static int Tirada1;
	public static int Tirada2;
	public static String jugador;

	public static void main(String[] args) {
		try {
	
	Scanner sc = new Scanner(System.in);
    
	System.out.println("***BIENVENIDO A LA BOLERA***");
	System.out.println();
	Thread.sleep(1000);
	System.out.println("Introduce numero de jugadores:");
	int nump = Integer.parseInt(sc.nextLine());
	Thread.sleep(500);
	

	while(nump<2 || nump>6){
		System.out.println("Introduce numero de jugadores:");
		nump = Integer.parseInt(sc.nextLine());
	}
	
		for (int i = 1; i <= nump; i++) {
			Tirada1 = (int) (Math.random() * 12 + 0);
			Tirada2 = (int) (Math.random() * (12 - (Tirada1)) + 0);
			Thread.sleep(500);
			
			System.out.println("Introduce nombre del jugador:" + i);
			jugador = sc.nextLine();
			
			System.out.println("Bienvenido " + jugador);
			System.out.println();
			
			System.out.println("Has tirado " + Tirada1 + " bolos en el primer lanzamiento");
			System.out.println();
			Thread.sleep(1000);
			
			System.out.println("Has tirado " + Tirada2 + " bolos en el segundo lanzamiento");
			System.out.println();
			Thread.sleep(1000);
	
			System.out.println(jugador + " Ha tirado en total " + (Tirada1 + Tirada2)+ " bolos ");
			System.out.println();
				
		
			if(puntuacion<(Tirada1+Tirada2)) {
				puntuacion=(Tirada1+Tirada2);
				NombreGanador=jugador;
			}
			
		}
		Thread.sleep(2000);
	
		System.out.println("El ganador es "+NombreGanador+" y ha conseguido tirar "+puntuacion+" bolos ");
		}catch(Exception ex) {
			
		}
	}



public static int PrimerLanzamiento() {
	int numb = (int) (Math.random() * 12 + 0);
	return numb;

}

public static int SegundoLanzamiento() {
	int numb = (int) (Math.random() * (12 - PrimerLanzamiento()) + 0);
	return numb;
}
}
