package ClasesParticulares;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ConjuntoDatos {
	private File archivoTexto;
	private String separador;
	private Locale locale;
	private List cabecera;
	private int numeroLineas;
	private int numeroColumnas;
	private double[][] datos;
	
	public ConjuntoDatos(File archivoTexto, String separador, Locale locale) {
		/**
		 * si tienes tambien una cabecera, numero de líneas
		 *  y numero de columnas declarado, debes ponerlas 
		 *  en el constructor como que estan en base al 
		 *  archivo.		
		 */
		this.archivoTexto = archivoTexto;
		this.separador = separador;
		this.locale = locale;
		/**
		 * Terminas de poner los parametros y haces lo que 
		 * hemos dicho.
		 */
		
		cabecera = cabecera(archivoTexto);
		numeroLineas = numLineas(archivoTexto);
		numeroColumnas = numColumnas(archivoTexto);
		//tambien se ha incluido matriz de datos. LEERLA EN BASE A TODO LO ANTERIOR. 
		datos = leerDatos(archivoTexto, numeroLineas, numeroColumnas);
		//todo esto son metodos posteriores que iras metiendo.
	}
	
	private List cabecera(File archivoTexto) throws IOException {
		cabecera = new ArrayList<String>();
		
		try {
			//hacer la maquina que lee el archivo de texto y guarda lo escrito.
			FileInputStream fs = new FileInputStream(archivoTexto);//OJO aqui se pone el archivo.
			DataInputStream entrada = new DataInputStream(fs);
			BufferedReader bf = new BufferedReader(new InputStreamReader(entrada));
			//nombre de la maquina: bf
			//OJO NO HAY QUE ESCRIBIR NADA.SOLO LEER EL ARCHIVO Y DEVOLVER LO QUE SE HA LEIDO.
			String textoCabecera = bf.readLine(); //leera la primera de todas asi tal cual.
			entrada.close();//ya no hay que leer mas nada. solo era la cabecera.
			
			String[] separaciones = textoCabecera.split(";");
			for(int i = 0; i<separaciones.length; i++) {
				cabecera.add(separaciones[i]);
			}
			
		}catch (Exception e) {//se entiende mas o menos, pero es cuestion de repetir un poco.
			e.getMessage();
		} return cabecera;
	}
	
}
