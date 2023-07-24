package fp.tipos.CorteElectrico;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FactoriaCorteElectrico {

	public static List<CorteElectrico> LeeFichero(String ruta) throws IOException {
		List<CorteElectrico> res = new ArrayList<>();
		List<String> lineas = Files.readAllLines(Paths.get(ruta));
		lineas.remove(0);
		for (String linea : lineas) {
			CorteElectrico c = parse(linea);
			res.add(c);
		}
		return res;
	}
	
	
	
	
	public static CorteElectrico parse(String txt) {
		String[] partes = txt.split(";");
		if (partes.length != 10) {
			throw new IllegalArgumentException("Error en el formato");
		}
		String descripcion = partes[0].trim();
		LocalDateTime fecha_inicio = parseaFechaHora(partes[1], partes[2]);
		LocalDateTime fecha_restablecimiento = parseaFechaHora(partes[3], partes[4]);
		String compañia = partes[5].trim();
		String region = partes[6].trim();
		Double perdida_demanda = parseaDouble(partes[7]);
		Integer consumidores_afectados = parseaEntero(partes[8]);
		List<String> etiquetas = parseaEtiquetas(partes[9]);
	
		CorteElectrico res = new CorteElectrico(descripcion, fecha_inicio, fecha_restablecimiento,
			compañia, region, perdida_demanda, consumidores_afectados,etiquetas);
		
		return res;
	}
		
	
	private static LocalDateTime parseaFechaHora(String sf, String st) {
		LocalDateTime fechaHora = LocalDateTime.parse(sf.trim() + "-" + st.trim(),
		DateTimeFormatter.ofPattern("M/d/y-H:m"));
		return fechaHora;
		}
		private static Double parseaDouble (String d) {
		Double res = null;
		if (!d.trim().equals("Unknown")) {
		res = Double.valueOf(d.trim());
		}
		return res;
		}
		private static Integer parseaEntero (String e) {
		Integer res = null;
		if (!e.trim().equals("Unknown")) {
		res = Integer.valueOf(e.trim());
		}
		return res;
		}
		private static List<String> parseaEtiquetas(String s) {
		String[] array = s.trim().split(",");
		List<String> etiquetas = new ArrayList<>();
		for (String e: array) {
		etiquetas.add(e.trim());
		}
		return etiquetas;
		}
}
