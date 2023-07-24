package main;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//numero PI

		double total = 0;

		for (int i = 0; i < 200; i++) {
			total = total + formula(i);
		}
		total = total * 4;
		System.out.println(total);
	}

	static double formula(int n) {
		double superior = Math.pow(-1, n);

		double inferior = (2 * n) + 1;
		// System.out.println("numero "+(superior/inferior));
		return superior / inferior;
	}
}
