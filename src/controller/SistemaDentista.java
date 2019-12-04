package controller;

import java.util.List;

import dao.DAO;
import dao.DentistaDao;
import model.Dentista;

public class SistemaDentista {
	private static DentistaDao dao = new DentistaDao();

	public void cadastraDentista(Dentista dentista) {
		DAO.open();
		DAO.begin();
		dao.persist(dentista);
		DAO.commit();
		DAO.close();

	}

	public void editaDentista(Dentista dentista) {
		DAO.open();
		DAO.begin();
		dao.merge(dentista);
		DAO.commit();
		DAO.close();

	}

	public void atualizaDentista(Dentista dentista) {
		DAO.open();
		DAO.begin();
		dao.refresh(dentista);
		DAO.commit();
		DAO.close();

	}

	public Dentista getDentistaById(Integer chave) {
		DAO.open();
		DAO.begin();
		Dentista dentista = dao.find(chave);
		DAO.commit();
		DAO.close();
		return dentista;
	}

	public List<Dentista> getDentistaByNome(String chave) {
		DAO.open();
		DAO.begin();
		List<Dentista> dentista = dao.findByNome(chave);
		DAO.commit();
		DAO.close();
		return dentista;
	}

	public List<Dentista> getAllDentista() {
		DAO.open();
		DAO.begin();
		List<Dentista> dentista = dao.findAll();
		DAO.commit();
		DAO.close();
		return dentista;
	}
}
