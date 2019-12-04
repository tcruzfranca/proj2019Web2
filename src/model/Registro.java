package model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Registro {

	public Registro() {
	}

	@Id
	@GeneratedValue
	private Integer id;

	@ManyToOne
	private Usuario dentista;

	@ManyToOne
	private Usuario paciente;

	private String procedimento;

	private String comentario;

	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataAtendimento;

	private String momentoAtendimento;

	public String getMomentoAtendimento() {
		return this.momentoAtendimento;
	}

	public void setMomentoAtendimento(String d) {
		this.momentoAtendimento = EnumMomentoRegistro.valueOf(d).getMomento();
	}

	private boolean[] respostas;

	public boolean[] getRespostas() {
		return respostas;
	}

	public void setRespostas(boolean[] respostas) {
		this.respostas = respostas.clone();
	}

	private Long tempoEspera;

	public Usuario getDentista() {
		return dentista;
	}

	public void setDentista(Dentista dentista) {
		this.dentista = dentista;
	}

	public Usuario getPaciente() {
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

	public Calendar getDataAtendimento() {
		return dataAtendimento;
	}

	public void setDataAtendimento(Calendar dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}

	public Long getTempoEspera() {
		return tempoEspera;
	}

	public void setTempoEspera(Long tempoEspera) {
		this.tempoEspera = tempoEspera;
	}

	public Integer getId() {
		return id;
	}

}