package ar.edu.unlam.pb2.parcial1;

public class Trabajador extends Persona {

	private String empresa;

	public Trabajador(Integer dni, String nombre, String apellido, Sube sube, String empresa) {
		super(dni, nombre, apellido, sube);
		this.empresa = empresa;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
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
