package main;

public class Ternario {
	
	
	String comprobarNumero(int numero) {
		
		String str="";
		str=(numero%2==0)?str+" par ":str+" impar ";
		str=(numero<0)?str+" negativo ":str+" positivo";
		return str;
		
		
		
	}
}
