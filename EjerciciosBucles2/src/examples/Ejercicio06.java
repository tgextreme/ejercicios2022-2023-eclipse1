package examples;

public class Ejercicio06 {

	public static void main(String[] args) {
		for (int a = 0; a <= 10; a++) {
			System.out.println("Tabla del "+a+":");
			System.out.println("-------------");
			for (int b = 0; b <= 10; b++) {
				System.out.println(a+" x "+b+" = "+(a*b));
			}
			System.out.println();
		}

	}

}
