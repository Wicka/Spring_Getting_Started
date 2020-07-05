package ejercicio.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerFormulario {
	
	//LLAMARA AL FORMULARIO DE VISTA UN FICHERO *.JSP
	
	@RequestMapping("/showFormulario")
	
	public String showFormulario() {
		
		return "formEntrada";
		
	}
	
	
	//METODO QUE PROCESARA LOS DATOS QUE ENVIE EL FORMULARIO DE ARRIBA formularioentrada
	
	@RequestMapping("/respuestaFormulario")
	
	public String respuestaFormulario() {
		
		return "formRespuesta";
	}

}
