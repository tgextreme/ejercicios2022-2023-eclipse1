package main;

public class Main {

	public static void main(String[] args) {

		int[] arrNum = new int[8];
		for (int i = 0; i < 8; i++) {
			arrNum[i] = (int) (Math.random() * 95 + 5);
		}
		arrNum = numAleatorio(arrNum);
		for (int i = 0; i < 8; i++) {
			System.out.println(arrNum[i] + "\n");
		}

	}

	static int[] numAleatorio(int[] arr) {
		// int numero = (int) (Math.random() * 95 + 5);
		boolean check = true;
		while (true) {
			check = true;
			for (int i = 0; i < 8; i++) {
				for (int o = 0; o < 8; o++) {
					if (arr[i] == arr[o] && o != i) {
						arr[i] = (int) (Math.random() * 95 + 5);
						check = false;
						o = 8;
					}
				}

			}
			if (check == true) {
				return arr;
			}

		}

	}

}
