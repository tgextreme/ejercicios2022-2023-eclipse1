package examples;

public class Ejercicio14 {

	public static void main(String[] args) {
		fibonacci1(1000);
		System.out.println();
		fibonacci2(15);

	}
	
	private static void fibonacci1 (int a) {
		int c = 0, b = 2, fibonacci = 1;
		while (fibonacci < 1000) {
			System.out.print(fibonacci+" ");
			c = b;
			fibonacci = fibonacci + b;
			b = fibonacci;
			fibonacci = c;
		}
	}

	private static void fibonacci2 (int a) {
		int c = 0, b = 2, fibonacci = 1;
		for (int i = 0; i <= a-1; i++) {
			System.out.print(fibonacci+" ");
			c = b;
			fibonacci = fibonacci + b;
			b = fibonacci;
			fibonacci = c;
		}
	}

}
