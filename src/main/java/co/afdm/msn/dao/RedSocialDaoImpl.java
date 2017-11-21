package co.afdm.msn.dao;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import co.afdm.msn.modelo.Comentario;
import co.afdm.msn.modelo.Publicacion;
import co.afdm.msn.modelo.Usuario;

@Component
public class RedSocialDaoImpl implements RedSocialDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	//Rutina para consultar todas las publicaciones
	@Override
	public java.util.List<Publicacion> getPublicaciones(){
		java.util.List<Map<String, Object>> retObj = jdbcTemplate.queryForList("SELECT titulo,texto,usuario FROM publicacion");
		return transformPublicaciones(retObj);
		
	}
	
	protected java.util.List<Publicacion> transformPublicaciones(java.util.List<Map<String, Object>> publicaciones){
		java.util.Iterator<Map<String, Object>> it = publicaciones.iterator();
		java.util.List<Publicacion> retObj = new ArrayList<>();
		Map<String, Object> aux;
		Publicacion publicacion;
		Usuario usuario;
		while(it.hasNext()){
			publicacion = new Publicacion();
			usuario = new Usuario();
			aux = it.next();
			
			//Mapeamos a un objeto de tipo Publicacion
			publicacion.setTitulo(aux.get("titulo").toString());
			publicacion.setTexto(aux.get("texto").toString());
			usuario.setNombre(aux.get("usuario").toString());
			publicacion.setUsuario(usuario);
			publicacion.setFecha(new java.util.Date());
			
			retObj.add(publicacion);
		}
		return retObj;
	}
	
	//Rutina para consultar todos los comentarios
	@Override
	public java.util.List<Comentario> getComentarios(){
		java.util.List<Map<String, Object>> retObj = jdbcTemplate.queryForList("SELECT texto,usuario,pubid FROM comentario");
		return transformComentarios(retObj);
		
	}
	
	protected java.util.List<Comentario> transformComentarios(java.util.List<Map<String, Object>> comentarios){
		java.util.Iterator<Map<String, Object>> it = comentarios.iterator();
		java.util.List<Comentario> retObj = new ArrayList<>();
		Map<String, Object> aux;
		Comentario comentario;
		Usuario usuario;
		while(it.hasNext()){
			comentario = new Comentario();
			usuario = new Usuario();
			aux = it.next();
			
			//Mapeamos a un objeto de tipo Publicacion
			comentario.setTexto(aux.get("texto").toString());
			usuario.setNombre(aux.get("usuario").toString());
			comentario.setUsuario(usuario);
			comentario.setFechaCreacion(new java.util.Date());
			
			retObj.add(comentario);
		}
		return retObj;
	}

}
