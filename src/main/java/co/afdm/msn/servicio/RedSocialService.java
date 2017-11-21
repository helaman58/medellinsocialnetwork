package co.afdm.msn.servicio;

import java.util.List;

import co.afdm.msn.modelo.Comentario;
import co.afdm.msn.modelo.Publicacion;
import co.afdm.msn.modelo.Usuario;

public interface RedSocialService {

	boolean agregarComentario();

	boolean responderComentario();

	boolean agregarPublicaciono();

	boolean responderPublicacion();
	
	java.util.List<Publicacion> listarPublicaciones(String usuario);

	List<Comentario> listarComentarios(String usuario);

}
