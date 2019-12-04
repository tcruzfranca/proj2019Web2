package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Avatar {

	public Avatar() {
	}

	@Id
	@GeneratedValue
	private Integer id;

	public Integer getId() {
		return id;
	}

	@ManyToMany(targetEntity = Item.class)
	@JoinTable(name = "avatar_item", joinColumns = @JoinColumn(name = "ID_AVATAR"), inverseJoinColumns = @JoinColumn(name = "ID_ITEM"))
	private List<Item> itens;

	@OneToOne(mappedBy = "avatar", cascade = CascadeType.ALL)
	private Paciente paciente;

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(Item item) {
		this.itens.add(item);
	}

}