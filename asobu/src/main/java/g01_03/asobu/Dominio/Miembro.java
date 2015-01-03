package Dominio;

public class Miembro implements Cloneable {
	
	protected String dni;
	protected String nombre;
	protected String apellidos1;
	protected String apellidos2;
	protected String fechaNacimiento;
	
	protected String tipoVia;
	protected String direccion;
	protected int nCalle;
	protected String escalera;
	protected int piso;
	protected String puerta;
	
	protected int codigoPostal;
	protected String provincia;
	protected String localidad;
	protected String telefono;
	protected String correoElectronico;
	
	protected String rol;

	public Miembro(String dni, String nombre, String apellidos1,
			String apellidos2, String fechaNacimiento, String tipoVia,
			String direccion, int nCalle, String escalera, int piso,
			String puerta, int codigoPostal, String provincia,
			String localidad, String telefono,
			String correoElectronico, String rol) {
		//super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos1 = apellidos1;
		this.apellidos2 = apellidos2;
		this.fechaNacimiento = fechaNacimiento;
		this.tipoVia = tipoVia;
		this.direccion = direccion;
		this.nCalle = nCalle;
		this.escalera = escalera;
		this.piso = piso;
		this.puerta = puerta;
		this.codigoPostal = codigoPostal;
		this.provincia = provincia;
		this.localidad = localidad;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;

		this.rol = rol;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos1() {
		return apellidos1;
	}

	public void setApellidos1(String apellidos1) {
		this.apellidos1 = apellidos1;
	}

	public String getApellidos2() {
		return apellidos2;
	}

	public void setApellidos2(String apellidos2) {
		this.apellidos2 = apellidos2;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getnCalle() {
		return nCalle;
	}

	public void setnCalle(int nCalle) {
		this.nCalle = nCalle;
	}

	public String getEscalera() {
		return escalera;
	}

	public void setEscalera(String escalera) {
		this.escalera = escalera;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public String getPuerta() {
		return puerta;
	}

	public void setPuerta(String puerta) {
		this.puerta = puerta;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		//Estan todos menos el ROL
		return "'"+dni + "', '" + nombre + "', '" + apellidos1 + "', '" + apellidos2
				+ "', '" + fechaNacimiento + "', '" + tipoVia + "', '" + direccion
				+ "', " + nCalle + ", '" + escalera + "', " + piso + ", '" + puerta
				+ "', " + codigoPostal + ", '" + provincia + "', '" + localidad
				+ "', '" + telefono + "', '" + correoElectronico+"'";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
}
