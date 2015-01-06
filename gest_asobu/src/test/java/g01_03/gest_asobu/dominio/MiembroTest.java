package g01_03.gest_asobu.dominio;

import junit.framework.TestCase;

public class MiembroTest extends TestCase{


	public void testGetDNI() throws Exception {
		Miembro mi= new Miembro("01", "prueba", "pruebita", "pruebota", "1900-09-01", "Avenida", "callesita", 1, "B", 0, "A", 13003, "ciu", "culipardolandia", "555", "oins", "socio");
		assertTrue(mi.getDni().equals("01"));
	}
	public void testGetNombre() throws Exception {
		Miembro mi= new Miembro("01", "prueba", "pruebita", "pruebota", "1900-09-01", "Avenida", "callesita", 1, "B", 0, "A", 13003, "ciu", "culipardolandia", "555", "oins", "socio");
		assertTrue(mi.getNombre().equals("prueba"));
	}
	public void testGetApellidos1() throws Exception {
		Miembro mi= new Miembro("01", "prueba", "pruebita", "pruebota", "1900-09-01", "Avenida", "callesita", 1, "B", 0, "A", 13003, "ciu", "culipardolandia", "555", "oins", "socio");
		assertTrue(mi.getApellidos1().equals("pruebita"));
	}	
	public void testGetApellidos2() throws Exception {
		Miembro mi= new Miembro("01", "prueba", "pruebita", "pruebota", "1900-09-01", "Avenida", "callesita", 1, "B", 0, "A", 13003, "ciu", "culipardolandia", "555", "oins", "socio");
		assertTrue(mi.getApellidos2().equals("pruebota"));
	}	
	public void testGetFechaNacimiento() throws Exception {
		Miembro mi= new Miembro("01", "prueba", "pruebita", "pruebota", "1900-09-01", "Avenida", "callesita", 1, "B", 0, "A", 13003, "ciu", "culipardolandia", "555", "oins", "socio");
		assertTrue(mi.getFechaNacimiento().equals("1900-09-01"));
	}	
	public void testGetTipoVia() throws Exception {
		Miembro mi= new Miembro("01", "prueba", "pruebita", "pruebota", "1900-09-01", "Avenida", "callesita", 1, "B", 0, "A", 13003, "ciu", "culipardolandia", "555", "oins", "socio");
		assertTrue(mi.getTipoVia().equals("Avenida"));
	}	
	public void testGetDireccion() throws Exception {
		Miembro mi= new Miembro("01", "prueba", "pruebita", "pruebota", "1900-09-01", "Avenida", "callesita", 1, "B", 0, "A", 13003, "ciu", "culipardolandia", "555", "oins", "socio");
		assertTrue(mi.getDireccion().equals("callesita"));
	}	
	public void testGetnCalle() throws Exception {
		Miembro mi= new Miembro("01", "prueba", "pruebita", "pruebota", "1900-09-01", "Avenida", "callesita", 1, "B", 0, "A", 13003, "ciu", "culipardolandia", "555", "oins", "socio");
		assertTrue(mi.getnCalle()==1);
	}	
	public void testGetEscalera() throws Exception {
		Miembro mi= new Miembro("01", "prueba", "pruebita", "pruebota", "1900-09-01", "Avenida", "callesita", 1, "B", 0, "A", 13003, "ciu", "culipardolandia", "555", "oins", "socio");
		assertTrue(mi.getEscalera().equals("B"));
	}	
	public void testGetPiso() throws Exception {
		Miembro mi= new Miembro("01", "prueba", "pruebita", "pruebota", "1900-09-01", "Avenida", "callesita", 1, "B", 0, "A", 13003, "ciu", "culipardolandia", "555", "oins", "socio");
		assertTrue(mi.getPiso()==0);
	}
	public void testGetPuerta() throws Exception {
		Miembro mi= new Miembro("01", "prueba", "pruebita", "pruebota", "1900-09-01", "Avenida", "callesita", 1, "B", 0, "A", 13003, "ciu", "culipardolandia", "555", "oins", "socio");
		assertTrue(mi.getPuerta().equals("A"));
	}	
	public void testGetCodigoPostal() throws Exception {
		Miembro mi= new Miembro("01", "prueba", "pruebita", "pruebota", "1900-09-01", "Avenida", "callesita", 1, "B", 0, "A", 13003, "ciu", "culipardolandia", "555", "oins", "socio");
		assertTrue(mi.getCodigoPostal()==13003);
	}
	public void testGetProvincia() throws Exception {
		Miembro mi= new Miembro("01", "prueba", "pruebita", "pruebota", "1900-09-01", "Avenida", "callesita", 1, "B", 0, "A", 13003, "ciu", "culipardolandia", "555", "oins", "socio");
		assertTrue(mi.getProvincia().equals("ciu"));
	}
	public void testGetLocalidad() throws Exception {
		Miembro mi= new Miembro("01", "prueba", "pruebita", "pruebota", "1900-09-01", "Avenida", "callesita", 1, "B", 0, "A", 13003, "ciu", "culipardolandia", "555", "oins", "socio");
		assertTrue(mi.getLocalidad().equals("culipardolandia"));
	}
	public void testGetTelefono() throws Exception {
		Miembro mi= new Miembro("01", "prueba", "pruebita", "pruebota", "1900-09-01", "Avenida", "callesita", 1, "B", 0, "A", 13003, "ciu", "culipardolandia", "555", "oins", "socio");
		assertTrue(mi.getTelefono().equals("555"));
	}
	public void testGetCorreoElectronico() throws Exception {
		Miembro mi= new Miembro("01", "prueba", "pruebita", "pruebota", "1900-09-01", "Avenida", "callesita", 1, "B", 0, "A", 13003, "ciu", "culipardolandia", "555", "oins", "socio");
		assertTrue(mi.getCorreoElectronico().equals("oins"));
	}
	public void testGetRol() throws Exception {
		Miembro mi= new Miembro("01", "prueba", "pruebita", "pruebota", "1900-09-01", "Avenida", "callesita", 1, "B", 0, "A", 13003, "ciu", "culipardolandia", "555", "oins", "socio");
		assertTrue(mi.getRol().equals("socio"));
	}
}