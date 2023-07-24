package main;

public class Main2 {
public static void main(String[] args) {
	String abecedario="ZYWXVUTSRQPONMLKJIHGFEDCBA";
	int contador=0;
	while(contador<abecedario.length()) {
		System.out.println(abecedario.substring(contador));
		
		contador++;
	}
}
}
