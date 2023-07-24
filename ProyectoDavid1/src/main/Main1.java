package main;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("prueba.txt");
            pw = new PrintWriter(fichero);

            pw.println("Mi nombre es Tomas");
            pw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
