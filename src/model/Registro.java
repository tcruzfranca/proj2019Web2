package model;

import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Registro")
public class Registro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	@OneToMany
	
	private Dentista dentista;
	
	@Column
	@OneToMany
	private Paciente paciente;
	
	@Column
	private String procedimento;
	
	@Column
	private String comentario;
	
	@Column
	private GregorianCalendar dataAtendimento;
	
	@Column
	private boolean antesDepoisAtendimento;
	
	@Column
	private long tempoEspera;
	
	@Column
	@ManyToMany
	private Resposta respostas;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Dentista getDentista() {
		return dentista;
	}

	public void setDentista(Dentista dentista) {
		this.dentista = dentista;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public GregorianCalendar getDataAtendimento() {
		return dataAtendimento;
	}

	public void setDataAtendimento(GregorianCalendar dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}

	public boolean isAntesDepoisAtendimento() {
		return antesDepoisAtendimento;
	}

	public void setAntesDepoisAtendimento(boolean antesDepoisAtendimento) {
		this.antesDepoisAtendimento = antesDepoisAtendimento;
	}

	public long getTempoEspera() {
		return tempoEspera;
	}

	public void setTempoEspera(long tempoEspera) {
		this.tempoEspera = tempoEspera;
	}

	public Resposta getRespostas() {
		return respostas;
	}

	public void setRespostas(Resposta respostas) {
		this.respostas = respostas;
	}
	
	

}
