package g01_03.gest_asobu.dominio;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Vector;

import g01_03.gest_asobu.persistencia.AgenteDB;

public class MiembroDAO {

	//Conexion para recuperar los datos de los Miembros
	static final String T_ASOCIACION ="Asociacion";
	static final String COLUMS_ASOCIACION= "`dni`, `nombre`, `apellido1`, `apellido2`, `nacimiento`, `tipo_via`, `direccion`,"
	+"`numero`, `escalera`, `piso`, `puerta`, `cod_postal`, `provincia`, `localidad`, `tlfn`, `email`";
	static final String T_RELACION="Relacion";
	static final String COLUMS_RELACION="`dni`,`idRol`,`fechaAlta`";
	static final String T_ROL ="Rol";
	
	private static MiembroDAO myInstance=null;
	private static AgenteDB agente=null;
	private static LinkedList<Miembro> lista_miembros= new LinkedList<Miembro>();
	
	private int total_paginas;
	private int pagina_actual;
	private int tamanio_pagina;
	
	
	public MiembroDAO() throws Exception  {
		//Conectamos con la base de datos
		agente=AgenteDB.getAgente();
		total_paginas=0;
		pagina_actual=1;
		tamanio_pagina= numMiembros();
	}
	
	 public static MiembroDAO getInstance() throws Exception{
	        if(myInstance == null)
	            myInstance = new MiembroDAO();
	        return myInstance;
	    }

	 /**
	 * @return the total_paginas
	 */
	public int getTotal_paginas() {
		return total_paginas;
	}

