package ejercicios;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 10;
		boolean divisible = true;
		String str = "";
		for (int i = 1; i <= numero; i++) {
			for (int o = 2; o < i&&divisible!=true; o++) {
				if (i % o == 0 && i != o) {
					divisible = true;
				}
			}
			if (divisible==false) {
				str = str + " " + i;
			}
			divisible = false;

		}
		System.out.println(str);

	}

}
