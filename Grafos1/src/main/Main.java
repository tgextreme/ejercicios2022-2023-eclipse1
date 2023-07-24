package main;

import java.util.HashSet;

import java.util.Set;

import java.util.SortedSet;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Persona> cjsp = new HashSet<Persona>();

		SortedSet<Persona> cjssp = new TreeSet<Persona>();

		Persona p = new Persona(1, "Marta", 165);

		cjsp.add(p);

		cjssp.add(p);

		p = new Persona(2, "Elena", 155);

		cjsp.add(p);

		cjssp.add(p);

		p = new Persona(3, "María", 170);

		cjsp.add(p);

		//cjssp.add(p);

		System.out.println("Personas en el conjunto: " + cjsp);

		System.out.println("Personas en el conjunto ordenado: " + cjssp);
	}

}
