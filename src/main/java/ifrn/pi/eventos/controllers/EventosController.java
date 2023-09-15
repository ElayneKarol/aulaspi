package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventosController {
	
	@RequestMapping("/eventos/form")
	public String form() {
		System.out.println("Chamou o método form");
		return "formEvento";
	}
	
	@RequestMapping("/eventos/form/salvar")
	public String Salvar( String nome, String local, String data, String horario) {
		System.out.println("Nome: " + nome);
		System.out.println("Local: " + local);
		System.out.println("Data: " + data);
		System.out.println("Horário: " + horario);
		return "formEvento";
	}

}