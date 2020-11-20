package br.com.fiap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.model.Acao;

public interface AcaoRepository extends JpaRepository<Acao , Long> {

	Acao findById(long id);
}