	/**
	 * @param total_paginas the total_paginas to set
	 */
	public void setTotal_paginas(int total_paginas) {
		this.total_paginas = total_paginas;
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

	/**
	 * @return the tamanio_pagina
	 */
	public int getTamanio_pagina() {
		return tamanio_pagina;
	}

	/**
	 * @param tamanio_pagina the tamanio_pagina to set
	 */
	public void setTamanio_pagina(int tamanio_pagina) {
		this.tamanio_pagina = tamanio_pagina;
	}

	public boolean agregar(Miembro member){
		 boolean b=false;
		 String valores= member.toString();
		 
		 String query="INSERT INTO `"+ T_ASOCIACION+
				 "` ("+ COLUMS_ASOCIACION + ") VALUES " + "("+ valores +")";
		 try {
			b=agente.insert(query)>0?agregarRelacion(member): false;
		} catch (SQLException e) {
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		 
			b=agente.insert(query2)>0? true: false;
			
			
			
		} catch (SQLException e) {
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
				 b=agente.update(query,false)>0? true: false;;
			 
			 
			 //Comprobar si se ha cambiado el ROL
			 
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return b;
	 }
	 
	public boolean eliminar(Miembro member){
		 boolean b=false;
		 String query="DELETE FROM `"+ T_ASOCIACION+
				 "` WHERE `dni`='"+ member.getDni()+"'";
		 
		 try {
			 if(eliminarRelacion(member)){
				 b=agente.delete(query, false)>0? true : false; 
			 } 
			 
		} catch (SQLException e) {
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return b;
	 }

	 private boolean eliminarRelacion(Miembro member) {
		 boolean b=false;
		 String query="UPDATE `"+ T_RELACION+
				 "` SET `fechaBaja`= CURDATE()  WHERE `dni`='"+ member.getDni() +"' ORDER BY `fechaAlta` DESC, `idRelacion` DESC limit 1";
		 try {
			 b=agente.update(query)>0? true: false;
		} catch (SQLException e) {
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return b;
	}
	 	
	private String diferencias(Miembro actual, Miembro other) {
		String cadena="";
		boolean corregir=true;	
		if(actual.getDni().equals(other.getDni())){
			cadena="`dni`='"+other.getDni()+"', ";
		}
		if(actual.getNombre().equals(other.getNombre())){
			cadena+="`nombre`='"+other.getNombre()+"', ";
		}
		if(actual.getApellidos1().equals(other.getApellidos1())){
			cadena+="`apellido1`='"+other.getApellidos1()+"', ";
		}
		if(actual.getApellidos2().equals(other.getApellidos2())){
			cadena+="`apellido2`='"+other.getApellidos2()+"', ";
		}
		if(actual.getFechaNacimiento().equals(other.getFechaNacimiento())){
			cadena+="`nacimiento`='"+other.getFechaNacimiento()+"', ";
		}
		if(actual.getDireccion().equals(other.getDireccion())){
			cadena+="`direccion`='"+other.getDireccion()+"', ";
		}
		if(actual.getTipoVia().equals(other.getTipoVia())){
			cadena+="`tipo_via`='"+other.getTipoVia()+"', ";
		}
		
		
		if(actual.getnCalle()==other.getnCalle()){
			cadena+="`numero`="+other.getnCalle()+", ";
		}
		

		if(actual.getEscalera().equals(other.getEscalera())){
			cadena+="`escalera`='"+other.getEscalera()+"', ";
		}
		
		
		if(actual.getPiso()==other.getPiso()){
			cadena+="`piso`="+other.getPiso()+", ";
		}
		
		
		if(actual.getPuerta().equals(other.getPuerta())){
			cadena="`puerta`='"+other.getPuerta()+"' ";
		}
		
		
		if(actual.getCodigoPostal()==other.getCodigoPostal()){
			cadena="`cod_postal`="+other.getCodigoPostal()+", ";
		}
		
		
		if(actual.getProvincia().equals(other.getProvincia())){
			cadena="`provincia`='"+other.getProvincia()+"', ";
		}
		if(actual.getLocalidad().equals(other.getLocalidad())){
			cadena="`localidad`='"+other.getLocalidad()+"', ";
		}
		
		if(actual.getTelefono()==other.getTelefono()){
			cadena="`tlfn`='"+other.getTelefono()+"', ";
		}
		
		if(actual.getCorreoElectronico().equals(other.getCodigoPostal())){
			cadena="`email`='"+other.getCorreoElectronico()+"' ";
			corregir=false;
		}
		
		if(corregir)cadena=cadena.substring(0, (cadena.length()-2));
		
		return cadena;
	}


	public Miembro crear(Vector<String> vector) throws Exception {	
		Miembro member= new Miembro(vector.get(1), vector.get(2), vector.get(3),
				vector.get(4), vector.get(5), vector.get(6),
				vector.get(7), Integer.parseInt(vector.get(8)),
				vector.get(9), Integer.parseInt(vector.get(10)),
				vector.get(11), Integer.parseInt(vector.get(12)),
				vector.get(13),vector.get(14), vector.get(15),
				vector.get(16), vector.get(17)); 
		return member;
	}


	private void listar() throws SQLException, Exception {		 
		LinkedList<Vector<String>> resultados=null;
		lista_miembros= new LinkedList<Miembro>();
		Miembro aux= null;
		Vector<String> vec_aux=null;
		int inicio=(getPagina_actual()-1)*getTamanio_pagina();
		
		String query ="SELECT * FROM `"+T_ASOCIACION+"` LIMIT "+ inicio +", "+ getTamanio_pagina();
		 resultados=agente.select(query);

		 for(int i=0; i<resultados.size();i++){
			 vec_aux=(Vector<String>) resultados.get(i);
			 aux=recuperar(vec_aux);
			 lista_miembros.add(aux);
		 }
	}
	
	public Miembro getMiembro(String dni) throws SQLException, Exception {
		return recuperarMiembro(dni);
	}
	
	public Miembro getMiembro(int index) {
		return lista_miembros.get(index);
	}

	public int numMiembrosLista() throws SQLException, Exception {
		return lista_miembros.size();
	}
	

	public int numMiembros() throws SQLException, Exception {
		int num=0;
		String query ="SELECT COUNT(`nombre`) AS CUENTA FROM `"+T_ASOCIACION+"`";
		num=agente.operation(query);
		
		return num;
	}
	
	private Miembro recuperarMiembro(String dni) throws SQLException, Exception {		 
		LinkedList<Vector<String>> resultado=null;

		String query ="SELECT * FROM `"+T_ASOCIACION
				+ "` WHERE `dni`= '"+dni+"'";
		
		resultado=agente.select(query);
		
		return recuperar(resultado.getFirst());
	}
	
	private Miembro recuperar(Vector<String> vector) throws SQLException, Exception {
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

	public int paginar() throws SQLException, Exception {
		double n= numMiembros();
		double paginas= n/getTamanio_pagina();
		if(Math.floor(paginas)<paginas)paginas++;
		return (int) paginas;
	}

	public boolean accederPagina(int pagina) throws SQLException, Exception {
		setPagina_actual(pagina);
		setTotal_paginas(paginar());
		listar();
		return true;
	}
	
	
}
