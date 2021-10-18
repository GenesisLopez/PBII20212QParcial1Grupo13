package ar.edu.unlam.pb2.parcial1;

public class Jubilado extends Usuario{
	

	public Jubilado(Integer dni, String nombre, String apellido, Sube sube) {
		super(dni, nombre, apellido, sube);
		
	}


	@Override
	public Boolean pagarViaje() {
	//	this.getSube().pagarBoleto(null);
		return false;
	}
	
	

}
