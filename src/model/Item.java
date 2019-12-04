package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Item {

	public Item() {
	}

	@Id
	@GeneratedValue
	private Integer id;

	private String codigo;

	private String tipo;

	@ManyToMany(targetEntity = Opcao.class)
	@JoinTable(name = "item_opcao", joinColumns = @JoinColumn(name = "ID_ITEM"), inverseJoinColumns = @JoinColumn(name = "ID_OPCAO"))
	private List<Opcao> opcoes;

	@ManyToMany(mappedBy = "itens", targetEntity = Avatar.class)
	private List<Avatar> avatares;

	public Integer getId() {
		return id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Opcao> getOpcoes() {
		return opcoes;
	}

	public void setOpcoes(List<Opcao> opcoes) {
		this.opcoes = opcoes;
	}

	public List<Avatar> getAvatares() {
		return avatares;
	}

	public void setAvatares(List<Avatar> avatares) {
		this.avatares = avatares;
	}

}