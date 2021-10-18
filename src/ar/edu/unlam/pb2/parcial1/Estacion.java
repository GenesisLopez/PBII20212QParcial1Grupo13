package ar.edu.unlam.pb2.parcial1;

import java.util.Date;

public class Estacion extends LineaFerroviaria{
	
	private NombreEstacion nombre;
	private Date esteDia;

	public Estacion(NombreEstacion nombre) {
		this.nombre=nombre;
		
	}

	public Estacion(NombreEstacion nombre, Date esteDia2) {
		this.nombre=nombre;
		this.esteDia=esteDia2;
	}

	public void cargarSube(Sube estaSube, Double cargarSaldo) {
		
	estaSube.cargarSaldo(cargarSaldo);
	
	}

	public void cobrarViaje(Sube estaSube) {
		estaSube.pagarBoleto(getTarifa());
		this.agregarUsuarios(estaSube);
	}
	




	

}
