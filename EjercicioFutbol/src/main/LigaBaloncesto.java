package main;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class LigaBaloncesto {

	public static void main(String[] args) {
		List <Jugador> j= new ArrayList<Jugador>();
		
		for(int i=0;i<20;i++) {
			j.add(new Jugador(i,"jugador"+i,i,genFechNac(),0,0));
		}
		System.out.println();
		
		
		

	}
	public static int numeroAleatorio(int min, int max) {
		Random r=new Random();
		return r.nextInt(min, max);
	}
	public static LocalDate genFechNac() {
		LocalDate today = LocalDate.now();
		int tiempo=numeroAleatorio(18,35);
        LocalDate birthdate = LocalDate.of(today.getYear()-tiempo, today.getMonth(), today.getDayOfMonth());

        //Period p = Period.between(birthdate, today);
        return birthdate;

	}

}
