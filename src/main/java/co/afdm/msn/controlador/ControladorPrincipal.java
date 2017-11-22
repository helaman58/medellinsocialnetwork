package co.afdm.msn.controlador;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.afdm.msn.modelo.Comentario;
import co.afdm.msn.modelo.NuevoComentarioInput;
import co.afdm.msn.modelo.Publicacion;
import co.afdm.msn.modelo.Usuario;
import co.afdm.msn.servicio.RedSocialServiceImpl;

@RestController
public class ControladorPrincipal {
	
	@Autowired
	RedSocialServiceImpl redSocialService;
	
	@RequestMapping(value = "/publicacion", method = RequestMethod.POST)
	public boolean publicar(Publicacion publicacion){
		return this.redSocialService.agregarPublicaciono();
	}
	
	@RequestMapping(value = "/publicacion", method = RequestMethod.GET)
	public ResponseEntity<?> publicacionesUsuario(){
		java.util.Map<String, Object> retMap = new java.util.HashMap<>();
		retMap.put("publicaciones", this.redSocialService.listarPublicaciones("UnUsuario"));
		return ResponseEntity.ok(retMap);
	}
	
	@RequestMapping(value = "/comentario", method = RequestMethod.GET)
	public ResponseEntity<?> comentariosUsuario(){
		java.util.Map<String, Object> retMap = new java.util.HashMap<>();
		retMap.put("comentarios", this.redSocialService.listarComentarios("UnUsuario"));
		return ResponseEntity.ok(retMap);
	}
	
	@RequestMapping(value = "/comentario", method = RequestMethod.POST)
	public boolean nuevoComentario(@RequestBody NuevoComentarioInput nci ){
		System.out.println(nci.getTexto());
		java.util.Map<String, Object> retMap = new java.util.HashMap<>();
		boolean result = this.redSocialService.agregarComentario(nci.getTexto());
		return result;
	}
	
	@RequestMapping("/")
	public String home(){
		return "Hello World!";
	}

}
