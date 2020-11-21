package br.com.fiap.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "execucao", schema = "bd_robo")
public class ExecucaoModel implements Serializable {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;	
	
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = AcaoModel.class)
	@JoinColumn(name = "id_acao")
	private long id_acao ; 
	
	@Column
	private LocalDateTime dataExecucao;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId_acao() {
		return id_acao;
	}

	public void setId_acao(long id_acao) {
		this.id_acao = id_acao;
	}

	public LocalDateTime getDataExecucao() {
		return dataExecucao;
	}

	public void setDataExecucao(LocalDateTime dataExecucao) {
		this.dataExecucao = dataExecucao;
	}

	public ExecucaoModel(long id, long id_acao, LocalDateTime dataExecucao) {
		super();
		this.id = id;
		this.id_acao = id_acao;
		this.dataExecucao = dataExecucao;
	}
	
	public ExecucaoModel(long id, long id_acao) {
		super();
		this.id = id;
		this.id_acao = id_acao;
	}
	

	@Override
	public String toString() {
		return "Execucao [id=" + id + ", id_acao=" + id_acao + ", dataExecucao=" + dataExecucao + "]";
	}

	private static final long serialVersionUID = 1L;
	
	
}
