package main;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);

		int numero = 0;
		 int contador, contadorMayor=0, contadorMenor=0, contadorigual=0;
		 int mayor = 0;
		 int igual = 0;
		 int menor = 0;

		 while(mayor<=menor) {
		 System.out.println("Dígame el intervalo mayor");
		 mayor=sc.nextInt();
		 System.out.println("Dígame el intervalo menor");
		 menor=sc.nextInt();
		 }
		  
		 System.out.print("Introduce la cantidad de número que vamos a introducir: ");
		 contador = sc.nextInt();
		 do {
		   if (contador <= 0) {
		     System.out.println("El número introducido debe ser un entero positivo. Por favor, introduce un nuevo valor.");
		     contador = sc.nextInt();
		   }
		 } while (contador <= 0);
		 while (contador > 0){
		   System.out.println("Introduce un número: ");
		   numero = sc.nextInt();
		   
		   if (numero > mayor){
			   contadorMayor++;
		   } else if (numero < menor){
			   contadorMenor++;
		   } else {
			   contadorigual++;
		   }
		   contador--;
		 }
		 System.out.println("Has introducido todos los números:\n" + contadorMenor + " son mayores al mayor intervalo "+mayor+"\n" + contadorMayor + " son menores al menor intervalo"
		 +menor		+ "\n" + contadorigual + " están en el intervalo");
		 
		}
	}


