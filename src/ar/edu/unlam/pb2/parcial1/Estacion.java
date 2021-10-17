package ar.edu.unlam.pb2.parcial1;

import java.util.Date;

public class Estacion extends LineaFerroviaria{
	
	private NombreEstacion nombre;
	private Date esteDia;

	public Estacion(NombreEstacion nombre) {
		this.nombre=nombre;
		
	}

	public void cargarSube(Sube estaSube, Double cargarSaldo) {
		
	estaSube.cargarSaldo(cargarSaldo);
	
	}

	public void cobrarViaje(Sube estaSube) {
		estaSube.pagarBoleto(this.getTarifa());
		
	}
	




	

}
