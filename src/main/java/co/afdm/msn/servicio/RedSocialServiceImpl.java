package co.afdm.msn.servicio;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import co.afdm.msn.modelo.Publicacion;
import co.afdm.msn.modelo.Usuario;

@Component
public class RedSocialServiceImpl implements RedSocialService {

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
	}
	
	@Override
	public java.util.List<Publicacion> listarComentarios(String usuario){
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
	}
}
