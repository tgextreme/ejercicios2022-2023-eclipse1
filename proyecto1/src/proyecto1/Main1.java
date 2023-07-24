package proyecto1;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numCalc, exponente, resultado;

		numCalc = 5;
		exponente = 2;
		int numero1 = 2;
		int[] numeros = new int[10];
		numeros[0] = 12;
		numeros[1] = 5;
		numeros[2] = 7;
		numeros[3] = 9;
		numeros[4] = 10;
		numeros[5] = 15;
		numeros[6] = 200;
		numeros[7] = 100;
		numeros[8] = 120;
		numeros[9] = 130;

		for (int i = 0; i < numeros.length; i++) {
			// resultado = Math.pow(numCalc, exponente);
			resultado = potencia(numeros[i], 2);
			
			System.out.println("El array numeros["+i +"] da resultado "+((int)resultado) + "");
		}
	}

	static double potencia(double numero, double exponente) {
		double resultado = numero;
		int exponenteInt = (int) exponente;
		for (int i = 1; i < exponenteInt; i = i + 1) {
			resultado = resultado * numero;

		}

		return resultado;
	}

}
