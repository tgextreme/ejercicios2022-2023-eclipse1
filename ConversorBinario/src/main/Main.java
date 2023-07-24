package main;

public class Main {

	public static void main(String[] args) {
		int numero = 20;
		String intermedio = "";
		String intermedioRev="";

		for (int i = numero; numero != 1; i++) {
			intermedio = intermedio + "" + (numero % 2);
			numero = numero / 2;
		}
		intermedio=intermedio+"1";
		
		for(int i=intermedio.length()-1;i>=0;i--) {
			intermedioRev=intermedioRev+intermedio.charAt(i);
		}
		
		System.out.println(intermedioRev);
	}

}
