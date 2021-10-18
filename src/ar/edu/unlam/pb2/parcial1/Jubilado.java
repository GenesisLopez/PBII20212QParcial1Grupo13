package ar.edu.unlam.pb2.parcial1;

public class Jubilado extends Usuario{
	

	public Jubilado(Integer dni, String nombre, String apellido, Sube sube) {
		super(dni, nombre, apellido, sube);
		
	}


	@Override
	public void pagarViaje() {
		Double descuentoJubilado= Estacion.tarifa*(0.8);
		
		this.getSube().pagarBoleto(descuentoJubilado);

	}
	
	

}
