package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.RegistroDAO;
import model.Dentista;
import model.Paciente;
import model.Registro;


public class RegistroController {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("web2");
	EntityManager em = emf.createEntityManager();
	RegistroDAO rDAO = new RegistroDAO(em, emf);
	
	public void salvarRegistro(Registro registro) {
		   rDAO.persist(registro);
		}
		
		public void deleteRegistro(Registro registro) {
			rDAO.remove(registro);
		}
		public Registro findOneRegistro(String text) {
			 Registro r = rDAO.findOne(text);
			 return r;
		}
		
		public List<Registro> findManyRegistro(String text) {
			List<Registro> lista = rDAO.findMany(text);
			return lista;
		}
		
		public List<Registro> findManyRegistro(Paciente paciente) {
			List<Registro> lista = rDAO.findMany(paciente);
			return lista;
		}
		
		public List<Registro> findManyRegistro(Dentista dentista) {
			List<Registro> lista = rDAO.findMany(dentista);
			return lista;
		}
		
		public List<Registro> findManyRegistro(Paciente paciente, Dentista dentista) {
			List<Registro> lista = rDAO.findMany(paciente, dentista);
			return lista;
		}

}
