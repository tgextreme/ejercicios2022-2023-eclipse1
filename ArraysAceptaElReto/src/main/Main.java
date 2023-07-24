package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a=new int[5];
		int [] b=new int[5];
		int [] resultado=new int[5];
		
		a[0]=2;
		a[1]=5;
		a[2]=5;
		a[3]=4;
		a[4]=4;
		
		b[0]=1;
		b[1]=1;
		b[2]=3;
		b[3]=3;
		b[4]=3;
		int suma=0;
		
		
		
		for(int i=0;i<a.length;i++) {
			resultado[i]=a[i]*b[i];
		}
		
		for(int i=0;i<resultado.length;i++) {
			suma=suma+resultado[i];
		}
		System.out.println(suma+"");
	}

}
