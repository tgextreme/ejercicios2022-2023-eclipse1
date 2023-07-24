package examen;

import java.util.Scanner;

public class Reloj {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce las horas");
		int h=Integer.parseInt(sc.nextLine());
		System.out.println("Introduce los minutos");
		int m=Integer.parseInt(sc.nextLine());
		System.out.println("Introduce los segundos");
		int s=Integer.parseInt(sc.nextLine());
		
		s++;
		if(s==60) {
			m++;
			s=0;
			if (m==60) {
				h++;
				s=0;
				m=0;
			}
		}
		
		if(h<10 && m<10 && s<10)
			System.out.println("0"+h+":0"+m+":0"+s);
		else if(h<10 && m<10)
			System.out.println("0"+h+":0"+m+":"+s);
		else if(h<10 && s<10)
			System.out.println("0"+h+":"+m+":0"+s);
		else if(m<10 && s<10)
			System.out.println(h+":0"+m+":0"+s);
		else if(h<10)
			System.out.println("0"+h+":"+m+":"+s);
		else if(m<10)
			System.out.println(h+":0"+m+":"+s);
		else if(s<10)
			System.out.println(h+":"+m+":0"+s);
	}

}
