package main;

import java.util.Scanner;

public class Calcular {

	public static void main(String[] args) {
		 int n1,n2;
		 Scanner Entrada=new Scanner(System.in);
		 System.out.print("Introduce un número: ");
		 n1=Entrada.nextInt();
		 System.out.print("Introduce otro número: ");
		 n2=Entrada.nextInt();
		 if(n1%n2==0)
			 System.out.println("Son múltiplos");
			 else
			 System.out.println("No son múltiplos");
			 }

	}


