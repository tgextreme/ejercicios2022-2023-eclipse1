package main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		String dni="";
		String tipo="";
		Identificacion id =new Identificacion();
		System.out.println("Dime dni o pasaporte");
		dni=sc.next();
		tipo=id.checkTipo(dni);
		System.out.println("Es un "+tipo);

	}
}
