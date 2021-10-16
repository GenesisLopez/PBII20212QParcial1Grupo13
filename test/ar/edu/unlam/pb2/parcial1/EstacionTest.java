package ar.edu.unlam.pb2.parcial1;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class EstacionTest {
	
	Estacion estaEstacion;
	
	@Before 
	public void creacionDeLaEstacion() {
		NombreEstacion nombre= NombreEstacion.CASTELAR;
		Date esteDia = null;
		 estaEstacion= new Estacion(nombre, esteDia);
		assertNotNull(estaEstacion);
	}
	@Test
	public void verificarSeSeCreoLaEstacio() {
		assertNotNull(estaEstacion);
	}
	@Test
	public void controlarSiSEPuedoCargarCreditoaLaSube() {
		Integer codigoDeTarjeta= 123;
		Double saldo= 0.0;
		Sube estaSube= new Sube(codigoDeTarjeta, saldo);
		saldo=205.0;
		estaEstacion.cargarSube(estaSube.cargarSaldo(saldo));
		Double esperado=205.0;
		Double optenidoDouble;
		
	} 
	

}
