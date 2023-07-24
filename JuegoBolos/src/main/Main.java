package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numJug = 1;
		int tiradas = 2;
		int bolos = 12;
		int puntuacion;
		int puntuacionTotal;
		String nombre;
		ArrayList<Jugador> jugadores = new ArrayList();
		System.out.println("Introduce el numero de jugadores");
		while (numJug < 2 || numJug > 6) {
			try {
				numJug = Integer.parseInt(sc.nextLine());
				System.out.println("Debes de poner numero de jugadores entre 2 y 6");
			} catch (Exception ex) {
				System.out.println("Debes poner un número válido");
			}
		}
		// jugadores = new String[numJug];

		for (int i = 0; i < numJug; i++) {
			System.out.println("Introduce nombre del jugador");
			nombre = sc.nextLine();
			jugadores.add(new Jugador(nombre, 0, 0));
			// System.out.println("Ahora realizara su lanzamiento"+nombre);
			// puntuacion = (int) ((Math.random() * 1000) % 13);
			// System.out.println("El jugador: "+nombre+"ha tirado: "+bolos+"bolos en su:
			// "+tiradas);
		}

		for (int i = 0; i < numJug; i++) {
			try {
				puntuacionTotal = 0;
				for (int o = 0; o < tiradas; o++) {
					puntuacion = (int) ((Math.random() * 1000) % 13);
					puntuacionTotal = puntuacion;// primera tirada
					//System.out
						//	.println("La primera tirada de " + jugadores.get(i).getNombre() + "es " + puntuacionTotal);
					puntuacion = (int) ((Math.random() * 1000) % (puntuacion - 13));
					puntuacionTotal = puntuacionTotal + puntuacion;// segunda tirada
					Thread.sleep(500);
					//System.out.println("La segunda tirada de " + jugadores.get(i).getNombre() + " es " + puntuacion);
					Thread.sleep(500);
					Thread.sleep(500);
					System.out.println("La puntuación de " + jugadores.get(i).getNombre() + " es " + puntuacionTotal);
					jugadores.get(i).setPuntuacion(puntuacionTotal);// pongo puntuación a la persona
					jugadores.get(i).setRonda(i);// pongo el número de ronda al archivo
				}
				System.out.println("La puntuacion de " + jugadores.get(i).getNombre() + " es " + puntuacionTotal);
				Thread.sleep(2000);
			} catch (Exception ex) {

			}

		}
		Collections.sort(jugadores, new Comparator<Jugador>() {
			@Override
			public int compare(Jugador a, Jugador b) {
				int resultado = ("" + a.getPuntuacion()).compareTo("" + b.getPuntuacion());
				if (resultado != 0) {
					return resultado;
				}
				resultado = ("" + a.getRonda()).compareTo("" + b.getRonda());
				if (resultado != 0) {
					return resultado;
				} else {
					return a.getNombre().compareTo(b.getNombre());
				}
			}
		});
		for (int i = 0; i < jugadores.size(); i++) {
			System.out.println("El jugador nombre " + jugadores.get(i).getNombre() + " tiene puntuacion "
					+ jugadores.get(i).getPuntuacion() + " en la ronda " + (jugadores.get(i).getRonda() + 1));
		}
		System.out.println("Ha ganado " + jugadores.get(0).getNombre());
	}
}