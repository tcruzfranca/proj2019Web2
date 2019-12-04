package model;

import javax.persistence.Entity;

@Entity
public class Dentista extends Usuario {

	public Dentista(String nome) {
		super(nome);
	}

	public Dentista() {
		super();
	}

	private String specializacao;

	private String cro;

	public String getSpecializacao() {
		return specializacao;
	}

	public void setSpecializacao(String specializacao) {
		this.specializacao = specializacao;
	}

	public String getCro() {
		return cro;
	}

	public void setCro(String cro) {
		this.cro = cro;
	}

}