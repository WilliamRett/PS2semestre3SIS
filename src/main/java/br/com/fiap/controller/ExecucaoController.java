package br.com.fiap.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.fiap.business.ExecucaoBusiness;
import br.com.fiap.model.ExecucaoModel;

@RestController
@RequestMapping("/execucao")
public class ExecucaoController {
	
	@Autowired
	ExecucaoBusiness execucaoBuniness;
		
	// Busca
		@GetMapping("/lista")
		public ResponseEntity<List<ExecucaoModel>> findAll() {	
			
			List<ExecucaoModel> categorias = execucaoBuniness.findAll();	
			return ResponseEntity.ok(categorias);
	}
	
		@GetMapping("/buscar/{id}")
		public ResponseEntity<ExecucaoModel> findById(@PathVariable("id") long id) {

			ExecucaoModel execucaoModel = execucaoBuniness.findById(id);	
			return ResponseEntity.ok(execucaoModel);
		}
			
		
		// Cadastro
		@SuppressWarnings("rawtypes")
		@PostMapping("/criar")
		public ResponseEntity save(@RequestBody @Valid ExecucaoModel execucaoModel) {
			
			execucaoBuniness.save(execucaoModel);
			
			URI location = ServletUriComponentsBuilder
	                .fromCurrentRequest().path("/{id}")
	                .buildAndExpand(execucaoModel.getId()).toUri();
			
			return ResponseEntity.created(location).build();
			
		}
		
		// Edicao
		@PutMapping("editar/{id}")
		public ResponseEntity update(@PathVariable("id") long id, @RequestBody @Valid ExecucaoModel execucaoModel) {
			execucaoBuniness.findById(id);
			
			execucaoModel.setId(id);
			execucaoBuniness.save(execucaoModel);
		
			return ResponseEntity.ok().build();	
		}

		// Deleção	
		@DeleteMapping("delete/{id}")
		public ResponseEntity deleteById(@PathVariable("id") long id) {
			
			execucaoBuniness.deleteById(id);
			return ResponseEntity.noContent().build();
		}
	
	
}
