package main;

public class Figura {
	void dibujarFigura(int numero) {
		int mitad =(int) Math.ceil((Double.parseDouble(numero+"")) / 2);
		for (int i = 0; i < mitad; i++) {
			if (i % 2 == 0) {
				for (int o = 0; o < numero; o++) {
					System.out.print("* ");
				}
			} else {
				for (int o = 0; o < numero; o++) {
					if (o == 0 || o == numero - 1) {
						System.out.print("* ");
					} else {
						System.out.print("# ");
					}
				}
			}
			System.out.println();
		}
		for (int i = 0; i < mitad - 2; i++) {
			for (int o = 0; o < numero; o++) {
				if (o == 0 || o == numero - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
		for(int o=numero;0<o;o--) {
			if(o==1|| o==numero) {
				System.out.print("* ");
			}else {
				System.out.print(o+" ");
			}
		}

	}
}
