package br.com.fiap.controller;

import java.net.URI;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.fiap.business.AcaoBusiness;
import br.com.fiap.model.AcaoModel;

@RestController
@RequestMapping("/acao")
public class AcaoController {

	@Autowired
	AcaoBusiness acaoBusiness;
		
	// Busca
		@GetMapping("/lista")
		public ResponseEntity<List<AcaoModel>> findAll() {	
			
			List<AcaoModel> categorias = acaoBusiness.findAll();	
			return ResponseEntity.ok(categorias);
	}
	
		@GetMapping("/buscar/{id}")
		public ResponseEntity<AcaoModel> findById(@PathVariable("id") long id) {

			AcaoModel acaoModel = acaoBusiness.findById(id);	
			return ResponseEntity.ok(acaoModel);
		}
			
		
		// Cadastro
		@SuppressWarnings("rawtypes")
		@PostMapping("/criar")
		public ResponseEntity save(@RequestBody @Valid AcaoModel acaoModel) {
			
			acaoBusiness.save(acaoModel);
			
			URI location = ServletUriComponentsBuilder
	                .fromCurrentRequest().path("/{id}")
	                .buildAndExpand(acaoModel.getId()).toUri();
			
			return ResponseEntity.created(location).build();
			
		}
		
		// Edicao
		@PutMapping("editar/{id}")
		public ResponseEntity update(@PathVariable("id") long id, @RequestBody @Valid AcaoModel acaoModel) {
			acaoBusiness.findById(id);
			
			acaoModel.setId(id);
			acaoBusiness.save(acaoModel);
		
			return ResponseEntity.ok().build();	
		}

		// Dele��o	
		@DeleteMapping("delete/{id}")
		public ResponseEntity deleteById(@PathVariable("id") long id) {
			
			acaoBusiness.deleteById(id);
			return ResponseEntity.noContent().build();
		}
	
	
}
