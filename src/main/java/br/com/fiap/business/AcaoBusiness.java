package br.com.fiap.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fiap.model.AcaoModel;
import br.com.fiap.repository.AcaoRepository;
@Component
public class AcaoBusiness {

	
	@Autowired
	public AcaoRepository acaoRepository;

	public List<AcaoModel> findAll() {
		return acaoRepository.findAll();
	}
	
	public AcaoModel findById(long id) {
		return acaoRepository.findById(id).get();
	}
	
	public void save(AcaoModel acaoModel) {
		acaoRepository.save(acaoModel);
	}

	public void deleteById(long id) {
		acaoRepository.deleteById(id);
	}
}
