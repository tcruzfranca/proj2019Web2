package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.DentistaDAO;
import model.Dentista;


public class DentistaController {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("web2");
	EntityManager em = emf.createEntityManager();
	DentistaDAO dDAO = new DentistaDAO(em, emf);
	

	public void salvarDentista(Dentista dentista) {
	   dDAO.persist(dentista);
	}
	
	public void deletePaciente(Dentista dentista) {
		dDAO.remove(dentista);
	}
	public Dentista findOneDentista(String text) {
		 Dentista p = dDAO.findOne(text);
		 return p;
	}
	
	public List<Dentista> findManyDentista(String text) {
		List<Dentista> lista = dDAO.findMany(text);
		return lista;
	}
	
	

}
