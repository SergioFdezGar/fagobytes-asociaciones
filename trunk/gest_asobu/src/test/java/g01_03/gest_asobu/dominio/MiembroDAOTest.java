package g01_03.gest_asobu.dominio;

import junit.framework.TestCase;

public class MiembroDAOTest extends TestCase{


	public void testAgregar() throws Exception {
		MiembroDAO gestor;
		Miembro user= new Miembro("01", "prueba", "pruebita", "pruebota", "1900-09-01", "Avenida", 
				"callesita", 1, "B", 0, "A", 13003, "ciu", "culipardolandia", "555", "oins", "socio");
		boolean prueba=false;
		gestor = new MiembroDAO();
		prueba=gestor.agregar(user);
		assertTrue(prueba);

	}

	public void testModificar() throws Exception {
		MiembroDAO gestor;
		Miembro user= new Miembro("01", "prueba", "pruebita", "pruebota", "1900-09-01", "Avenida", 
				"callesita", 1, "B", 0, "A", 13003, "ciu", "culipardolandia", "555", "oins", "socio");
		Miembro user2= new Miembro("01", "prueba4", "pruebita", "pruebota", "1900-09-01", "Avenida", 
				"callesita", 1, "B", 0, "A", 13003, "ciu", "culipardolandia", "555", "oins", "usuario");
		boolean prueba=true;
		gestor = new MiembroDAO();
		prueba=gestor.modificar(user,user2);
		assertTrue(prueba);

	}
	
	public void testEliminar() throws Exception {
		MiembroDAO gestor;
		Miembro user= new Miembro("01", "prueba4", "pruebita", "pruebota", "1900-09-01", "Avenida", 
				"callesita", 1, "B", 0, "A", 13003, "ciu", "culipardolandia", "555", "oins", "usuario");
		boolean prueba=false;
		gestor = new MiembroDAO();
		prueba=gestor.eliminar(user);
		assertTrue(prueba);

	}
}