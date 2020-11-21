package br.com.fiap.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import net.bytebuddy.implementation.bind.annotation.Default;

@Entity
@Table(name="acao", schema = "bd_robo")
public class AcaoModel implements Serializable{
	
		@Override
		public String toString() {
			return "Acao [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", ativo=" + ativo + "]";
		}

		private static final long serialVersionUID = 1L;
		
		@Id 
		@Column(name = "id")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long id;
		
		@Column(name = "nome", nullable = false)
		private String nome ;
		
		@Column(name = "descricao", nullable = false)
		private String descricao;
		
		@Column(name = "ativo" , nullable = false )
		private boolean ativo;
		
		
		public AcaoModel(String nome, String descricao, boolean ativo) {
			super();
			this.nome = nome;
			this.descricao = descricao;
			this.ativo = ativo;
		}

		public AcaoModel(String nome, String descricao) {
			super();
			this.nome = nome;
			this.descricao = descricao;
		}
		
		public AcaoModel() {
			super();
			// TODO Auto-generated constructor stub
		}


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
