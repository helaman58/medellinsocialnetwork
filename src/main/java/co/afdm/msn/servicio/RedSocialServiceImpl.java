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
	public boolean agregarComentario(String texto){
		return this.redSocialDaoImpl.insComentario(texto);
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
		return this.redSocialDaoImpl.getPublicaciones();		
	}
	
	@Override
	public List<Comentario> listarComentarios(String usuario){
		return this.redSocialDaoImpl.getComentarios();
	}

	@Override
	public boolean agregarComentario() {
		// TODO Auto-generated method stub
		return false;
	}
}
