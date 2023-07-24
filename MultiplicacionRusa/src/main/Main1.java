package main;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		 int numero = 0;
		 int contador;
		 int mayor = 0;
		 int igual = 0;
		 int menor = 0;

		 

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
		   contador = contador-1;
		   if (numero > 0){
		     mayor++;
		   } else if (numero < 0){
		     menor++;
		   } else {
		     igual++;
		   }
		 }
		 System.out.println("Has introducido todos los números:\n" + mayor + " son mayores a 0\n" + menor + " son menores a 0\n" + igual + " son iguales a 0.");
		}
	}
