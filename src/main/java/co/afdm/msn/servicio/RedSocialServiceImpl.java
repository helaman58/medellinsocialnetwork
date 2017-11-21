package co.afdm.msn.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.afdm.msn.dao.RedSocialDao;
import co.afdm.msn.modelo.Comentario;
import co.afdm.msn.modelo.Publicacion;

@Component
public class RedSocialServiceImpl implements RedSocialService {
	
	@Autowired
	RedSocialDao redSocialDaoImpl;

	@Override
	public boolean agregarComentario(){
		return true;
	}
	
	@Override
	public boolean responderComentario(){
		return true;
	}
	
	@Override
	public boolean agregarPublicaciono(){
		return true;
	}
	
	@Override
	public boolean responderPublicacion(){
		return true;
	}
	
	@Override
	public java.util.List<Publicacion> listarPublicaciones(String usuario){
		/*
		java.util.List<Publicacion> returnList = new ArrayList<>();
		Publicacion publicacion = new Publicacion();
		publicacion.setTitulo("Fractal");
		publicacion.setFecha(new java.util.Date());
		publicacion.setTexto("Just a simple, single page responsive template brought to you by");
		returnList.add(publicacion);
		publicacion = new Publicacion();
		publicacion.setTitulo("Fractal 2");
		publicacion.setFecha(new java.util.Date());
		publicacion.setTexto("2 Just a simple, single page responsive template brought to you by");
		returnList.add(publicacion);
		return returnList;
		*/
		
		return this.redSocialDaoImpl.getPublicaciones();
		
		
	}
	
	@Override
	public List<Comentario> listarComentarios(String usuario){
		/*
		java.util.List<Publicacion> returnList = new ArrayList<>();
		Publicacion publicacion = new Publicacion();
		publicacion.setTitulo("Fractal");
		publicacion.setFecha(new java.util.Date());
		publicacion.setTexto("Just a simple, single page responsive template brought to you by");
		returnList.add(publicacion);
		publicacion = new Publicacion();
		publicacion.setTitulo("Fractal 2");
		publicacion.setFecha(new java.util.Date());
		publicacion.setTexto("2 Just a simple, single page responsive template brought to you by");
		returnList.add(publicacion);
		
		return returnList;
		*/
		return this.redSocialDaoImpl.getComentarios();
	}
}
