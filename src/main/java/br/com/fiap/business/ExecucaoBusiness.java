package br.com.fiap.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.fiap.model.ExecucaoModel;
import br.com.fiap.repository.ExecucaoRepository;

public class ExecucaoBusiness {
	
	@Autowired
	public ExecucaoRepository execucaoRepository;

	public List<ExecucaoModel> findAll() {
		return execucaoRepository.findAll();
	}
	
	public ExecucaoModel findById(long id) {
		return execucaoRepository.findById(id).get();
	}
	
	public void save(ExecucaoModel execucaoModel) {
		execucaoRepository.save(execucaoModel);
	}

	public void deleteById(long id) {
		execucaoRepository.deleteById(id);
	}
}
