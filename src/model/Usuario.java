package model;

import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
    @MappedSuperclass
	public abstract class Usuario {
    	@Id
    	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
    	@Column
		private String nome;
    	@Column
		private String cpf;
    	@Column
		private GregorianCalendar dataNascimento;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public GregorianCalendar getDataNascimento() {
			return dataNascimento;
		}
		public void setDataNascimento(GregorianCalendar dataNascimento) {
			this.dataNascimento = dataNascimento;
		}

	}



