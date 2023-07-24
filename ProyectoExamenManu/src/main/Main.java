package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//long an= ackermann(150, 60);
	
	 int [] arr=	multiplicacionRusa(25,21);
	 System.out.println(arr[0]+ " "+arr[1]);

	}
	
	static int[] multiplicacionRusa (int doble, int mitad ) {
		
		int [] a= new int[2];
		System.out.println(doble+" "+mitad);
		a[0]=doble*2;
		a[1]=mitad/2;
		
		if(a[1]==1) {
			
			return a;
			
		}else {
			return multiplicacionRusa(a[0],a[1]);
		}
		
		
		
	}
	
	static long ackermann(long m, long n) {
		
		return (m==0)?
		           n+1:
		           (m>0 && n==0)?
		             ackermann(m-1,1):
		             ackermann(m-1, ackermann(m,n-1));
	}

}
