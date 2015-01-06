package g01_03.gest_asobu.dominio;

//import java.sql.SQLException;

//import g01_03.gest_asobu.persistencia.AgenteDB;
import junit.framework.TestCase;

public class UsuarioDAOTest extends TestCase{

	 public void test01Autenticar() throws Exception {
		 UsuarioDAO gesper;
         boolean prueba=true;
        	 	 gesper = new UsuarioDAO();
                 prueba=gesper.autenticar(null, null);
                 assertFalse(prueba);
                 
	 }
 
	 public void test02Autenticar2() throws Exception{
		 	 UsuarioDAO gesper;
	         boolean prueba=true;
	
	        	 	 gesper = new UsuarioDAO();
	                 prueba=gesper.autenticar("hola", "123456458");
	                 assertFalse(prueba);
	 }
	 
	 public void test03Autenticar3() throws Exception{
	 	 UsuarioDAO gesper;
	     boolean prueba=true;
	
	    	 	 gesper = new UsuarioDAO();
	             prueba=gesper.autenticar("sergio", "juas");
	            //
	             assertTrue(prueba);
	}
	 
	 public void test04Agregar() throws Exception {
		 UsuarioDAO gesper;
		 Usuario user= new Usuario("prueba", "123");
	     boolean prueba=true;
	    	 	 gesper = new UsuarioDAO();
	             prueba=gesper.agregar(user);
	             //
	             assertTrue(prueba);
	
	}
	 
	 public void test05Eliminar1() throws Exception {
		 UsuarioDAO gesper;
		 Usuario user= new Usuario("prueba", "123");
	     boolean prueba=true;
	    	 	 gesper = new UsuarioDAO();
	             prueba=gesper.eliminar(user);
	             //
	             assertFalse(prueba);
	
	}
	 
	 public void test06Modificar() throws Exception {
		 UsuarioDAO gesper;
		 Usuario user= new Usuario("prueba", "123");
		 Usuario user2= new Usuario("prueba2", "456");
	     boolean prueba=true;
	    	 	 gesper = new UsuarioDAO();
	             prueba=gesper.modificar(user,user2);
	             //
	             assertTrue(prueba);
	
	} 
	 
	public void test07Eliminar2() throws Exception {
		 UsuarioDAO gesper;
		 Usuario user= new Usuario("prueba2", "456");
	     boolean prueba=true;
	    	 	 gesper = new UsuarioDAO();
	             prueba=gesper.eliminar(user);
	             //
	             assertTrue(prueba);
	
	}
	 
	 
	 public void test08Modificar2() throws Exception {
		 UsuarioDAO gesper;
		 Usuario user= new Usuario("prueba", "123");
	     boolean prueba=true;
	    	 	 gesper = new UsuarioDAO();
	             prueba=gesper.modificar(user);
	             assertFalse(prueba);
	
	}
}