package main;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int [][] arr=new int[4][4];
		int sumaColumna=0;
		int cero=0,uno=0,dos=0,tres=0, sumaFilaTotal=0, sumaColumnaTotal=0;
		Scanner sc =new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				System.out.println("Dime el array ["+i+"]["+j+"]");
				arr[i][j]=sc.nextInt();
				sumaColumna=sumaColumna+arr[i][j];
				
			}
			arr[i][3]=sumaColumna;
			sumaFilaTotal=sumaFilaTotal+sumaColumna;
			sumaColumna=0;
		}
		for(int i=0;i<4;i++) {
			for (int j=0;j<3;j++) {
				sumaColumna=sumaColumna+arr[j][i];
			}
			
			arr[3][i]=sumaColumna;
			sumaColumnaTotal=sumaColumnaTotal+sumaColumna;
			sumaColumna=0;
		}
		arr [3][3]=sumaColumnaTotal-sumaFilaTotal-sumaFilaTotal;
		for(int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				System.out.print(arr[i][j]+"|");
		
			}
			System.out.println();
		}
		
		
		
			
	}
	

}
