package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			File archivo =new File("csv.csv");
			FileReader fr=new FileReader(archivo);
			BufferedReader bf=new BufferedReader(fr);
			String linea="";
			String[] arrStr;
			while((linea=bf.readLine())!=null) {
				arrStr=linea.split(";");
				System.out.println(arrStr[0]);
			}
		}catch(Exception ex) {
			
		}
	}

}
