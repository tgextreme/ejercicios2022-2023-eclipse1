package PruebaExamen2;

import java.util.Scanner;

public class Examen3 {

	public static void main(String[] args) {
		float result=0;
		int factorial=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce m: ");
		int m=Integer.parseInt(sc.nextLine());
		System.out.println("Introduce n: ");
		int n=Integer.parseInt(sc.nextLine());
		if(n>m) {
			for(int i=1;i<m;i++) {
				for(int res=n-m;res>0;res--) {
					factorial=res;
					factorial+=factorial--;
				}
				result=(float)m/factorial;
				result+=result;
			}
			System.out.println("El resultado es "+result);
			
		}
	
	
	}
}
