package g01_03.gest_asobu.dominio;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Vector;

import g01_03.gest_asobu.persistencia.AgenteDB;

public class UsuarioDAO {
	
	//Conexion para recuperar los datos de los Usuarios
	static final String T_USUARIO ="Usuario";
	static final String COLUMS_USUARIO= "`nombre`, `password`";
	static final String NAME= "nombre";
	static final String PASSWORD= "password";
	private static UsuarioDAO myInstance=null;
	private static AgenteDB agente=null;
	private static LinkedList<Usuario> lista_usuarios= new LinkedList<Usuario>();
	
	public UsuarioDAO() throws Exception  {
		//Conectamos con la base de datos
		agente=AgenteDB.getAgente();
		
	}
	
	 public static UsuarioDAO getInstance() throws Exception{
	        if(myInstance == null)
	            myInstance = new UsuarioDAO();
	        return myInstance;
	    }

	 public boolean autenticar(String user_name, String pass) throws Exception{
		 LinkedList<Vector<String>> resultados=null;
		 boolean b=false;
		 
		 String query="SELECT * FROM `"+ T_USUARIO+
				 "` WHERE `"+ NAME + "`= '"+ user_name 
				 +"' AND `"+PASSWORD+ "`='"+ pass+ "'";

		 resultados=agente.select(query);		 
		 if(resultados.size()==1){
			 b=true;
		 }
			 
		 
		 return b;
		 
	 }


	 public boolean agregar(Usuario user){
		 boolean b=false;
		 String valores= user.toString();
		 
		 String query="INSERT INTO `"+ T_USUARIO+
				 "` ("+ COLUMS_USUARIO + ") VALUES " + "(NULL,"+ valores +")";
		 try {
			agente.insert(query);
			b=true;
			
			//Hay que agregar los insert para la tabla relacion
			
			
			
		} catch (SQLException e) {
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			b=false;
		}
		 
		 return b;
	 }

	 public boolean modificar(Usuario actual, Usuario cambio){
		 boolean b=false;
		 String valores= diferencias(actual, cambio);
		 
		 String query="UPDATE `"+ T_USUARIO+
				 "` SET "+ valores + " WHERE `nombre`='"+ actual.getUsuario() +"'";
		 try {
			 if(valores.length()>0)
				 agente.update(query);
			 
			 
			b=true;
		} catch (SQLException e) {
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			b=false;
		}
		 
		 return b;
	 }
	 
	 public boolean modificar(Usuario usuario){
		 boolean b=false;
		 String valores= usuario.toString();
		 
		 
		 String query="UPDATE `"+ T_USUARIO+
				 "` SET "+ valores + " WHERE `nombre`='"+ usuario.getUsuario() +"'";
		 try {
			 if(valores.length()>0)
				 agente.update(query);
			 
			 
			b=true;
		} catch (SQLException e) {
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			b=false;
		}
		 
		 return b;
	 }
	 
	public boolean eliminar(Usuario user){
		 boolean b=false;
		 String query="DELETE FROM `"+ T_USUARIO+
				 "` WHERE `nombre`='"+ user.getUsuario()+"'";
		 
		 try {
			agente.delete(query);
			b=true;
		} catch (SQLException e) {
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			b=false;
		}
		 
		 return b;
	 }
	
	private String diferencias(Usuario actual, Usuario other) {
		String cadena="";
			
		if(actual.getUsuario().equals(other.getUsuario())){
			cadena="`nombre`='"+other.getUsuario()+"' ";
		}
		if(actual.getPassword().equals(other.getPassword())){
			cadena+="`password`='"+other.getPassword()+"' ";
		}
				
		return cadena;
	}

	public void listar() throws SQLException, Exception {		 
		LinkedList<Vector<String>> resultados=null;
		lista_usuarios= new LinkedList<Usuario>();
		Usuario aux= null;
		Vector<String> vec_aux=null;
		String query ="SELECT * FROM `"+T_USUARIO+"`";
		 resultados=agente.select(query);

		 for(int i=0; i<resultados.size();i++){
			 vec_aux=(Vector<String>) resultados.get(i);
			 aux=crearUsuario(vec_aux);
			 lista_usuarios.add(aux);
		 }
	}

	private Usuario crearUsuario(Vector<String> vector) throws SQLException, Exception {

		Usuario user= new Usuario(vector.get(0), vector.get(1)); 
		
		return user;
	}

	public Usuario getUsuario(int i) {
		return lista_usuarios.get(i);
	}

	public int numUsuarios() {
		return lista_usuarios.size();
	}
}
