package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Opcao {

	public Opcao() {
	}

	@Id
	@GeneratedValue
	private Integer id;

	public Integer getId() {
		return id;
	}

	private String descricao;

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String d) {
		this.descricao = EnumTipoOpcao.valueOf(d).getDescricao();
	}

	@ManyToMany(mappedBy = "opcoes", targetEntity = Item.class)
	private List<Item> itens;

	private Integer nota;

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

}