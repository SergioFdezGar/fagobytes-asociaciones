package Dominio;

import java.sql.SQLException;

public class GestorMiembros {
	private static MiembroDAO miembroDao=null;
	public GestorMiembros() throws Exception {
			miembroDao= MiembroDAO.getInstance();
			listar();
	}

	 public boolean agregar(Miembro member) throws Exception{
		 boolean b=miembroDao.agregar(member);
		 listar();
		 return b;
		 
	}
	 public boolean modificar(Miembro actual, Miembro cambio) throws SQLException, Exception{
		 boolean b=miembroDao.modificar(actual, cambio);
		 listar();
		 return b;
		 
	 }
	 
	 public boolean eliminar(Miembro member) throws SQLException, Exception{
		 boolean b=miembroDao.eliminar(member);
		 listar();
		 return b;
	 }
	 
	 public void listar() throws SQLException, Exception{
		 miembroDao.listar();
	 }

	public Miembro getMiembro(int i) {
		return miembroDao.getMiembro(i);
	}

	public int numMiembros() {
		return miembroDao.numMiembros();
	}
	 
}
