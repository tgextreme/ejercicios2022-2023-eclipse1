package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
	private int id;
	double saldo;
	double limSal;
	ArrayList<Direccion> direcciones=new ArrayList();
	public Cliente(int id, double saldo, double limSal, ArrayList<Direccion> direcciones) {
		super();
		this.id = id;
		this.saldo = saldo;
		this.limSal = limSal;
		this.direcciones = direcciones;
	}
	
	public void anyadirDireccion() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime direccion");
		String direccion=sc.nextLine();
		this.direcciones.add(new Direccion(direccion));
	}
}
