package ar.edu.unlam.pb2.lineaFerroviria;


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
	public void controlarSiSePudoCargarCreditoaLaSube() {
		Integer codigoDeTarjeta= 123;
		Double saldoInicial= 0.0;

		Sube estaSube= new Sube(codigoDeTarjeta, saldoInicial);
	
		Double saldo = 205.0;
		
		estaEstacion.cargarSube(estaSube.cargarSaldo(saldo));
		
		Double esperado=205.0;
		Double optenidoDouble= estaSube.getSaldo();
		
		assertEquals(esperado, optenidoDouble);
		
	} 
	

}
