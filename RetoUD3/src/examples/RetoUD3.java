package examples;

import java.util.Random;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class RetoUD3.
 */
public class RetoUD3 {
	
	/** The b. */
	static int a = 0, b = 0;

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws InterruptedException the interrupted exception
	 */
	public static void main(String[] args) throws InterruptedException {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el nombre del equipo local: ");
		String l = s.nextLine();
		System.out.print("Introduce el nombre del equipo visitante: ");
		String v = s.nextLine();
		System.out.print("Introduce el número de penaltis a lanzar: ");
		int cont = s.nextInt();

		
		tirarPenalti(cont, a, b);
		
		do {
			if (a < b) {
				System.out.println(v + " gana la Champions League.");
			}
			else if (a > b){
				System.out.println(l + " gana la Champions League.");
			}
			else {
				cont = 2;
				tirarPenalti(cont, a, b);
				if (a < b) {
					System.out.println(v + " gana la Champions League.");
				}
				else if (a > b){
					System.out.println(l + " gana la Champions League.");
				}
			}
			
		}while(a == b);
			
		
		s.close();

	}
	
	/**
	 * Tirar penalti.
	 *
	 * @param cont the cont
	 * @param a the a
	 * @param b the b
	 * @throws InterruptedException the interrupted exception
	 */
	public static void tirarPenalti(int cont, int a, int b) throws InterruptedException {
		Random r = new Random();
		String str=new String( "HOLA");
		String vocal=str.charAt(0)+"";
	
	
		Scanner s = new Scanner(System.in);
		
		while (cont > 0) {
			if (cont % 2 == 0) {
				int gol = r.nextInt(10);
				String res = null;
				System.out.println("Introduce el nombre del futbolista local: ");
				String nombre = s.nextLine();
				switch (gol) {
				case 0, 1, 2, 3, 4, 5, 6, 7 -> {
					res = " marca gol";
					RetoUD3.a++;
				}
				case 8 -> res = " dispara directo al poste y falla el penalti.";
				case 9 -> res = " tira a las manos del portero y falla el penalti.";
				}
				System.out.println(nombre + res);
			}
			else {
				int golB = r.nextInt(10);
				String resB = null;
				System.out.println("Introduce el nombre del futbolista visitante: ");
				String nombre = s.nextLine();
				switch (golB) {
				case 0, 1, 2, 3, 4, 5, 6, 7 -> {
					resB = " marca gol";
					RetoUD3.b++;
				}
				case 8 -> resB = " dispara directo al poste y falla el penalti.";
				case 9 -> resB = " tira a las manos del portero y falla el penalti.";
				
				}
				System.out.println(nombre + resB);
			}
			Thread.sleep(2000);
			cont--;
		}
	}
}
