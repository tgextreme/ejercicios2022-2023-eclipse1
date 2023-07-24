package ecuacion1;

public class Ecuacion {

	public static void main(String[] args) {
		
		double a =1;
		double b =1;
		double c =1;
		
		double x1;
		double x2;
		
		x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
		x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
		System.out.println("El valor de la ecucacion es"+x1);
		System.out.println("El valor de la ecucacion es"+x2);

	}

}
