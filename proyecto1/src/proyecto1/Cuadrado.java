package proyecto1;

public class Cuadrado {

	public static void main(String[] args) {
		int anchura=3;
		int altura=12;
		for(int i=0;i<altura+anchura;i++) {
			
			for(int o =0;o<altura+anchura;o++) {
				if(o<anchura-2||o>altura-anchura+4||i<anchura-2|| i>altura-anchura+4) {
				System.out.print("*");
				}else {
					System.out.print(" ");	
				}
				/*for (int u=0;u<3;u++) {
					System.out.print("-");
				}*/
				
			}
			System.out.println("");
		}

	}

}
