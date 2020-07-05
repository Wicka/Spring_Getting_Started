package ejercicio.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//ESPECIFICO QUE ESTA CLASE ES MI CONTROLADOR
@Controller
public class ControllerWeb {
	
	//METODO QUE MAPEA CUAL ES LA VISTA
	@RequestMapping	
	public String inicioPagina() {
		
		return "paginaInicial";
	}

}
