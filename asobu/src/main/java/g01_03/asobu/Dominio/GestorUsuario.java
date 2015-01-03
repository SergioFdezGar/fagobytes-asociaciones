/**
 * 
 */
package Dominio;

import java.sql.SQLException;

/**
 * @author v4lm0nt
 *
 */
public class GestorUsuario {

	private static UsuarioDAO usuarioDao=null;
	public GestorUsuario() throws Exception{
		usuarioDao= UsuarioDAO.getInstance();
		listar();
	}
	
	public boolean autenticar(String name_user, String pass) throws Exception{
		return usuarioDao.autenticar(name_user,pass);
	}
	
	 public boolean agregar(Usuario user) throws Exception{
		return usuarioDao.agregar(user);
	}
	 public boolean modificar(Usuario actual, Usuario cambio){
		 return usuarioDao.modificar(actual, cambio);
	 }
	 public boolean modificar(Usuario cambio){
		 return usuarioDao.modificar(cambio);
	 }
	 
	 public boolean eliminar(Usuario user){
		 return usuarioDao.eliminar(user);
	 }
	 
	 public void listar() throws SQLException, Exception{
		 usuarioDao.listar();
	 }

	public Usuario getUsuario(int i) {
		return usuarioDao.getUsuario(i);
	}

	public int numUsuarios() {
		return usuarioDao.numUsuarios();
	}
	
}
