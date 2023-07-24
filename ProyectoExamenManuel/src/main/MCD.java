package main;

public class MCD {
	
	
	int calcularMCD(int num1,int num2) {
		int residuo;
		if(num1%num2==0) {
			return num2;
		}else {
		residuo=num1%num2;
		return calcularMCD(num2, residuo);
		}
		
	}

}
