package ar.edu.unlam.pb2.lineaFerroviria;
public class Estudiante extends Persona {

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
	public Double cargarSaldo() {
		
		return null;
	}

	@Override
	public Boolean pagarViaje() {
		
		return null;
	}

}
