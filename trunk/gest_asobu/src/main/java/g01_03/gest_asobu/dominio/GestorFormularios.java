package g01_03.gest_asobu.dominio;

import java.sql.SQLException;
import java.util.LinkedList;

public class GestorFormularios {
	private static DatosFomDAO DatosFormDao=null;
	
	public GestorFormularios() throws Exception {
			DatosFormDao= DatosFormDao.getInstance();
	}

	 public String[] getTipoVia() throws Exception{
		 return DatosFomDAO.getTipoVia();
	 }
	 
	 public String[] getRoles() throws Exception{
		 return DatosFomDAO.getRoles();
	 } 
}


