package foro.alura.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import foro.alura.api.topico.DatosRegistroTopico;
import foro.alura.api.topico.Topico;
import foro.alura.api.topico.TopicoRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/topicos")
public class TopicoController {
	
	@Autowired
	private TopicoRepository topicoRepository;
	
	
	@PostMapping
	public void registraTopic(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico) {
		
		topicoRepository.save(new Topico(datosRegistroTopico));

	}
	
	@GetMapping
	public List<Topico> listadoTopicos(){
		
		return topicoRepository.findAll();
		
				
	}

}



