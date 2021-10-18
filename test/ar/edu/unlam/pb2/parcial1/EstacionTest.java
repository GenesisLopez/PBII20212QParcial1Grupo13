package ar.edu.unlam.pb2.parcial1;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class EstacionTest {

	Estacion estaEstacion;

	@Before
	public void creacionDeLaEstacion() {
		NombreEstacion nombre = NombreEstacion.CASTELAR;
		Date esteDia = new Date();
		estaEstacion = new Estacion(nombre, esteDia);
		assertNotNull(estaEstacion);
	}

	@Test
	public void verificarSeSeCreoLaEstacio() {
		assertNotNull(estaEstacion);
	}

	@Test
	public void verificarSiSeAgregaUsuario() {
		Integer codigoDeTarjeta = 123;
		Double saldo = 0.0;
		Sube estaSube = new Sube(codigoDeTarjeta, saldo);
		Boolean esperado = true;

		assertTrue(estaEstacion.agregarUsuarios(estaSube));

	}

	@Test
	public void buscarUnUsuarioAgregado() {
		Integer codigoDeTarjeta = 123;
		Double saldo = 0.0;
		Sube estaSube = new Sube(codigoDeTarjeta, saldo);
		codigoDeTarjeta = 2121;
		Sube segundaSube = new Sube(codigoDeTarjeta, saldo);
		estaEstacion.agregarUsuarios(estaSube);
		assertTrue(estaEstacion.buscarSube(estaSube));

	}

	@Test
	public void verificarSiSeCargaBienElSaldo() {
		Integer codigoDeTarjeta = 123;
		Double saldo = 0.0;
		Sube estaSube = new Sube(codigoDeTarjeta, saldo);
		saldo = 500.0;
		estaEstacion.cargarSube(estaSube, saldo);
		Double esperado = 500.0;
		Double optenido = estaSube.getSaldo();
		assertEquals(esperado, optenido);

	}

	@Test
	public void cobrarPasaje() {
		Integer codigoDeTarjeta = 123;
		Double saldo = 0.0;
		Sube estaSube = new Sube(codigoDeTarjeta, saldo);
		saldo = 500.0;
		estaEstacion.cargarSube(estaSube, saldo);
		estaEstacion.cobrarViaje(estaSube);
		Double esperado = 476.0;
		Double optenido = estaSube.getSaldo();
		assertEquals(esperado, optenido);
	}

	@Test
	public void cargarSaldoConUnaTarjetaSinRegistrarEnLaEstacion() {
		Integer codigoDeTarjeta = 123;
		Double saldo = 0.0;
		Sube estaSube = new Sube(codigoDeTarjeta, saldo);
		saldo = 500.0;
		estaEstacion.cargarSube(estaSube, saldo);
		Double esperado = 500.0;
		Double optenido = estaSube.getSaldo();
		assertEquals(esperado, optenido);
	}
	

	@Test
	public void luegoDePagarUnViajeSeRegistreLaTarjetaEnLaEstacion() {
		Integer codigoDeTarjeta = 123;
		Double saldo = 0.0;
		saldo = 500.0;
		Sube estaSube = new Sube(codigoDeTarjeta, saldo);
		
		Double tarifa=estaEstacion.getTarifa();
		estaEstacion.cobrarViaje(estaSube);
		
		assertTrue(estaEstacion.buscarSube(estaSube));
	}

}

