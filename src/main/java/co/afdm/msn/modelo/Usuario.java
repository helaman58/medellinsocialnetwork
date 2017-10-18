package co.afdm.msn.modelo;

public class Usuario {

	//Atributos
	//Información de inicio de sesión
	//Nombre de usuario
	private String nombre;
	//Contraseña
	private String contrasenia;
	
	//Fecha de creación del usuario
	private java.util.Date fechaCreacion;
	//Fecha de última modificación
	private java.util.Date fechaModificación;
	//Última conexión
	private java.util.Date ultimaConexion;
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public java.util.Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(java.util.Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public java.util.Date getFechaModificación() {
		return fechaModificación;
	}
	public void setFechaModificación(java.util.Date fechaModificación) {
		this.fechaModificación = fechaModificación;
	}
	public java.util.Date getUltimaConexion() {
		return ultimaConexion;
	}
	public void setUltimaConexion(java.util.Date ultimaConexion) {
		this.ultimaConexion = ultimaConexion;
	}
	
	
}
