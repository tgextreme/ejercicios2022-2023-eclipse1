package proyectostreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		File file;
		FileReader fileReader;
		BufferedReader bufferedReader;
		ArrayList<String> lista = new ArrayList<String>();
		String intermedio = "";
		int aleatorio =0;
		try {

			file = new File("C:\\Users\\usuario\\eclipse-workspace\\ProyectoStreams\\src\\datos\\tweets.txt");
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			while ((intermedio = bufferedReader.readLine()) != null) {
				lista.add(intermedio);
			}

		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
		aleatorio = (int) Math.random() * lista.size();
		System.out.println(lista.get(aleatorio));

	}

}
