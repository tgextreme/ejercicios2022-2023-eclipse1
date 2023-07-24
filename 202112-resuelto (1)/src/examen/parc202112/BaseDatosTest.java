package examen.parc202112;

import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BaseDatosTest {

	
	
	public void setUp() throws Exception {
		System.out.println("aaui llego");
		BaseDatos.abrirConexion( "test.bd", true );
	}



	public void tearDown() throws Exception {
		BaseDatos.cerrarConexion();
	}



	public void testGetProductos() {
		
		ArrayList<Producto> lP = BaseDatos.getProductos();
		assertEquals( 8==lP.size());
		int antCod = -1;
		for (Producto p : lP) {
			assertTrue( p.getId() > antCod );
			antCod = p.getId();
		}
	}

	@Test
	public void testInsertarCompraIncorrecta() {
		// Compra incorrecta por sintaxis inadecuada de nombre de cliente
		Compra compraInc = new Compra( 0, 0, "O'Neil", 1, new Producto( 1, "Test", 0, new ArrayList<>() ) );
		assertFalse( BaseDatos.insertarCompra( compraInc ) );
	}
	
	@Test
	public void testInsertarCompraCorrecta() {
		ArrayList<Producto> lP = BaseDatos.getProductos();
		ArrayList<Compra> lC = BaseDatos.getCompras(lP);
		int codMayor = 0;
		for (Compra c : lC) {
			if (c.getId() > codMayor) {
				codMayor = c.getId();
			}
		}
		assertTrue( codMayor >= lC.size() );
		Compra compraCorr = new Compra( 0, System.currentTimeMillis(), "Test", 1, new Producto( 1, "Test", 100, new ArrayList<>() ) );
		assertTrue( BaseDatos.insertarCompra( compraCorr ) );
		assertTrue( compraCorr.getId() > codMayor );
	}
	
	@Test
	public void testBorrarCompra() {
		Compra compraBorrable = new Compra( 1, 0, "", 1, new Producto( 1, "", 0, new ArrayList<>() ) );
		try {
			BaseDatos.borrarCompra( compraBorrable );
		} catch (SQLException e) {
			fail( "Error en borrado de compra correcta" );
		}
		Compra compraNoBorrable = new Compra( 99, System.currentTimeMillis(), "Test", 1, new Producto( 1, "Test", 100, new ArrayList<>() ) );
		try {
			BaseDatos.borrarCompra( compraNoBorrable );
			fail( "No hay error en borrado de compra incorrecta" );
		} catch (SQLException e) {
		}
	}
}
