package ar.edu.unlam.pb2;

import java.util.TreeSet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMontacarga {

	private Montacarga miMontacarga;
	
	@Before 	
	public void init()
	{	
		miMontacarga = new Montacarga();		
		TreeSet cargas = new TreeSet<Montacarga>();
		miMontacarga.setCargas(cargas);
	}
	
	@Test
	public void testCrearUnMontacargaVacio()
	{
		Assert.assertTrue(0 == miMontacarga.obtenerCantidadDeCargas());
	}	
	
	@Test
	public void testIngresaCarga() throws Exception
	{
		miMontacarga.ingresarCarga(new Carga(200));
	}	
}
