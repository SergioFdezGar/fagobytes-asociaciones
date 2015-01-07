package g01_03.gest_asobu.persistencia;

import java.sql.SQLException;
import junit.framework.TestCase;

import org.junit.Test;

public class AgenteDBTest extends TestCase{


	@Test
	public void test01GetAgente() throws Exception {
		AgenteDB mInstancia = AgenteDB.getAgente();
		//
		assertTrue(mInstancia!=null);
	}

	public void test02Insert() throws SQLException, Exception{
		AgenteDB mInstancia = AgenteDB.getAgente();
		String SQL_insert_1="INSERT INTO `Usuario` (`nombre`,`password`) VALUES ('Prueba13', '123')";
		int esperado=1;
		int obtenido=mInstancia.insert(SQL_insert_1);
		assertTrue(esperado==obtenido);
	}

	public void test03Insert2() throws Exception{
		AgenteDB mInstancia = AgenteDB.getAgente();
		String SQL_insert_1="hola pepe";
		try{
			mInstancia.insert(SQL_insert_1);
			fail ("Esperaba excepci�n");
		}catch (Exception e){
			//...
		}
	}

	public void test04Update() throws SQLException, Exception{
		AgenteDB mInstancia = AgenteDB.getAgente();
		String SQL_insert_1="UPDATE `Usuario` SET `nombre`='TodoRisis', `password`='holiiiiXD' WHERE `nombre`='Prueba13'";
		int esperado=1;
		int obtenido=mInstancia.update(SQL_insert_1);
		assertTrue(esperado==obtenido);
	}
	
	public void test05Select1() throws Exception{
		AgenteDB mInstancia = AgenteDB.getAgente();
		String SQL_insert_1="INSERT INTO Usuario VALUES ('Prueba', '123')";
		try{
			mInstancia.insert(SQL_insert_1);
		}catch (Exception e){
			fail("No esperaba excepcion");
		}

	}

	public void test06Select2() throws Exception{
		AgenteDB mInstancia= AgenteDB.getAgente();
		String SQL_select_1="SELECCIONO TODO;";
		try{
			mInstancia.select(SQL_select_1);
			fail("Esperaba excepcion");
		}catch(Exception e ){
			//...
		}

	}
	
	public void test07Delete() throws SQLException, Exception{
		AgenteDB mInstancia = AgenteDB.getAgente();
		String SQL_insert_1="DELETE FROM Usuario WHERE nombre='Prueba'";
		int esperado=1;
		int obtenido=mInstancia.delete(SQL_insert_1);
		assertTrue(esperado==obtenido);
	}
	

	
}
