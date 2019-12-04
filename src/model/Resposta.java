package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Resposta {

	public Resposta() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private boolean[] respostas;

	@ManyToMany(mappedBy = "respostas", targetEntity = Registro.class)
	private List<Registro> registros;

	public Integer getId() {
		return id;
	}

	public boolean[] getRespostas() {
		return respostas;
	}

	public void setRespostas(boolean[] respostas) {
		this.respostas = respostas.clone();
	}

}