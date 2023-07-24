package main;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		//Mamifero  mamifero=new Mamifero();
		//String nombre, String religion, String ciudad, String pais
		Humano humano =new Humano("Adbad", "Budista", "Soles", "India");
		Humano humano1 =new Humano("Tomas", "Cristiano", "San  fernando", "España");
		//String nombre, String raza, String color
		Perro perro =new Perro ("Chiqui", "Pitbull", "negro");
		Perro perro1 =new Perro("Manolo","Golden", "Dorado");
		//humano.nombre="Jose";
		System.out.println("El humano con nombre "+humano1.getNombre()+" con religion "+humano1.getReligion()+" vive en "+humano1.getCiudad()+ " en el pais " +humano1.getPais());

		humano1.setPais("Andorra");
		String p=humano1.getPais();
		
		System.out.println("El humano con nombre "+humano1.getNombre()+" con religion "+humano1.getReligion()+" vive en "+humano1.getCiudad()+ " en el pais " +humano1.getPais());
		
		Mamifero [] mamiferos = new Mamifero[10];
		mamiferos[0]=humano;
		mamiferos[1]=perro;
		

	}

}
