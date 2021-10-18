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
		
		Double saldo = 0.0;
		Sube estaSube = new Sube( saldo);
		Boolean esperado = true;

		assertTrue(estaEstacion.agregarUsuarios(estaSube));

	}

	@Test
	public void buscarUnUsuarioAgregado() {
		
		Double saldo = 0.0;
		Sube estaSube = new Sube(saldo);
		
		Sube segundaSube = new Sube(saldo);
		estaEstacion.agregarUsuarios(estaSube);
		assertTrue(estaEstacion.buscarSube(estaSube));

	}

	@Test
	public void verificarSiSeCargaBienElSaldo() {
		
		Double saldo = 0.0;
		Sube estaSube = new Sube(saldo);
		saldo = 500.0;
		estaEstacion.cargarSube(estaSube, saldo);
		Double esperado = 500.0;
		Double optenido = estaSube.getSaldo();
		assertEquals(esperado, optenido);

	}

	@Test
	public void cobrarPasaje() {
		
		Double saldo = 0.0;
		Sube estaSube = new Sube(saldo);
		saldo = 500.0;
		estaEstacion.cargarSube(estaSube, saldo);
		estaEstacion.cobrarViaje(estaSube);
		Double esperado = 476.0;
		Double optenido = estaSube.getSaldo();
		assertEquals(esperado, optenido);
	}

	@Test
	public void cargarSaldoConUnaTarjetaSinRegistrarEnLaEstacion() {
		
		Double saldo = 0.0;
		Sube estaSube = new Sube(saldo);
		saldo = 500.0;
		estaEstacion.cargarSube(estaSube, saldo);
		Double esperado = 500.0;
		Double optenido = estaSube.getSaldo();
		assertEquals(esperado, optenido);
	}
	

	@Test
	public void luegoDePagarUnViajeSeRegistreLaTarjetaEnLaEstacion() {
		
		Double saldo = 0.0;
		saldo = 500.0;
		Sube estaSube = new Sube(saldo);
		
		Double tarifa=estaEstacion.getTarifa();
		estaEstacion.cobrarViaje(estaSube);
		
		assertTrue(estaEstacion.buscarSube(estaSube));
	}
	@Test
	public void saberCuantosUsuariosEstuvieronEnLaEstacion() {
		
		
		Sube estaSube1 = new Sube(400.0);
		Sube estaSube2 = new Sube(300.0);
		Sube estaSube3 = new Sube(700.0);
		Sube estaSube4 = new Sube(400.0);
		estaEstacion.agregarUsuarios(estaSube1);
		estaEstacion.agregarUsuarios(estaSube2);
		estaEstacion.agregarUsuarios(estaSube3);
		estaEstacion.agregarUsuarios(estaSube4);
		Integer esperado = 4;
		Integer obtenido = estaEstacion.tamañoDelistaDeUsuarios();
		
		assertEquals(esperado,obtenido);
		
		
	}
	@Test 
	public void siDosSubesSonIgualesQueUnaNoSeAgregue() {
		
		Sube estaSube1 = new Sube(123,400.0);
		Sube estaSube2 = new Sube(123,300.0);
		Sube estaSube3 = new Sube(124,700.0);
		Sube estaSube4 = new Sube(152,400.0);
		estaEstacion.agregarUsuarios(estaSube1);
		estaEstacion.agregarUsuarios(estaSube2);
		estaEstacion.agregarUsuarios(estaSube3);
		estaEstacion.agregarUsuarios(estaSube4);
		Integer esperado = 3;
		Integer obtenido = estaEstacion.tamañoDelistaDeUsuarios();
		
		assertEquals(esperado,obtenido);
		
	}

}

