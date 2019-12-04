package dao;

import java.util.List;

import javax.persistence.Query;

import model.Paciente;
import model.Registro;

public class RegistroDao extends DAO<Registro> {

	@SuppressWarnings("unchecked")
	public List<Registro> findByPaciente(Paciente paciente) {
		Query q = getManager().createQuery("select r from Registro r where r.paciente.id = :p");
		q.setParameter("p", paciente.getId());
		return q.getResultList();
	}

}
