package Dominio;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Vector;

import Persistencia.AgenteDB;

public class MiembroDAO {

	//Conexion para recuperar los datos de los Miembros
	static final String T_ASOCIACION ="Asociacion";
	static final String COLUMS_ASOCIACION= "`idSocio`, `dni`, `nombre`, `apellido1`, `apellido2`, `nacimiento`, `tipo_via`, `direccion`,"
	+"`numero`, `escalera`, `piso`, `puerta`, `cod_postal`, `provincia`, `localidad`, `tlfn`, `email`";
	static final String T_RELACION="Relacion";
	static final String COLUMS_RELACION="`dni`,`idRol`,`fechaAlta`";
	static final String T_ROL ="Rol";
	
	private static MiembroDAO myInstance=null;
	private static AgenteDB agente=null;
	private static LinkedList<Miembro> lista_miembros= new LinkedList<Miembro>();
	
	public MiembroDAO() throws Exception  {
		//Conectamos con la base de datos
		agente=AgenteDB.getAgente();
		
	}
	
	 public static MiembroDAO getInstance() throws Exception{
	        if(myInstance == null)
	            myInstance = new MiembroDAO();
	        return myInstance;
	    }

	 public boolean agregar(Miembro member){
		 boolean b=false;
		 String valores= member.toString();
		 
		 String query="INSERT INTO `"+ T_ASOCIACION+
				 "` ("+ COLUMS_ASOCIACION + ") VALUES " + "(NULL,"+ valores +")";
		 try {
			agente.insert(query);
			
			b=agregarRelacion(member);
			
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

	 private boolean agregarRelacion(Miembro member) {
		 boolean b=false;
		 LinkedList<Vector<String>> resultados=null;
		 Vector<String> vec_aux=null;
		 int idRol;
		 try {
			 String query1="SELECT `idRol` FROM `"+ T_ROL+
					 "` WHERE `nombre`='"+member.getRol()+"'";	
			 
			 resultados=agente.select(query1);
			 vec_aux=(Vector<String>) resultados.get(0);
			 idRol=Integer.parseInt(vec_aux.get(0));
			//--------------------------
			 
			 
	
			 String query2="INSERT INTO `"+ T_RELACION+
					 "` ("+ COLUMS_RELACION + ") VALUES " + "('"+member.getDni()+ "',"+ idRol+", CURDATE())";
		 
			agente.insert(query2);
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

	public boolean modificar(Miembro actual, Miembro cambio){
		 boolean b=false;
		 String valores= diferencias(actual, cambio);
		 
		 String query="UPDATE `"+ T_ASOCIACION+
				 "` SET "+ valores + " WHERE `dni`='"+ actual.getDni() +"'";
		 try {
			 if(valores.length()>0)
				 agente.update(query);
			 
			 
			 //Comprobar si se ha cambiado el ROL
			 
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
	 
	public boolean eliminar(Miembro member){
		 boolean b=false;
		 String query="DELETE FROM `"+ T_ASOCIACION+
				 "` WHERE `dni`='"+ member.getDni()+"'";
		 
		 try {
			 b=eliminarRelacion(member);
			 agente.delete(query);
			
			
			
		} catch (SQLException e) {
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			b=false;
		}
		 
		 return b;
	 }

	 private boolean eliminarRelacion(Miembro member) {
		 boolean b=false;
		 String query="UPDATE `"+ T_RELACION+
				 "` SET `fechaBaja`= CURDATE()  WHERE `dni`='"+ member.getDni() +"' ORDER BY `fechaAlta` DESC, `idRelacion`DESC limit 1";
		 try {
			 agente.update(query);
			 b=true;
			
		} catch (SQLException e) {
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return b;
	}
	 
//	private String crearValores(LinkedList<String> datos) {
//		
//		String cadena="";
//		//Desde DNI hasta tipo_via
//		for(int i=0; i<7;i++){
//			cadena+="`"+datos.get(i)+"`,";
//		}
//		
//		cadena+=datos.get(7)+",";  //Numero
//		cadena+="`"+datos.get(8)+"`,"; //Escalera
//		cadena+=datos.get(9)+",";//Piso
//		cadena+="`"+datos.get(10)+"`,";//Puerta
//		cadena+=datos.get(11)+",";//Cod_postal
//		
//		//Desde provincia hasta tlfn
//		for(int i=12; i<15;i++){
//			cadena+="`"+datos.get(i)+"`,";
//		}
//		
//		cadena+="`"+datos.get(15)+"`,";//email
//		
//		return cadena;
//	}
	
	private String diferencias(Miembro actual, Miembro other) {
		String cadena="";
			
		if(actual.getDni().equals(other.getDni())){
			cadena="`dni`='"+other.getDni()+"' ";
		}
		if(actual.getNombre().equals(other.getNombre())){
			cadena+="`nombre`='"+other.getNombre()+"' ";
		}
		if(actual.getApellidos1().equals(other.getApellidos1())){
			cadena+="`apellido1`='"+other.getApellidos1()+"' ";
		}
		if(actual.getApellidos2().equals(other.getApellidos2())){
			cadena+="`apellido2`='"+other.getApellidos2()+"' ";
		}
		if(actual.getFechaNacimiento().equals(other.getFechaNacimiento())){
			cadena+="`nacimiento`='"+other.getFechaNacimiento()+"' ";
		}
		if(actual.getDireccion().equals(other.getDireccion())){
			cadena+="`direccion`='"+other.getDireccion()+"' ";
		}
		if(actual.getTipoVia().equals(other.getTipoVia())){
			cadena+="`tipo_via`='"+other.getTipoVia()+"' ";
		}
		
		
		if(actual.getnCalle()==other.getnCalle()){
			cadena+="`numero`="+other.getnCalle()+" ";
		}
		

		if(actual.getEscalera().equals(other.getEscalera())){
			cadena+="`escalera`='"+other.getEscalera()+"' ";
		}
		
		
		if(actual.getPiso()==other.getPiso()){
			cadena+="`piso`="+other.getDni()+" ";
		}
		
		
		if(actual.getPuerta().equals(other.getPuerta())){
			cadena="`puerta`='"+other.getPuerta()+"' ";
		}
		
		
		if(actual.getCodigoPostal()==other.getCodigoPostal()){
			cadena="`cod_postal`="+other.getDni()+" ";
		}
		
		
		if(actual.getProvincia().equals(other.getProvincia())){
			cadena="`provincia`='"+other.getProvincia()+"' ";
		}
		if(actual.getLocalidad().equals(other.getLocalidad())){
			cadena="`localidad`='"+other.getLocalidad()+"' ";
		}
		
		//Debería ser una cadena de texto maxlenght 15
		if(actual.getTelefono()==other.getTelefono()){
			cadena="`tlfn`='"+other.getTelefono()+"' ";
		}
		
		
		if(actual.getCorreoElectronico().equals(other.getCodigoPostal())){
			cadena="`email`='"+other.getCorreoElectronico()+"' ";
		}
				
		return cadena;
	}

	public void listar() throws SQLException, Exception {		 
		LinkedList<Vector<String>> resultados=null;
		lista_miembros= new LinkedList<Miembro>();
		Miembro aux= null;
		Vector<String> vec_aux=null;
		String query ="SELECT * FROM `"+T_ASOCIACION+"`";
		 resultados=agente.select(query);

		 for(int i=0; i<resultados.size();i++){
			 vec_aux=(Vector<String>) resultados.get(i);
			 aux=crearMiembro(vec_aux);
			 lista_miembros.add(aux);
		 }
	}

	private Miembro crearMiembro(Vector<String> vector) throws SQLException, Exception {
		LinkedList<Vector<String>> resultados=null;
		String rol= null;
		
		String query ="SELECT `nombre` FROM `"+T_ROL+"` WHERE `idRol`="
				+ " (SELECT `idRol` FROM `"+T_RELACION+"` WHERE `dni`= '"+vector.get(1)+"' ORDER BY Relacion.fechaAlta DESC, Relacion.idRelacion DESC limit 1)"; 

		resultados=agente.select(query);
		rol=resultados.get(0).get(0);
		
		Miembro member= new Miembro(vector.get(1), vector.get(2), vector.get(3),
				vector.get(4), vector.get(5), vector.get(6),
				vector.get(7), Integer.parseInt(vector.get(8)),
				vector.get(9), Integer.parseInt(vector.get(10)),
				vector.get(11), Integer.parseInt(vector.get(12)),
				vector.get(13),vector.get(14), vector.get(15),
				vector.get(16), rol); 
		
		return member;
	}

	public Miembro getMiembro(int i) {
		return lista_miembros.get(i);
	}

	public int numMiembros() {
		return lista_miembros.size();
	}
}
