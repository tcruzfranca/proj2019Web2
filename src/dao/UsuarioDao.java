package dao;

import java.util.List;

import javax.persistence.Query;

import model.Usuario;

public class UsuarioDao extends DAO<Usuario> {
	@SuppressWarnings("unchecked")
	public List<Usuario> findByNome(String nome) {
		Query q = getManager().createQuery("select u from Usuario u where u.nome = :nome");
		q.setParameter("nome", nome);
		return q.getResultList();
	}
}
