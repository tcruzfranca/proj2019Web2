package controller;

import java.util.List;

import dao.DAO;
import dao.UsuarioDao;
import model.Usuario;

public class SistemaUsuario {
	private UsuarioDao dao = new UsuarioDao();

	public void cadastraUsuario(Usuario usuario) {
		DAO.open();
		DAO.begin();
		dao.persist(usuario);
		DAO.commit();
		DAO.close();

	}

	public void editaUsuario(Usuario usuario) {
		DAO.open();
		DAO.begin();
		dao.merge(usuario);
		DAO.commit();
		DAO.close();

	}

	public void atualizaUsuario(Usuario usuario) {
		DAO.open();
		DAO.begin();
		dao.refresh(usuario);
		DAO.commit();
		DAO.close();

	}

	public Usuario getUsuarioById(Integer chave) {
		DAO.open();
		DAO.begin();
		Usuario Usuario = dao.find(chave);
		DAO.commit();
		DAO.close();
		return Usuario;
	}

	public List<Usuario> getUsuarioByNome(String chave) {
		DAO.open();
		DAO.begin();
		List<Usuario> usuario = dao.findByNome(chave);
		DAO.commit();
		DAO.close();
		return usuario;
	}

	public List<Usuario> getAllUsuario() {
		DAO.open();
		DAO.begin();
		List<Usuario> usuario = dao.findAll();
		DAO.commit();
		DAO.close();
		return usuario;
	}
}
