package main;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main3 {
	public static void main(String[] args) {
		float numero=calcular(2,1);
		DecimalFormat df = new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.CEILING);
		System.out.println("hola "+ df.format(numero));
	}

	static float calcular(int m, int n) {
		float resultado=0;
		if(m>n) {
			System.out.println("Se puede hacer");
		
		for(int i=1;i<=m;i++) {
			resultado=resultado+Math.round(100*(((float)i)/((float)n-(float)i)))/100;
		}
		}
		System.out.println(resultado+"");
		
		return resultado;
	}

}
