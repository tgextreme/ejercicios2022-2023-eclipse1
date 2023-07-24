package main;

import java.io.File;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UtilidadArchivos utilidad=new UtilidadArchivos();
		utilidad.copiar(new File("csv.csv"), new File("Destino.csv"));
		System.out.println("copiado correctamente");
		utilidad.zip(new File("C:\\Users\\usuario\\Downloads"), "zip.zip", "csv.csv");
		utilidad.listarDirectoriosArchivosRec(new File("C:\\Users\\usuario\\Music\\Raúl Núñez"));
	}

}
