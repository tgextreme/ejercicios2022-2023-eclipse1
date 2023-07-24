package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[][] tresEnRaya = new String[3][3];
		boolean jugando = true;
		int columna, fila;
		Scanner sc = new Scanner(System.in);
		String ganador="";

		for(int i=0;i<3;i++) {
			for(int o=0;o<3;o++) {
				tresEnRaya[i][o]="";
			}
			
		}
		while (jugando == true) {
			System.out.println("Ronda Jugador X");
			System.out.println("Dígame columna");
			columna = sc.nextInt();
			System.out.println("Dígame fila");
			fila = sc.nextInt();
			tresEnRaya[fila][columna]="X";
			
			imprimirArray(tresEnRaya);
			jugando=	checkGanador(tresEnRaya, "X");
			ganador="X";
			if(jugando==false) {
				break;
			}
			
			System.out.println("Ronda Jugador Y");
			System.out.println("Dígame columna");
			columna = sc.nextInt();
			System.out.println("Dígame fila");
			fila = sc.nextInt();
			tresEnRaya[fila][columna]="Y";
			imprimirArray(tresEnRaya);
			jugando=	checkGanador(tresEnRaya, "Y");
			ganador="Y";
			if(jugando==false) {
				break;
			}
		}
		System.out.println("El ganador es "+ganador);

	}

	static void imprimirArray(String[][] arr) {
		for (int i = 0; i < 3; i++) {
			for (int o = 0; o < 3; o++) {
				
					System.out.print(arr[i][o] + " | ");
				 
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static boolean checkGanador(String [][]arr, String letra) {
		if(arr[0][0].equals(letra)&&arr[0][1].equals(letra)&&arr[0][2].equals(letra)) {
		return false;	
		}
		if(arr[1][0].equals(letra)&&arr[1][1].equals(letra)&&arr[1][2].equals(letra)) {
			return false;	
			}
		if(arr[0][0].equals(letra)&&arr[1][1].equals(letra)&&arr[2][2].equals(letra)) {
			return false;	
			}
		if(arr[2][0].equals(letra)&&arr[1][1].equals(letra)&&arr[0][2].equals(letra)) {
			return false;	
			}
		if(arr[0][0].equals(letra)&&arr[1][0].equals(letra)&&arr[2][0].equals(letra)) {
			return false;	
			}
		if(arr[0][1].equals(letra)&&arr[1][1].equals(letra)&&arr[2][1].equals(letra)) {
			return false;	
			}
		if(arr[0][2].equals(letra)&&arr[1][2].equals(letra)&&arr[2][2].equals(letra)) {
			return false;	
			}
		if(arr[0][0].equals(letra)&&arr[0][1].equals(letra)&&arr[0][2].equals(letra)) {
			return false;	
			}
		if(arr[0][0].equals(letra)&&arr[0][1].equals(letra)&&arr[0][2].equals(letra)) {
			return false;	
			}
		if(arr[0][0].equals(letra)&&arr[0][1].equals(letra)&&arr[0][2].equals(letra)) {
			return false;	
			}
		if(arr[0][0].equals(letra)&&arr[0][1].equals(letra)&&arr[0][2].equals(letra)) {
			return false;	
			}
		if(arr[0][0].equals(letra)&&arr[0][1].equals(letra)&&arr[0][2].equals(letra)) {
			return false;	
			}
		if(arr[0][0].equals(letra)&&arr[0][1].equals(letra)&&arr[0][2].equals(letra)) {
			return false;	
			}
		if(arr[0][0].equals(letra)&&arr[0][1].equals(letra)&&arr[0][2].equals(letra)) {
			return false;	
			}
		
		
		return true;
	}

}
