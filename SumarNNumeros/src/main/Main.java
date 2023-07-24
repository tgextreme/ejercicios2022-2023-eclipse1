package main;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	try {
	System.out.println("digame un número entero");
	int entero=sc.nextInt();
	int total=sumaPrimeros(entero);
	System.out.println(total);
	}catch(Exception ex) {
		System.out.println(ex.getMessage());
	}
}

public static int sumaPrimeros( int n) throws Exception {
	if(n<0) {
	throw new Exception ("Debe ser número mayor a cero");
	}
	return (n==0)?1:n+ sumaPrimeros(n-1);
}
}
