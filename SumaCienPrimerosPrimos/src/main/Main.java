package main;

public class Main {
	public static void main(String[] args) {
		int suma = 0;
		boolean primo = false;

		for (int dividendo = 2; dividendo <= 100; dividendo++) {
			for (int divisor = 2; divisor < dividendo; divisor++) {
				if (dividendo % divisor == 0 && dividendo != divisor) {
					primo = true;
				}
				if (dividendo == divisor) {
					break;
				}

			}
			if (!primo) {
				suma = suma + dividendo;
				System.out.println(suma + " " + dividendo);
			}
			primo = false;

		}
		System.out.println(suma + "");

	}

}
