package g01_03.gest_asobu.dominio;


import java.util.LinkedList;
import java.util.Vector;

import g01_03.gest_asobu.persistencia.AgenteDB;

public class DatosFomDAO {
	
	//Conexion para recuperar los datos de los Usuarios
	static final String ROL ="Rol";
	static final String ASOCIACION= "Asociacion";
	static final String TIPO_VIA= "TipoVia";
	
	private static DatosFomDAO myInstance=null;
	private static AgenteDB agente=null;
	private static LinkedList resultados=null;
	
	public DatosFomDAO() throws Exception{
		//Conectamos con la base de datos
		agente=AgenteDB.getAgente();
		
	}
	
	 public static DatosFomDAO getInstance() throws Exception{
	        if(myInstance == null)
	            myInstance = new DatosFomDAO();
	        return myInstance;
	    }

	 public static String[] getTipoVia() throws Exception{
		 String[] resul=null;
		 Vector<String> vec_aux=null;
		 String query="SELECT `tipoVia` FROM `"+ TIPO_VIA+"` ";
		 resultados=agente.select(query);
		 resul = new String[resultados.size()];
		 for(int i=0; i<resultados.size();i++){
			 vec_aux=(Vector<String>) resultados.get(i);
			 resul[i]=vec_aux.get(0);
		 } 			 
		 return resul;
		 
	 }
	 
	 public static String[] getRoles() throws Exception{
		 String[] resul=null;
		 Vector<String> vec_aux=null;
		 String query="SELECT `nombre` FROM `"+ ROL+"` ";
		 resultados=agente.select(query);
		 resul = new String[resultados.size()];
		 for(int i=0; i<resultados.size();i++){
			 vec_aux=(Vector<String>) resultados.get(i);
			 resul[i]=vec_aux.get(0);
		 } 			 
		 return resul;
	 }
}