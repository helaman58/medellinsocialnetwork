package co.afdm.msn.modelo;

public class Multimedia {
	
	//Atributos
	//Locación o URL del archivo multimedia
	private String ubicacion;
	//Estado del recurso o archivo multimedia
	private String estado;
	//Usuario asociado al recurso multimedia
	private Usuario usuario;
	//Fecha de creación
	private java.util.Date fechaCreacion;
	//Fecha de actualización
	private java.util.Date fechaActualizacion;
	
	//Adicionar atributo del tamaño del contenido Multimedia
	protected Integer tamanio;
	//Adicionar atributo de la longitud
	protected Integer longitud;
	
	
	
	//Getters y Setters
	public String getUbicacion() {
		return ubicacion;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public java.util.Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(java.util.Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public java.util.Date getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(java.util.Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public Integer getTamanio() {
		return tamanio;
	}

	public void setTamanio(Integer tamanio) {
		this.tamanio = tamanio;
	}

	public Integer getLongitud() {
		return longitud;
	}

	public void setLongitud(Integer longitud) {
		this.longitud = longitud;
	}
	
	


}
