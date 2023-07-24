package examen;

import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean exit=false;
		try {
			do {
				System.out.println("Introduce un numero: ");
				int num=Integer.parseInt(sc.nextLine());
				if(num>1000)
					System.out.println("Error, el numero es mayor a 1000");
				else if(num==0)
					exit=true;
				else{
					String espar="Es par positivo";
					String noespar="No es par o positivo";
					String result=(num%2==0 && num>0) ? espar:noespar ;
					System.out.println(result);
				}
			}while(!exit);
		}catch(Exception e) {
			System.out.println(e);
			main(args);
		}
		System.out.println("Fin del programa");
	}

}
