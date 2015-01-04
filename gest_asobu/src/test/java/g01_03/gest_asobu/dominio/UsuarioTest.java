package g01_03.gest_asobu.dominio;

import junit.framework.TestCase;

public class UsuarioTest extends TestCase{

	public void testUsuario() {
		Usuario user=new Usuario("pepe", "angustias");
		assertFalse(user.getUsuario().equals(user));
	}

	public void testGet_usuario() {
		String user= "pepe";
		String password= "12345";
		Usuario persona2= new Usuario (user,password);
		assertTrue(persona2.getUsuario().equals(user));
	}

	public void testGet_password() {
		String user= "pepe";
		String password= "12345";
		Usuario persona3= new Usuario (user,password);
		assertTrue(persona3.getPassword().equals(password));
	}


}

