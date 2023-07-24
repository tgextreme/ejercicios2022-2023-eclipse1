package main;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a=0;
    
    int b = 0;
    do {
		System.out.print("Introduzca un valor A: ");
		a = s.nextInt();
        System.out.print("Introduzca un valor B mayor que A: ");
        b = s.nextInt();
    } while (b < a);

    int sumaP = 0, sumaI = 0;

    for (int i = a; i <= b; i++) {
        if (i % 2 == 0) {
            sumaP = sumaP + i;
        } else {
            sumaI = sumaI + i;
        }
    }

    System.out.println("La suma de los pares es: " + sumaP + " y la suma de los impares es: " + sumaI);

    s.close();
}
}
