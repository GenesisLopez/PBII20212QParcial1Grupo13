package ar.edu.unlam.pb2.parcial1;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class UsuarioTest {

	@Test
	public void queAlPagarSiendoEstudianteSeApliqueElDescuento() {
		Sube estaSube;
		Estacion estaEstacion;
			Integer codigo=1111;
			Double saldo=50.0;
			estaSube= new Sube(codigo ,saldo);
			NombreEstacion nombre = NombreEstacion.CASTELAR;
			Date esteDia = new Date();
			 estaEstacion = new Estacion(nombre, esteDia);
			 
			 Estudiante batman = new Estudiante (18,"Sandro","Perez",estaSube,"Almafuerte");
			 
			 batman.pagarViaje();

			 Double esperado = 38.0;
			 Double obtenido = batman.getSube().getSaldo();

			assertEquals(esperado,obtenido);
		}
	
	@Test
	public void queAlPagarSiendoEstudianteNoBajeDelSaldoDeGracia() {
		Sube estaSube;
		Estacion estaEstacion;
			Integer codigo=1111;
			Double saldo=50.0;
			estaSube= new Sube(codigo ,saldo);
			NombreEstacion nombre = NombreEstacion.CASTELAR;
			Date esteDia = new Date();
			 estaEstacion = new Estacion(nombre, esteDia);
			 
			 Estudiante batman = new Estudiante (18,"Sandro","Perez",estaSube,"Almafuerte");
			 
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();
			 batman.pagarViaje();

			 Double esperado = -190.0;
			 Double obtenido = batman.getSube().getSaldo();

			assertEquals(esperado,obtenido);
		}
	
	
	@Test
	public void queAlPagarSiendoJubiladoSeApliqueElDescuento() {
		Sube estaSube;
		Estacion estaEstacion;
			Integer codigo=1111;
			Double saldo=50.0;
			estaSube= new Sube(codigo ,saldo);
			NombreEstacion nombre = NombreEstacion.CASTELAR;
			Date esteDia = new Date();
			 estaEstacion = new Estacion(nombre, esteDia);
			 
			 Jubilado alan = new Jubilado (38,"alan","gomez",estaSube);
			 
			 alan.pagarViaje();

			 Double esperado = 30.8;
			 Double obtenido = alan.getSube().getSaldo();

			assertEquals(esperado,obtenido,0.1);
		}
	
	
	@Test
	public void queAlPagarSiendoJubiladoNoBajeDelSaldoDeGracia() {
		Sube estaSube;
		Estacion estaEstacion;
			Integer codigo=1111;
			Double saldo=50.0;
			estaSube= new Sube(codigo ,saldo);
			NombreEstacion nombre = NombreEstacion.CASTELAR;
			Date esteDia = new Date();
			 estaEstacion = new Estacion(nombre, esteDia);
			 
			 Jubilado alan = new Jubilado (38,"alan","gomez",estaSube);
			 
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 alan.pagarViaje();
			 

			 Double esperado = -199.6;
			 Double obtenido = alan.getSube().getSaldo();

			assertEquals(esperado,obtenido,0.1);
		}

}
