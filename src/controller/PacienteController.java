package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.PacienteDAO;
import model.Paciente;

public class PacienteController{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("web2");
	EntityManager em = emf.createEntityManager();
	PacienteDAO pDAO = new PacienteDAO(em, emf);

	public void salvarPaciente(Paciente paciente) {
	   pDAO.persist(paciente);
	}
	
	public void deletePaciente(Paciente paciente) {
		pDAO.remove(paciente);
	}
	public Paciente findOnePaciente(String text) {
		 Paciente p = pDAO.findOne(text);
		 return p;
	}
	
	public List<Paciente> findManyPaciente(String text) {
		List<Paciente> lista = pDAO.findMany(text);
		return lista;
	}
	
	
	
	
}
