package ar.edu.unlam.pb2.parcial1;

public class Trabajador extends Usuario {

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
	public void pagarViaje() {
		
		
		this.getSube().pagarBoleto(LineaFerroviaria.tarifa);
		

	}
	
}
