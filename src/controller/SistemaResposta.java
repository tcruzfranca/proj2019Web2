package controller;

import java.util.List;

import dao.DAO;
import dao.RespostaDao;
import model.Resposta;

public class SistemaResposta {
	private RespostaDao dao = new RespostaDao();

	public void cadastraResposta(Resposta resposta) {
		DAO.open();
		DAO.begin();
		dao.persist(resposta);
		DAO.commit();
		DAO.close();

	}

	public void editaResposta(Resposta resposta) {
		DAO.open();
		DAO.begin();
		dao.merge(resposta);
		DAO.commit();
		DAO.close();

	}

	public void atualizaResposta(Resposta resposta) {
		DAO.open();
		DAO.begin();
		dao.refresh(resposta);
		DAO.commit();
		DAO.close();

	}

	public Resposta getRespostaById(Integer chave) {
		DAO.open();
		DAO.begin();
		Resposta Resposta = dao.find(chave);
		DAO.commit();
		DAO.close();
		return Resposta;
	}

	public List<Resposta> getAllResposta() {
		DAO.open();
		DAO.begin();
		List<Resposta> resposta = dao.findAll();
		DAO.commit();
		DAO.close();
		return resposta;
	}
}
