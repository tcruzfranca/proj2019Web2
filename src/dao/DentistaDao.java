package dao;

import java.util.List;

import javax.persistence.Query;

import model.Dentista;

public class DentistaDao extends DAO<Dentista> {
	@SuppressWarnings("unchecked")
	public List<Dentista> findByNome(String nome) {
		Query q = getManager().createQuery("select p from Paciente p where p.nome = :nome");
		q.setParameter("nome", nome);
		return q.getResultList();
	}
}
