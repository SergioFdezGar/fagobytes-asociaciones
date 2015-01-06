/**
 * 
 */
package g01_03.gest_asobu.dominio;

import java.sql.SQLException;
import java.util.Vector;

/**
 * @author v4lm0nt
 *
 */
public class GestorUsuario {

	private static UsuarioDAO usuarioDao=null;
	private static Usuario usuario_activo=null;
	private static Usuario usuario_modificado=null;;
	public GestorUsuario() throws Exception{
		usuarioDao= UsuarioDAO.getInstance();
		listar();
	}
	
	public boolean autenticar(String name_user, String pass) throws Exception{
		return usuarioDao.autenticar(name_user,pass);
	}
	
	 public boolean agregar(Vector<String> atrib_data) throws Exception{
		boolean b=false;
		
		usuario_activo=usuarioDao.crearUsuario(atrib_data);
		usuario_modificado=null;
		
		if (usuario_activo!=null)
			b=usuarioDao.agregar(usuario_activo);
		
		 if(b) listar();		 
		 
		 return b;
	}
	 
	 public boolean modificar(Vector<String> atrib_data) throws SQLException, Exception{
		 boolean b= false;
		 
		 usuario_modificado=usuarioDao.crearUsuario(atrib_data);
		 
		 if(usuario_modificado!=null)
			 b=usuarioDao.modificar(usuario_activo, usuario_modificado);
		 
		 if (b){ 
			  listar();
		 	  usuario_activo=usuario_modificado;
		 	  usuario_modificado=null;
		 }
		 	
		 return b;
	 }
	 public boolean modificarUsuario() throws SQLException, Exception{
		 boolean b=false;
		 
		 b=usuarioDao.eliminar(usuario_activo);
		 if(b) listar();
		 
		 return b;
	 }
	 
	 public boolean eliminar() throws SQLException, Exception{
		 boolean b=false;
		 
		 b=usuarioDao.eliminar(usuario_activo);
		 if(b) listar();
		 
		 return b;
	 }
	 
	 public void listar() throws SQLException, Exception{
		 usuarioDao.listar();
	 }

	public Usuario getUsuario(int i) {
		usuario_activo=usuarioDao.getUsuario(i);
		return usuario_activo;
	}

	public Usuario getUsuario(String nombre) throws SQLException, Exception {
		usuario_activo=usuarioDao.getUsuario(nombre);
		return usuario_activo;
	}
	public int numUsuarios() {
		return usuarioDao.numUsuarios();
	}
	
}
