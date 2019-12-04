package dao;

import java.util.List;

import javax.persistence.Query;

import model.Paciente;

public class PacienteDao extends DAO<Paciente> {
	@SuppressWarnings("unchecked")
	public List<Paciente> findByNome(String nome) {
		Query q = getManager().createQuery("select p from Paciente p where p.nome = :nome");
		q.setParameter("nome", nome);
		return q.getResultList();
	}
}
