package controller;

import java.util.List;

import model.Avatar;
import model.Dentista;
import model.Item;
import model.Opcao;
import model.Paciente;
import model.Registro;

public class Sistema implements SistemaInterface {

	private static SistemaRegistro sr = new SistemaRegistro();
	private static SistemaAvatar sa = new SistemaAvatar();
	private static SistemaPaciente sp = new SistemaPaciente();
	private static SistemaDentista sd = new SistemaDentista();
	private static SistemaItem si = new SistemaItem();
	private static SistemaOpcao so = new SistemaOpcao();

	@Override
	public Paciente cadastrarPaciente(String nome) { // cadastra um novo paciente no banco
		Paciente paciente = new Paciente(nome);

		sp.cadastraPaciente(paciente);
		return paciente;
	}

	public Dentista cadastrarDentista(String nome) { // cadastra um novo paciente no banco
		Dentista dentista = new Dentista(nome);

		sd.cadastraDentista(dentista);
		return dentista;
	}

	public void cadastrarAvatarPaciente(Paciente paciente, Avatar avatar) { // associa um avatar a um paciente
		paciente.setAvatar(avatar); // coloca o avatar dentro do objeto paciente
		sp.editaPaciente(paciente); // adiciona o novo objeto paciente ja com o novo avatar no banco
	}

	public void cadastrarItemAvatar(Avatar avatar, Item item) {
		avatar.setItens(item);
		sa.cadastraAvatar(avatar);
	}

	@Override
	public void cadastrarItem(String codigo, String tipo, List<Opcao> opcoes) {
		Item item = new Item();

		item.setCodigo(codigo);
		item.setTipo(tipo);
		item.setOpcoes(opcoes);

		si.cadastraItem(item);
	}

	@Override
	public Opcao cadastrarOpcao(int nota, String d) {
		Opcao opcao = new Opcao();

		opcao.setNota(nota);
		opcao.setDescricao(d);
		so.cadastraOpcao(opcao);
		return opcao;
	}

	@Override
	public Registro cadastrarRegistro(String momentoAtendimento, String comentario, Dentista dentista,
			Paciente paciente, String procedimento, Long tempoEspera) {
		Registro registro = new Registro();

		registro.setMomentoAtendimento(momentoAtendimento);
		registro.setComentario(comentario);
		registro.setDentista(dentista);
		registro.setPaciente(paciente);
		registro.setProcedimento(procedimento);
		registro.setTempoEspera(tempoEspera);

		sr.cadastraRegistro(registro);
		return registro;
	}

	@Override
	public void cadastrarRespostasRegistro(boolean[] respostas, Registro registro) {
		registro.setRespostas(respostas);
		sr.editaRegistro(registro);
	}

}
