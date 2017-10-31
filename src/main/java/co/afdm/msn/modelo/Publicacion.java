package co.afdm.msn.modelo;

public class Publicacion {
	
	//Atributos
	//Adicionamos atributo título de la publicación
	private String titulo;
	//Creamos atributo texto de la publicación
	private String texto;
	//Creamos atributo fecha de la publicación
	private java.util.Date fecha;
	//Conjunto de multimedia
	private java.util.List<Multimedia> multimediaList;
	//Usuario asociado a la publicación
	private Usuario usuario;
	
	
	//Getters y Setters
	public java.util.Date getFecha() {
		return fecha;
	}

	public void setFecha(java.util.Date fecha) {
		this.fecha = fecha;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public java.util.List<Multimedia> getMultimediaList() {
		return multimediaList;
	}

	public void setMultimediaList(java.util.List<Multimedia> multimediaList) {
		this.multimediaList = multimediaList;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	

}
