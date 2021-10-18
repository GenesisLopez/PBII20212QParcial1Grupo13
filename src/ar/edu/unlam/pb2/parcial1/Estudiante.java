package ar.edu.unlam.pb2.parcial1;

public class Estudiante extends Usuario {

	private String escuela;

	public Estudiante(Integer dni, String nombre, String apellido, Sube sube, String escuela) {
		super(dni, nombre, apellido, sube);
		this.escuela = escuela;
	}

	public String getEscuela() {
		return escuela;
	}

	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}



	@Override
	public void pagarViaje() {
		
		Double descuentoEstudiante= Estacion.tarifa*(0.5);
		
		this.getSube().pagarBoleto(descuentoEstudiante);
		
	}

}
