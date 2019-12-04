package controller;

import java.util.List;

import dao.DAO;
import dao.PacienteDao;
import model.Paciente;

public class SistemaPaciente {
	private static PacienteDao dao = new PacienteDao();

	public void cadastraPaciente(Paciente paciente) {
		DAO.open();
		DAO.begin();
		dao.persist(paciente);
		DAO.commit();
		DAO.close();

	}

	public void editaPaciente(Paciente paciente) {
		DAO.open();
		DAO.begin();
		dao.merge(paciente);
		DAO.commit();
		DAO.close();

	}

	public void atualizaPaciente(Paciente paciente) {
		DAO.open();
		DAO.begin();
		dao.refresh(paciente);
		DAO.commit();
		DAO.close();

	}

	public Paciente getPacienteById(Integer chave) {
		DAO.open();
		DAO.begin();
		Paciente paciente = dao.find(chave);
		DAO.commit();
		DAO.close();
		return paciente;
	}

	public List<Paciente> getPacienteByNome(String chave) {
		DAO.open();
		DAO.begin();
		List<Paciente> paciente = dao.findByNome(chave);
		DAO.commit();
		DAO.close();
		return paciente;
	}

	public List<Paciente> getAllPaciente() {
		DAO.open();
		DAO.begin();
		List<Paciente> paciente = dao.findAll();
		DAO.commit();
		DAO.close();
		return paciente;
	}
}
