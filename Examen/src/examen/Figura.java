package examen;

import java.util.Scanner;

public class Figura {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean exit=false;
		do {
			System.out.println("Introduce un tamaño para la figura: ");
			int n=Integer.parseInt(sc.nextLine());
			int x=n-1;
			if(n==0)
				exit=true;
			else if(n%2==0)
				System.out.println("El numero debe de ser impar!!");
			else {
				for(int f=0;f<n;f++) {
					for(int c=0;c<n;c++) {
						if(c==0 || f==0 || c==n-1)
							System.out.print(" * ");
						else if(f==n-1) {
							while(x>1) {
								System.out.print(" "+x+" ");
								x--;
							if(x==1)
								break;
							}
						}
						else if(f<=n/2) {
							if(f%2!=0)
								System.out.print(" # ");
							else
								System.out.print(" * ");
						}
						else
							System.out.print("   ");
						if(x==2)
							break;
					}
					System.out.println();
				}
			}
			System.out.println();
		}while(!exit);
		System.out.println("Fin del programa");
	}

}
