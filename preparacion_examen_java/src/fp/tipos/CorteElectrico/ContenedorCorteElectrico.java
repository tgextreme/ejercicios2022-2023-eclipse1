package fp.tipos.CorteElectrico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ContenedorCorteElectrico {

//	private String nombre;
//	private LocalDate fecha;
//	private List<CorteElectrico> cortes;
//	private Integer numero_cortes;
//	
//	
//	public String getNombre() {
//		return nombre;
//	}
//	public LocalDate getFecha() {
//		return fecha;
//	}
//	public List<CorteElectrico> getCortes() {
//		return cortes;
//	}
//	public Integer getNumero_cortes() {
//		return numero_cortes;
//	}
//	
//	
//	public ContenedorCorteElectrico(String nombre, LocalDate fecha, Integer numero_cortes) {
//		this.nombre = nombre;
//		this.fecha = fecha;
//		this.numero_cortes = numero_cortes;
//	}
//	
//	
//	public ContenedorCorteElectrico(String nombre, LocalDate fecha, List<CorteElectrico> cortes) {
//		this.nombre = nombre;
//		this.fecha = fecha;
//		this.cortes = cortes;
//	}

	private String nombre;
	private LocalDate fecha;
	private List<CorteElectrico> cortes;

	public ContenedorCorteElectrico(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.cortes = new ArrayList<CorteElectrico>();
	}

	public ContenedorCorteElectrico(String nombre, LocalDate fecha, Stream<CorteElectrico> s) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.cortes = s.collect(Collectors.toList());
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public List<CorteElectrico> getCortes() {
		return new ArrayList<>(cortes);
	}

	public Integer getNumeroCortes() {
		return cortes.size();
	}

	public void incorporaCorte(CorteElectrico c) {
		if (!cortes.contains(c)) {
			cortes.add(c);
		}
	}

	public void incorporaCortes(List<CorteElectrico> cortes) {
		this.cortes.addAll(cortes);
	}

	public void eliminaCorte(CorteElectrico c) {
		cortes.remove(c);
	}

	public Double mediaAfectadosEnRegiones(Nivel s, Set<String> regiones) {
		return this.cortes.stream()
				.filter(y-> y.getSeveridad().equals(s) && y.getConsumidores_afectados() != null
						&& regiones.contains(y.getRegion()))
				.mapToInt(x -> x.getConsumidores_afectados()).average().getAsDouble();

	}

}
