package fp.tipos.CorteElectrico;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class CorteElectrico_test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		List<String> lista = new ArrayList<String>();
		lista.add("winter storm");
		lista.add("snow");
		
		CorteElectrico c1 = new CorteElectrico("Severe Weather", LocalDateTime.of(2011, 3, 16, 14, 20),
				LocalDateTime.of(2011, 3, 16, 14, 22), "PacifiCorp", "Oregon", 1378.88, 9000, lista);
		
		System.out.println(c1);
		
		List<CorteElectrico> listaCortesElectricos = new ArrayList<>();
		
		listaCortesElectricos = FactoriaCorteElectrico.LeeFichero("C:\\Users\\usuario\\eclipse-workspace\\preparacion_examen_java\\src\\data\\power_outages (1).csv");
		double intermedia;
		ArrayList<String> cortes = new ArrayList<String>();
		for (CorteElectrico c : listaCortesElectricos) {
			cortes.add(c.getRegion());
			System.out.println(c);
		}
		//intermedia=ContenedorCorteElectrico.mediaAfectadosEnRegiones(Nivel.ALTO, listaCortesElectricos);
		CorteElectrico c2 = new CorteElectrico("Severe Weather", LocalDateTime.of(2011, 3, 16, 14, 20),
				LocalDateTime.of(2011, 3, 16, 14, 22), "PacifiCorp", "Oregon", 1378.88, null, lista);
		//CorteElectrico(String descripcion, LocalDateTime fechaInicio, LocalDateTime fechaRestablecimiento,
		//String compañia, String region, Double perdidaDemanda, Integer consumidoresAfectados,
		//List<String> etiquetas)
		
		
	}
		public static void testMediaAfectadosEnRegiones() {
			List<CorteElectrico> listaCortesElectricos = new ArrayList<>();
		//	listaCortesElectricos = FactoriaCorteElectrico.LeeFichero("C:\\Users\\Javier\\Downloads\\power_outages (1).csv");
			//ContenedorCorteElectrico contenedor = new ContenedorCorteElectrico(listaCortesElectricos);
			//System.out.println("¿Esta la cancion incluida en el fichero?: " +
			//contenedor.mediaAfectadosEnRegiones(Nivel.MEDIO, Set<String> regiones));
	}

}
