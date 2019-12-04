package controller;

import java.util.Calendar;
import java.util.List;

import dao.DAO;
import dao.RegistroDao;
import model.Dentista;
import model.Paciente;
import model.Registro;

public class SistemaRegistro {
	private RegistroDao dao = new RegistroDao();

	public void cadastraRegistro(Registro registro) {
		DAO.open();
		DAO.begin();
		dao.persist(registro);
		DAO.commit();
		DAO.close();

	}

	public void editaRegistro(Registro registro) {
		DAO.open();
		DAO.begin();
		dao.merge(registro);
		DAO.commit();
		DAO.close();

	}

	public void atualizaRegistro(Registro registro) {
		DAO.open();
		DAO.begin();
		dao.refresh(registro);
		DAO.commit();
		DAO.close();

	}

	public Registro getRegistroByDentista(Dentista chave) {
		DAO.open();
		DAO.begin();
		Registro Registro = dao.find(chave);
		DAO.commit();
		DAO.close();
		return Registro;
	}

	public List<Registro> getRegistroByPaciente(Paciente chave) {
		DAO.open();
		DAO.begin();
		List<Registro> registros = dao.findByPaciente(chave);
		DAO.commit();
		DAO.close();
		return registros;
	}

	public Registro getRegistroByData(Calendar chave) {
		DAO.open();
		DAO.begin();
		Registro Registro = dao.find(chave);
		DAO.commit();
		DAO.close();
		return Registro;
	}

	public List<Registro> getAllRegistro() {
		DAO.open();
		DAO.begin();
		List<Registro> registro = dao.findAll();
		DAO.commit();
		DAO.close();
		return registro;
	}
}
