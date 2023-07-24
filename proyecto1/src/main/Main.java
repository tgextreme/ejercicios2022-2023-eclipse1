package main;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
public static void main(String[] args) {
	IntStream  numeros= IntStream.of (1,2,3,4);
	numeros.forEach(System.out::println);
	
	System.out.println("----------------");
	
	IntStream  numeros1= IntStream.range (1,6);
	numeros1.forEach(System.out::println);
	
	
	System.out.println("----------------");
	IntStream  numeros2= IntStream.iterate(0, numero->numero+1).limit(10);
	numeros2.forEach(System.out::println);
}
static void suma(int a, int b) {
	System.out.println(" la suma es "+(a+b));
}

}
