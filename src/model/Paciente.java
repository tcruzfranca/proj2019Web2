package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Paciente extends Usuario {

	public Paciente(String nome) {
		super(nome);
	}

	public Paciente() {
		super();
	}

	private String nomeResp;

	private String cpfResp;

	private String tellContato;

	private String pcd;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "avatar_id")
	private Avatar avatar;

	public String getNomeResp() {
		return nomeResp;
	}

	public void setNomeResp(String nomeResp) {
		this.nomeResp = nomeResp;
	}

	public String getCpfResp() {
		return cpfResp;
	}

	public void setCpfResp(String cpfResp) {
		this.cpfResp = cpfResp;
	}

	public String getTellContato() {
		return tellContato;
	}

	public void setTellContato(String tellContato) {
		this.tellContato = tellContato;
	}

	public String getPcd() {
		return pcd;
	}

	public void setPcd(String pcd) {
		this.pcd = pcd;
	}

	public Avatar getAvatar() {
		return avatar;
	}

	public void setAvatar(Avatar avatar) {
		this.avatar = avatar;
	}
}