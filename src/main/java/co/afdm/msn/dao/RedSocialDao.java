package co.afdm.msn.dao;

import java.util.List;

import co.afdm.msn.modelo.Comentario;
import co.afdm.msn.modelo.Publicacion;

public interface RedSocialDao {

	List<Publicacion> getPublicaciones();

	List<Comentario> getComentarios();

}
