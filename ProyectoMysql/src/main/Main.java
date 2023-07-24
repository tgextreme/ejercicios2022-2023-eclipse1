package main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		try {
			
			LoadDriver load = new LoadDriver();
			Connection conn = load.conexion();
			System.out.println("Todo ok");
			Statement stmt = null;
			stmt = conn.createStatement();
			ResultSet rs = null;
			
			if (stmt.execute("INSERT INTO `alumno`(`nombre`, `apellidos`, `edad`) VALUES ('Tomas','Gonzalez','33')")) {
				rs = stmt.getResultSet();
				System.out.println("Ejecutado correctamente");
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
