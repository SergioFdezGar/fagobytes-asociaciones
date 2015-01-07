package g01_03.gest_asobu.dominio;

import java.sql.SQLException;
import java.util.Vector;

public class GestorMiembros {
	
	private static MiembroDAO miembroDao=null;
	private static Miembro miembro_activo=null;
	private static Miembro miembro_modificado=null;
	private int maximo_paginas;
	private int pagina_actual;
	
	
	
	public GestorMiembros() throws Exception {
			miembroDao= MiembroDAO.getInstance();
			setPagina_actual(1);
			//Por defecto se toma valor maximo de pagina 10
			miembroDao.setTamanio_pagina(1);
			accederPagina(1);
			setMaximo_paginas(miembroDao.paginar());
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




	public boolean agregar(Vector<String> atrib_data) throws Exception{
		boolean b=false;
		
		miembro_activo=miembroDao.crear(atrib_data);
		miembro_modificado=null;
		
		if (miembro_activo!=null)
			b=miembroDao.agregar(miembro_activo);
		
		 if(b) accederPagina(getPagina_actual());		 
		 
		 return b;
	}
	
	 public boolean modificar(Vector<String> atrib_data) throws SQLException, Exception{
		 boolean b= false;
		 
		 miembro_modificado=miembroDao.crear(atrib_data);
		 
		 if(miembro_modificado!=null)
			 b=miembroDao.modificar(miembro_activo, miembro_modificado);
		 
		 if (b){ 
			  accederPagina(getPagina_actual());
		 	  miembro_activo=miembro_modificado;
		 	  miembro_modificado=null;
		 }
		 	
		 return b;
		 
	 }
	 
	 public boolean eliminar() throws SQLException, Exception{
		 boolean b=false;
		 
		 b=miembroDao.eliminar(miembro_activo);
		 if(b) accederPagina(getPagina_actual());
		 
		 return b;
	 }
	 
	 public Miembro getMiembro(int index) {
		miembro_activo=miembroDao.getMiembro(index);
		return miembro_activo;
	 } 
	 
	public Miembro getMiembro(String dni) throws SQLException, Exception {
		miembro_activo=miembroDao.getMiembro(dni);
		return miembro_activo;
	}

	public int numMiembrosLista() throws SQLException, Exception {
		return miembroDao.numMiembrosLista();
	}
	
	public int numMiembros() throws SQLException, Exception {
		return miembroDao.numMiembros();
	}
	
	
	public boolean accederPagina(int pagina) throws SQLException, Exception {
		return	miembroDao.accederPagina(pagina);
	}
}
