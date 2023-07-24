package PruebaExamen2;

import java.util.Scanner;

public class Examen2 {
static int num=1;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	
		while(num!=0) {
			System.out.println("Introduce un numero: ");
			num=Integer.parseInt(sc.nextLine());
			if(num<=20 && num>0) {
				Multiplicar(num,1);
			}else if (num>0) {
				System.out.println("Introduce un numero menor que 20");
			}
		}
		System.out.println("Has salido");
	
		
	}
	private static void recursiva(int num) {
		Multiplicar(num,1);
	}
	private static void Multiplicar(int num,int i) {
		int prod;
		if(i==10) {
			prod=num*i;
			System.out.println(num +" * "+i+" = " + prod);
		}else {
			prod= num*i;
			System.out.println(num+" * " + i + " = "+prod);
			Multiplicar(num,i+1);
		}
	}
}
