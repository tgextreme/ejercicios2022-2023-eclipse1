package main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer>  multiplicador =new ArrayList<Integer>();
		ArrayList<Integer>  multiplicando =new ArrayList<Integer>();
		ArrayList<Boolean>  impar =new ArrayList<Boolean>();
		int mult=37;
		int multipli=12;
		int suma=0;
		String sino="";
		multiplicando.add(multipli);
		multiplicador.add(mult);
		
		if (mult%2==0) {
			impar.add(false);
		}else {
			impar.add(true);
		}
		while(mult!=1) {
			
			multiplicando.add(multipli=multipli*2);
		
			multiplicador.add(mult=mult/2);
			
			if (mult%2==0) {
				impar.add(false);
			}else {
				impar.add(true);
			}
			
			
		}
		
		System.out.println("MULTIPLICADOR    |MULTIPLICADO     | MILTIPLICANDO IMPAR    | SUMA");
		for(int i=0;i<multiplicador.size();i++) {
			if(impar.get(i)==true) {
				sino="si";
				suma=suma+multiplicando.get(i);
			}else {
				sino="no";
			}
			
			System.out.println(multiplicador.get(i)+" | "+multiplicando.get(i)+" | "+sino+"|"+suma);
		}

	}

}
