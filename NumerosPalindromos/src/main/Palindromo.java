package main;

public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero = "32323";
		String intermedio = "";
		for (int i = numero.length() - 1; i >= 0; i--) {
			intermedio = intermedio + numero.charAt(i);
		}
		System.out.println(intermedio);

		if (intermedio.equals(numero)) {
			System.out.println("Es palíndromo");
		} else {
			System.out.println("NO es palídromo");
		}
	}

}
