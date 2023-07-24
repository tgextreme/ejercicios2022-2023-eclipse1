package ejercicios;

import java.util.Scanner;

public class LeyOhm {
	
	int numeroPrueba;

	public int getNumeroPrueba() {
		return numeroPrueba;
	}

	public void setNumeroPrueba(int numeroPrueba) {
		this.numeroPrueba = numeroPrueba;
	}

	public static void main(String[] args) {
		
		LeyOhm leyOhm=new LeyOhm();
		leyOhm.getNumeroPrueba();
		leyOhm.setNumeroPrueba(50);
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opcion = 2;
		double resultado, numero1, numero2;
		try {
		while (opcion != 4) {
			
				System.out.println("1- Calcular fuerza electromotriz(voltaje)");
				System.out.println("2- Calcular intensidad(amperes)");
				System.out.println("3- Calcular resistencia electrica");
				System.out.println("4. Salir");
				opcion = sc.nextInt();
				switch (opcion) {
				case 1:
					// opcion uno
					System.out.println("Digame resistencia");
					numero1 = sc.nextDouble();
					System.out.println("Digame Intensidad");
					numero2 = sc.nextDouble();
					resultado = VOhm(numero1, numero2);
					System.out.println("El resultado es " + resultado + " Voltios");

					break;
				case 2:
					System.out.println("Digame fuerza electromotriz");
					numero1 = sc.nextDouble();
					System.out.println("Diganme intensidad");

					numero2 = sc.nextDouble();
					resultado = ROhm(numero1, numero2);
					System.out.println("El resultado es " + resultado + " Amp");
					// opcion 2
					break;
				case 3:
					System.out.println("Digame fuerza electromotriz");
					numero1 = sc.nextDouble();
					System.out.println("Digame resistencia");
					numero2 = sc.nextDouble();
					resultado = IOhm(numero1, numero2);
					System.out.println("El resultado es " + resultado + " Ohmnios");
					break;
				}
			

		}
		} catch (Exception ex) {
			System.out.println("Debes poner un n�mero v�lido");
			opcion=2;
		}

	}

	static double VOhm(double R, double I) {
		return R * I;
	}

	static double ROhm(double V, double I) {
		return V / I;
	}

	static double IOhm(double V, double R) {
		return V / R;
	}

}
