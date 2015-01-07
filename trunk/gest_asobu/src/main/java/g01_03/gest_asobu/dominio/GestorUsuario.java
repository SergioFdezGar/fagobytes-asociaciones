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
	
	private int maximo_paginas;
	private int pagina_actual;
	
	
	public GestorUsuario() throws Exception{
		usuarioDao= UsuarioDAO.getInstance();
		setPagina_actual(1);
		//Por defecto se toma valor maximo de pagina 10
		usuarioDao.setTamanio_pagina(1);
		accederPagina(1);
		setMaximo_paginas(usuarioDao.paginar());
	}
	
	/**
	 * @return the maximo_paginas
	 */
	public int getMaximo_paginas() {
		return maximo_paginas;
	}



	/**
	 * @param maximo_paginas the maximo_paginas to set
	 */
	public void setMaximo_paginas(int maximo_paginas) {
		this.maximo_paginas = maximo_paginas;
	}



	/**
	 * @return the pagina_actual
	 */
	public int getPagina_actual() {
		return pagina_actual;
	}



	/**
	 * @param pagina_actual the pagina_actual to set
	 */
	public void setPagina_actual(int pagina_actual) {
		this.pagina_actual = pagina_actual;
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
		
		 if(b) accederPagina(getPagina_actual());		 
		 
		 return b;
	}
	 
	 public boolean modificar(Vector<String> atrib_data) throws SQLException, Exception{
		 boolean b= false;
		 
		 usuario_modificado=usuarioDao.crearUsuario(atrib_data);
		 
		 if(usuario_modificado!=null)
			 b=usuarioDao.modificar(usuario_activo, usuario_modificado);
		 
		 if (b){ 
			  accederPagina(getPagina_actual());
		 	  usuario_activo=usuario_modificado;
		 	  usuario_modificado=null;
		 }
		 	
		 return b;
	 }
	 public boolean modificarUsuario() throws SQLException, Exception{
		 boolean b=false;
		 
		 b=usuarioDao.eliminar(usuario_activo);
		 if(b) accederPagina(getPagina_actual());
		 
		 return b;
	 }
	 
	 public boolean eliminar() throws SQLException, Exception{
		 boolean b=false;
		 
		 b=usuarioDao.eliminar(usuario_activo);
		 if(b) accederPagina(getPagina_actual());
		 
		 return b;
	 }
	 
	public Usuario getUsuario(int i) {
		usuario_activo=usuarioDao.getUsuario(i);
		return usuario_activo;
	}

	public Usuario getUsuario(String nombre) throws SQLException, Exception {
		usuario_activo=usuarioDao.getUsuario(nombre);
		return usuario_activo;
	}
	
	public int numUsuariosLista() {
		return usuarioDao.numUsuariosLista();
	}
	
	public int numUsuarios() throws SQLException, Exception {
		return usuarioDao.numUsuarios();
	}
	
	public boolean accederPagina(int pagina) throws SQLException, Exception {
		return	usuarioDao.accederPagina(pagina);
	}
	
}
