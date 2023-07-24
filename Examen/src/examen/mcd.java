package examen;

import java.util.Scanner;

public class mcd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el primer numero: ");
		int num1=Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el segundo numero: ");
		int num2=Integer.parseInt(sc.nextLine());
		
		System.out.println("El mcd es: "+mcdRecursivo(num1,num2));

	}

	private static int mcdRecursivo(int num1, int num2) {
		int intermedio1, intermedio2;
		intermedio1=num1-num2;
		intermedio2=num2-num1;
		if(num1==num2)
			return num1;
		else {
			if(num1>num2)
				return mcdRecursivo(intermedio1,num2);
			else
				return mcdRecursivo(num1,intermedio2);
		}
	}
}
