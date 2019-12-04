package testes;

import controller.Sistema;
import controller.SistemaPaciente;
import controller.SistemaRegistro;
import model.Dentista;
import model.Paciente;
import model.Registro;

public class Teste {

	public static void main(String[] args) {

		Sistema s = new Sistema();
		SistemaPaciente p = new SistemaPaciente();
		SistemaRegistro r = new SistemaRegistro();
		Dentista dentista = s.cadastrarDentista("ubiratan");
		Paciente paciente = s.cadastrarPaciente("mariazinha");
		Registro registro = s.cadastrarRegistro("ANTES", "comentario inutil", dentista, paciente, "canal", (long) 30);
		boolean[] resposta = new boolean[8];
		resposta[0] = false;
		resposta[1] = false;
		resposta[2] = true;
		resposta[3] = false;
		resposta[4] = true;
		resposta[5] = true;
		resposta[6] = false;
		resposta[7] = false;

		s.cadastrarRespostasRegistro(resposta, registro);
		System.out.println(r.getRegistroByPaciente(p.getPacienteById(18)).get(0).getRespostas()[5]);

	}
}
