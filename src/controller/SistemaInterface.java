package controller;

import java.util.List;

import model.Dentista;
import model.Opcao;
import model.Paciente;
import model.Registro;

public interface SistemaInterface {
	public Paciente cadastrarPaciente(String nome);

	public void cadastrarItem(String codigo, String tipo, List<Opcao> opcoes);

	public Opcao cadastrarOpcao(int nota, String d);

	public Registro cadastrarRegistro(String momentoAtendimento, String comentario, Dentista dentista,
			Paciente paciente, String procedimento, Long tempoEspera); // colocar Date como parametro de entrada

	public void cadastrarRespostasRegistro(boolean[] respostas, Registro registro);

}
