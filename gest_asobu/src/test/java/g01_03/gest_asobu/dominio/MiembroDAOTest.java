package g01_03.gest_asobu.dominio;

import junit.framework.TestCase;

public class MiembroDAOTest extends TestCase{


	public void testAgregar() throws Exception {
		MiembroDAO gestor;
		Miembro user= new Miembro("01", "prueba", "pruebita", "pruebota", "01/09/1900", "avenue", 
				"callesita", 1, "B", 0, "A", 13003, "culipardolandia", "ciu", "555", "oins", "desconocido");
		boolean prueba=true;
		gestor = new MiembroDAO();
		prueba=gestor.agregar(user);
		assertFalse(prueba);

	}

	public void testEliminar() throws Exception {
		MiembroDAO gestor;
		Miembro user= new Miembro("01", "prueba2", "pruebita", "pruebota", "01/09/1900", "avenue", 
				"callesita", 1, "B", 0, "A", 13003, "culipardolandia", "ciu", "555", "oins", "desconocido");
		boolean prueba=true;
		gestor = new MiembroDAO();
		prueba=gestor.eliminar(user);
		assertFalse(prueba);

	}

	public void testModificar() throws Exception {
		MiembroDAO gestor;
		Miembro user= new Miembro("01", "prueba3", "pruebita", "pruebota", "01/09/1900", "avenue", 
				"callesita", 1, "B", 0, "A", 13003, "culipardolandia", "ciu", "555", "oins", "desconocido");
		Miembro user2= new Miembro("01", "prueba4", "pruebita", "pruebota", "01/09/1900", "avenue", 
				"callesita", 1, "B", 0, "A", 13003, "culipardolandia", "ciu", "555", "oins", "desconocido");
		boolean prueba=true;
		gestor = new MiembroDAO();
		prueba=gestor.modificar(user,user2);
		assertFalse(prueba);

	}


}