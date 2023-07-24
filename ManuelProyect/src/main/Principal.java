package main;

public class Principal {

	public static void main(String[] args) {
		int[] arrInt = new int[10];
		arrInt[0] = 12;
		arrInt[1] = 12;
		arrInt[2] = 15;
		arrInt[3] = 12;
		arrInt[4] = 12;
		arrInt[5] = 12;
		arrInt[6] = 12;
		arrInt[7] = 12;
		arrInt[8] = 12;
		arrInt[9] = 12;

		int[] arrInt1 = new int[12];
		arrInt1[0] = 12;
		arrInt1[1] = 12;
		arrInt1[2] = 15;
		arrInt1[3] = 12;
		arrInt1[4] = 12;
		arrInt1[5] = 16;
		arrInt1[6] = 13;
		arrInt1[7] = 12;
		arrInt1[8] = 15;
		arrInt1[9] = 12;
		arrInt1[10] = 16;
		arrInt1[11] = 13;

		int media = mediaArray(arrInt1);
		System.out.println("\n\n\n" + media + " -------------------- \n\n");
		imprimirArray1(arrInt);
		numerosAleatorios();
		Semaforo semaforo = new Semaforo();
	//	semaforo.funciona();

		String mes = new String("Enero");
		int numMes = 0;
		switch (mes) {
		case "Enero":
			numMes = 1;
		case "Febrero":
			numMes = 2;
		case "Marzo":
			numMes = 3;
		}
		int a = 20;
  	 	int b = 5;
   	 	b = --a + a++ - ++a + --b;
   	 	/// 19+4
   	 	System.out.println(b+"");

		/*
		 * imprimirArray(arrInt); System.out.println("--------------------");
		 * imprimirArray(arrInt1); System.out.println("--------------------"); int a =
		 * sumarArray(arrInt); System.out.println(a + "");
		 */
		/*
		 * hola comentario varias lineas
		 */

	}

	static void imprimirArray(int[] arrInt) {
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println("Para el arrInt[" + i + "] es igual a " + arrInt[i]);

		}
	}

	static void numerosAleatorios() {

		int numero = (int) Math.random() * 80 + 40;
		numero = numero * -1;
		System.out.println(numero + "");

	}

	static void imprimirArray1(int[] arrInt) {

		for (int i = 0; i < 12; i++) {
			try {
				System.out.println("Para el arrInt[" + i + "] es igual a " + arrInt[i]);
			} catch (Exception ex) {
				System.out.println("Error");
			}
		}

	}

	static int mediaArray(int[] arrInt) {
		int sumar = 0;
		for (int i = 0; i < arrInt.length; i++) {

			sumar = sumar + arrInt[i];

		}
		return sumar / arrInt.length;
		// System.out.println(sumar+"");
	}

	static int sumarArray(int[] arrInt) {
		int sumar = 0;
		for (int i = 0; i < arrInt.length; i++) {

			sumar = sumar + arrInt[i];

		}
		return sumar;
		// System.out.println(sumar+"");
	}

}
