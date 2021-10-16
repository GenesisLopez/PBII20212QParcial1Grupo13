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
	

}
