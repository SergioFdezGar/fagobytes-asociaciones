package g01_03.gest_asobu.persistencia;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Vector;

import junit.framework.TestCase;

import org.junit.Test;

public class AgenteDBTest extends TestCase{


	@Test
	public void testGetAgente() throws Exception {
		AgenteDB mInstancia = new AgenteDB();
		assertFalse(mInstancia.getAgente().equals(mInstancia));
	}

	public void testInsert() throws SQLException, Exception{
		AgenteDB mInstancia = new AgenteDB();
		String SQL_insert_1="INSERT INTO Usuario VALUES ('Prueba13', '123');";
		int esperado=0;
		int obtenido=mInstancia.getAgente().insert(SQL_insert_1);
		assertFalse(esperado==obtenido);
	}

	public void testInsert2(){
		AgenteDB mInstancia = new AgenteDB();
		String SQL_insert_1="hola pepe";
		try{
			mInstancia.getAgente().insert(SQL_insert_1);
			fail ("Esperaba excepci�n");
		}catch (Exception e){
			//...
		}
	}
	
	public void testSelect1(){
		AgenteDB mInstancia = new AgenteDB();
		String SQL_insert_1="INSERT INTO Usuario VALUES ('Prueba', '123');";
		String SQL_select_1="SELECT * FROM Usuario WHERE nombre='Prueba';";
		LinkedList<Vector<String>> usuario=new LinkedList();
		try{
			mInstancia.getAgente().insert(SQL_insert_1);
			usuario=mInstancia.getAgente().select(SQL_select_1);
		}catch (Exception e){
			fail("No esperaba excepcion");
		}

	}

	public void testSelect2(){
		AgenteDB mInstancia= new AgenteDB();
		String SQL_insert_1="INSERT INTO personad VALUES (1053, 'pepa', 'contra');";
		String SQL_select_1="SELECCIONO TODO;";
		try{
			mInstancia.getAgente().select(SQL_select_1);
			fail("Esperaba excepcion");
		}catch(Exception e ){
			//...
		}

	}
	
	public void testDelete() throws SQLException, Exception{
		AgenteDB mInstancia = new AgenteDB();
		String SQL_insert_1="DELETE FROM Usuario WHERE nombre='Prueba';";
		int esperado=1;
		int obtenido=mInstancia.getAgente().delete(SQL_insert_1);
		assertFalse(esperado==obtenido);
	}
	
	public void testUpdate() throws SQLException, Exception{
		AgenteDB mInstancia = new AgenteDB();
		String SQL_insert_1="UPDATE Usuario SET nombre='TodoRisis' ,password ='holiiiiXD' WHERE nombre='Prueba13';";
		int esperado=0;
		int obtenido=mInstancia.getAgente().update(SQL_insert_1);
		assertFalse(esperado==obtenido);
	}
	
}
