package ar.edu.unlam.pb2.lineaFerroviria;

public class Usuario extends Persona {

	private String empresa;

	public Usuario(Integer dni, String nombre, String apellido, Sube sube, String empresa) {
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
