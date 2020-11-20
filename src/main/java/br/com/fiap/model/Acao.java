package br.com.fiap.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="acao", schema = "bd_robo")
public class Acao implements Serializable{
	
		@Override
		public String toString() {
			return "Acao [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", ativo=" + ativo + "]";
		}

		private static final long serialVersionUID = 1L;
		
		@Id 
		@GeneratedValue(strategy=GenerationType.AUTO)
		private long id;	
		
		@Column(length = 40)
		private String nome ;
		
		@Column(length = 100)
		private String descricao;
		
		private boolean ativo;
		

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public boolean isAtivo() {
			return ativo;
		}

		public void setAtivo(boolean ativo) {
			this.ativo = ativo;
		}
			
	
	
	
}
