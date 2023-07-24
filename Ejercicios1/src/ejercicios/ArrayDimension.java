package ejercicios;

public class ArrayDimension {

	public static void main(String[] args) {

		int resultado = 0;

		int[][] arrDi = new int[3][3];
		int[][] arrRes = new int[4][4];
		arrDi[0][0] = 7;
		arrDi[0][1] = 8;
		arrDi[0][2] = 9;
		arrDi[1][0] = 4;
		arrDi[1][1] = 3;
		arrDi[1][2] = 2;
		arrDi[2][0] = 5;
		arrDi[2][1] = 6;
		arrDi[2][2] = 7;

		for (int i = 0; i < 3; i++) {
			resultado = 0;
			for (int o = 0; o < 4; o++) {
				if (o == 3) {
					arrRes[i][o] = resultado;
				} else {
					arrRes[i][o] = arrDi[i][o];
					resultado = resultado + arrDi[i][o];
				}
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int o = 0; o < 4; o++) {
				System.out.print("[" + arrRes[i][o] + "]");
			}
			System.out.println("");
		}
		for (int i = 0; i < 4; i++) {
			resultado = 0;
			for (int o = 0; o < 4; o++) {
				if (o == 3 && i != 3) {
					arrRes[o][i] = resultado;
				} else if (o == 3 && i == 3) {
					arrRes[o][i] = 0;
				} else {
					resultado = resultado + arrRes[o][i];
				}

			}
		}

		System.out.println("---------------");
		for (int i = 0; i < 4; i++) {
			for (int o = 0; o < 4; o++) {

				System.out.print("[" + arrRes[i][o] + "]");
			}
			System.out.println("");
		}

	}

}
