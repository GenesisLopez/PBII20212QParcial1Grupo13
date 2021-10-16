package ar.edu.unlam.pb2.parcial1;

public class Jubilado extends Persona{

	public Jubilado(Integer dni, String nombre, String apellido, Sube sube) {
		super(dni, nombre, apellido, sube);
		
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
