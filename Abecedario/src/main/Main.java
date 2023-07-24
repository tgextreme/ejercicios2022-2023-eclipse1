package main;

public class Main {
	public static void main(String[] args) {
		String abecedario[] = new String[27];
		abecedario[0] = "A";
		abecedario[1] = "B";
		abecedario[2] = "C";
		abecedario[3] = "D";
		abecedario[4] = "E";
		abecedario[5] = "F";
		abecedario[6] = "G";
		abecedario[7] = "H";
		abecedario[8] = "I";
		abecedario[9] = "J";
		abecedario[10] = "K";
		abecedario[11] = "L";
		abecedario[12] = "M";
		abecedario[13] = "N";
		abecedario[14] = "Ñ";
		abecedario[15] = "O";
		abecedario[16] = "P";
		abecedario[17] = "Q";
		abecedario[18] = "R";
		abecedario[19] = "S";
		abecedario[20] = "T";
		abecedario[21] = "U";
		abecedario[22] = "V";
		abecedario[23] = "W";
		abecedario[24] = "X";
		abecedario[25] = "Y";
		abecedario[26] = "Z";
		int contador=0;
		
		for (int i=abecedario.length-1;i>=0;i=i-1){

            contador++;
			System.out.println("La letra es "+abecedario[i]);     

			}
		System.out.println(abecedario.length+" "+contador);

	}

}
