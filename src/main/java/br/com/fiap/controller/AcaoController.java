package br.com.fiap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.model.Acao;
import br.com.fiap.repository.AcaoRepository;

@RestController
@RequestMapping(value="/api")
public class AcaoController {

	@Autowired
	AcaoRepository acaoRepository;
	
	
	//LISTA DE ACOES
	@GetMapping("/acoes")
	public List<Acao> listaAcoes(){
		return acaoRepository.findAll();
	}
	
	
	//busca por ID
	@GetMapping("/acao/{id}")
	public Acao buscarAcao(@PathVariable(value="id") long id){
		return acaoRepository.findById(id);
	} 
	
	//Create
	@PostMapping("/acao")
	public Acao salvaAcoes(@RequestBody Acao acao) {
		return acaoRepository.save(acao);
	}
	
	
}
