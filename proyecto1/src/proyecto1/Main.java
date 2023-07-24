package proyecto1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int contador=0;
		String frase;
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Escribe una frase:");
		frase=sc.nextLine();
		for(int i=0;i<frase.length();i++) {
			if((frase.charAt(i)+"").equals("a")||(frase.charAt(i)+"").equals("e")||(frase.charAt(i)+"").equals("i")||(frase.charAt(i)+"").equals("o")||(frase.charAt(i)+"").equals("u")||(frase.charAt(i)+"").equals("A")||(frase.charAt(i)+"").equals("E")||(frase.charAt(i)+"").equals("I")||(frase.charAt(i)+"").equals("O")||(frase.charAt(i)+"").equals("U")) {
				contador = contador+1;
			}
			
				
		}
		System.out.println(contador+"");
	}

}
