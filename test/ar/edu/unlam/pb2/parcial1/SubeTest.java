package ar.edu.unlam.pb2.parcial1;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class SubeTest {
	Sube estaSube;
	Estacion estaEstacion;
	@Before
	public void test() {
		Integer codigo=1111;
		Double saldo=0.0;
		this.estaSube= new Sube(codigo ,saldo);
		NombreEstacion nombre = NombreEstacion.CASTELAR;
		Date esteDia = new Date();
		 estaEstacion = new Estacion(nombre, esteDia);
		assertNotNull(estaSube);
	}
	
	@Test
	public void verificarSiSecreoLaSube() {
		assertNotNull(estaSube);
	}
	@Test
	public void optenerelSaldoLuegoDePagarBoletos() {
		Double carga=50.0;
		estaSube.cargarSaldo(carga);
		Double esperado=26.0;
		Double optenido= estaSube.getSaldo();
		Double tarifa= this.estaEstacion.getTarifa();
		estaSube.pagarBoleto(tarifa);
		 optenido= estaSube.getSaldo();
		assertEquals(esperado, optenido);
		
	}
	@Test
	public void poderPagarElViajeConSinTenerSaldoEnLaTarjeta() {
		Double carga=50.0;
		estaSube.cargarSaldo(carga);
		Double esperado=26.0;
		Double optenido= estaSube.getSaldo();
		Double tarifa= this.estaEstacion.getTarifa();
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		
		 optenido= estaSube.getSaldo();
		assertEquals(esperado, optenido);
	}

}
