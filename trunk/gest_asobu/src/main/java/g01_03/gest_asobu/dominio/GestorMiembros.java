package g01_03.gest_asobu.dominio;

import java.sql.SQLException;
import java.util.Vector;

public class GestorMiembros {
	
	private static MiembroDAO miembroDao=null;
	private static Miembro miembro_activo=null;
	private static Miembro miembro_modificado=null;
	
	
	public GestorMiembros() throws Exception {
			miembroDao= MiembroDAO.getInstance();
			listar();
	}

	 
	
	public boolean agregar(Vector<String> atrib_data) throws Exception{
		boolean b=false;
		
		miembro_activo=miembroDao.crear(atrib_data);
		miembro_modificado=null;
		
		if (miembro_activo!=null)
			b=miembroDao.agregar(miembro_activo);
		
		 if(b) listar();		 
		 
		 return b;
	}
	
	 public boolean modificar(Vector<String> atrib_data) throws SQLException, Exception{
		 boolean b= false;
		 
		 miembro_modificado=miembroDao.crear(atrib_data);
		 
		 if(miembro_modificado!=null)
			 b=miembroDao.modificar(miembro_activo, miembro_modificado);
		 
		 if (b){ 
			  listar();
		 	  miembro_activo=miembro_modificado;
		 	  miembro_modificado=null;
		 }
		 	
		 return b;
		 
	 }
	 
	 public boolean eliminar() throws SQLException, Exception{
		 boolean b=false;
		 
		 b=miembroDao.eliminar(miembro_activo);
		 if(b) listar();
		 
		 return b;
	 }
	 
	 public void listar() throws SQLException, Exception{
		 miembroDao.listar();
	 }

	 public Miembro getMiembro(int index) {
		miembro_activo=miembroDao.getMiembro(index);
		return miembro_activo;
	 } 
	 
	public Miembro getMiembro(String dni) throws SQLException, Exception {
		miembro_activo=miembroDao.getMiembro(dni);
		return miembro_activo;
	}

	public int numMiembros() throws SQLException, Exception {
		return miembroDao.numMiembros();
	}
	 
}
