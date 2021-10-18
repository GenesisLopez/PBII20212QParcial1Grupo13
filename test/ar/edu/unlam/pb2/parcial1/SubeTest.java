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
		
		Double saldo=0.0;
		this.estaSube= new Sube(saldo);
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
		assertEquals(esperado, optenido,0.1);
		
	}
	@Test
	public void poderPagarElViajeConSinTenerSaldoEnLaTarjeta() {
		Double carga=50.0;
		estaSube.cargarSaldo(carga);
		Double esperado=-22.0;
		Double optenido= estaSube.getSaldo();
		Double tarifa= this.estaEstacion.getTarifa();
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);

		
		 optenido= estaSube.getSaldo();
		assertEquals(esperado, optenido,0.1);
	}
	
	@Test
	public void noTePermitaPagarElViajeSiTenesMenosSaldoQueElSaldoDeGracia() {
		Double carga=50.0;
		estaSube.cargarSaldo(carga);
		Double esperado=-190.0;
		Double optenido= estaSube.getSaldo();
		Double tarifa= this.estaEstacion.getTarifa();
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);
		estaSube.pagarBoleto(tarifa);

		
		 optenido= estaSube.getSaldo();
		assertEquals(esperado, optenido,0.1);
	}

	
	@Test
	public void queNoTeDejeCargarCreditoSuperandoElTope() {
		Double carga=1400.0;
		estaSube.cargarSaldo(carga);
		Double esperado=1400.0;
		Double optenido= estaSube.getSaldo();
		
		estaSube.cargarSaldo(carga);
		 optenido= estaSube.getSaldo();
		assertEquals(esperado, optenido,0.1);
	}
	
	@Test
	public void queNoTeDejeCargarCreditoNegativo() {
		Double carga=40.0;
		estaSube.cargarSaldo(carga);
		carga=-10.0;
		Double esperado=40.0;
		Double optenido= estaSube.getSaldo();
		
		estaSube.cargarSaldo(carga);


		
		 optenido= estaSube.getSaldo();
		assertEquals(esperado, optenido,0.1);
	}
	
	
	
}




