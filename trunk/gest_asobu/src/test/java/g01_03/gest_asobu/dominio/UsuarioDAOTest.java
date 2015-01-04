package g01_03.gest_asobu.dominio;

//import java.sql.SQLException;

//import g01_03.gest_asobu.persistencia.AgenteDB;
import junit.framework.TestCase;

public class UsuarioDAOTest extends TestCase{

	 public void testAutenticar() throws Exception {
		 UsuarioDAO gesper;
         boolean prueba=true;
        	 	 gesper = new UsuarioDAO();
                 prueba=gesper.autenticar(null, null);
                 assertFalse(prueba);

 }
 
 public void testAutenticar2() throws Exception{
	 	 UsuarioDAO gesper;
         boolean prueba=true;

        	 	 gesper = new UsuarioDAO();
                 prueba=gesper.autenticar("hola", "123456458");
                 assertFalse(prueba);
 }
 
 public void testAutenticar3() throws Exception{
 	 UsuarioDAO gesper;
     boolean prueba=true;

    	 	 gesper = new UsuarioDAO();
             prueba=gesper.autenticar("sergio", "juas");
}
 
 public void testAgregar() throws Exception {
	 UsuarioDAO gesper;
	 Usuario user= new Usuario("prueba", "123");
     boolean prueba=true;
    	 	 gesper = new UsuarioDAO();
             prueba=gesper.agregar(user);
             assertFalse(prueba);

}
 
 public void testEliminar() throws Exception {
	 UsuarioDAO gesper;
	 Usuario user= new Usuario("prueba", "123");
     boolean prueba=true;
    	 	 gesper = new UsuarioDAO();
             prueba=gesper.eliminar(user);
             assertFalse(prueba);

}
 
 public void testModificar() throws Exception {
	 UsuarioDAO gesper;
	 Usuario user= new Usuario("prueba", "123");
	 Usuario user2= new Usuario("prueba2", "456");
     boolean prueba=true;
    	 	 gesper = new UsuarioDAO();
             prueba=gesper.modificar(user,user2);
             assertFalse(prueba);

}
 public void testModificar2() throws Exception {
	 UsuarioDAO gesper;
	 Usuario user= new Usuario("prueba", "123");
     boolean prueba=true;
    	 	 gesper = new UsuarioDAO();
             prueba=gesper.modificar(user);
             assertFalse(prueba);

}
}