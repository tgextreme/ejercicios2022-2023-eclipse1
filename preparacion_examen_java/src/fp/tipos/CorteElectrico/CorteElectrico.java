package fp.tipos.CorteElectrico;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class CorteElectrico implements Comparable<CorteElectrico> {

	private String descripcion;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaRestablecimiento;
	private String compañia;
	private String region;
	private Double perdidaDemanda;
	private Integer consumidoresAfectados;
	private List<String> etiquetas;

	public Nivel getSeveridad() {
		Nivel res;
		if (consumidoresAfectados < 10000 || consumidoresAfectados == null) {
			res = Nivel.BAJO;
		}
		if (consumidoresAfectados >= 10000 && consumidoresAfectados < 100000) {
			res = Nivel.MEDIO;
		} else {
			res = Nivel.ALTO;
		}
		return res;
	}

	public Boolean getEsCritico() {
		Boolean res = false;
		if (perdidaDemanda != null && perdidaDemanda > 200
				|| Duration.between(fechaRestablecimiento, fechaInicio).toHours() < 10) {
			res = true;
		}
		return res;
	}

	public CorteElectrico(String descripcion, LocalDateTime fechaInicio, LocalDateTime fechaRestablecimiento,
			String compañia, String region, Double perdidaDemanda, Integer consumidoresAfectados,
			List<String> etiquetas) {

		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaRestablecimiento = fechaRestablecimiento;
		this.compañia = compañia;
		this.region = region;
		this.perdidaDemanda = perdidaDemanda;
		this.consumidoresAfectados = consumidoresAfectados;
		this.etiquetas = etiquetas;

		Checkers.check("fechas incorrectas", Duration.between(fechaInicio, fechaRestablecimiento).toMinutes() >= 0);
	
			Checkers.check("datos erroneos", (consumidoresAfectados== null || consumidoresAfectados   >= 0 ));
		
		Checkers.check("datos erroneos", etiquetas.size() > 0);

	}

	@Override
	public String toString() {
		return "CorteElectrico [descripcion=" + descripcion + ", fecha_inicio=" + fechaInicio
				+ ", fecha_restablecimiento=" + fechaRestablecimiento + ", compañia=" + compañia + ", region=" + region
				+ ", perdida_demanda=" + perdidaDemanda + ", consumidores_afectados=" + consumidoresAfectados
				+ ", etiquetas=" + etiquetas + "]";
	}

	public String getDescripcion() {
		return descripcion;
	}

	public LocalDateTime getFecha_inicio() {
		return fechaInicio;
	}

	public LocalDateTime getFecha_restablecimiento() {
		return fechaRestablecimiento;
	}

	public String getCompañia() {
		return compañia;
	}

	public String getRegion() {
		return region;
	}

	public Double getPerdida_demanda() {
		return perdidaDemanda;
	}

	public Integer getConsumidores_afectados() {
		return consumidoresAfectados;
	}

	public List<String> getEtiquetas() {
		return etiquetas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaInicio, region);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CorteElectrico other = (CorteElectrico) obj;
		return Objects.equals(fechaInicio, other.fechaInicio) && Objects.equals(region, other.region);
	}

	public int compareTo(CorteElectrico o) {
		int res;
		res = this.fechaInicio.compareTo(o.fechaInicio);
		if (res == 0) {
			res = this.region.compareTo(o.region);
		}
		return res;
	}
}
