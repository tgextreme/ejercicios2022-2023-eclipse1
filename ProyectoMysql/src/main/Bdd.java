package main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Bdd {

	void anyadirAlumno(String nombre, String apellidos, int edad) {
try {
			
			LoadDriver load = new LoadDriver();
			Connection conn = load.conexion();
			System.out.println("Todo ok");
			Statement stmt = null;
			stmt = conn.createStatement();
			ResultSet rs = null;
			
			if (stmt.execute("INSERT INTO `alumno`(`nombre`, `apellidos`, `edad`) VALUES ('"+nombre+"', '"+apellidos+"', '"+edad+"')")) {
				rs = stmt.getResultSet();
				System.out.println("Ejecutado correctamente");
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
