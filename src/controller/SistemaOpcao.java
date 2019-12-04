package controller;

import java.util.List;

import dao.DAO;
import dao.OpcaoDao;
import model.Opcao;

public class SistemaOpcao {
	private OpcaoDao dao = new OpcaoDao();

	public void cadastraOpcao(Opcao opcao) {
		DAO.open();
		DAO.begin();
		dao.persist(opcao);
		DAO.commit();
		DAO.close();

	}

	public void editaOpcao(Opcao opcao) {
		DAO.open();
		DAO.begin();
		dao.merge(opcao);
		DAO.commit();
		DAO.close();

	}

	public void atualizaOpcao(Opcao opcao) {
		DAO.open();
		DAO.begin();
		dao.refresh(opcao);
		DAO.commit();
		DAO.close();

	}

	public Opcao getOpcaoById(Integer chave) {
		DAO.open();
		DAO.begin();
		Opcao Opcao = dao.find(chave);
		DAO.commit();
		DAO.close();
		return Opcao;
	}

	public List<Opcao> getAllOpcao() {
		DAO.open();
		DAO.begin();
		List<Opcao> opcao = dao.findAll();
		DAO.commit();
		DAO.close();
		return opcao;
	}
}
