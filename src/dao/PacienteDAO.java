package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import model.Paciente;

public class PacienteDAO implements DAOInterface<Paciente>{
	
	private EntityManager em;
	private EntityManagerFactory emf;
	
	public PacienteDAO(EntityManager em, EntityManagerFactory emf) {
		this.em = em;
		this.emf = emf;
	}
	
	@Override
	public void persist(Paciente paciente) {
		em.getTransaction().begin();
		em.persist(paciente);
		em.getTransaction().commit();
		
	}
	
	@Override
	public void remove(Paciente paciente) {
		em.getTransaction().begin();
		Query q = em.createNativeQuery("delete from Paciente where cpf="+ paciente.getCpf());
	    q.executeUpdate();
	    em.getTransaction().commit();
	    	
	}
	
	@Override 
	public Paciente findOne(String text) {
		em.getTransaction().begin();
		Query q = em.createNativeQuery("select * from Paciente p where p.cpf like :atributo", Paciente.class);
		q.setParameter("atributo", text+"%");
		Paciente p =  (Paciente) q.getSingleResult();
		em.getTransaction().commit();
		return p;
	}
	
	@Override
	public List<Paciente> findMany(String text){
		em.getTransaction().begin();
		Query q = em.createNativeQuery("select * from Paciente p where p.nome like :atributo", Paciente.class);
		q.setParameter("atributo", text+"%");
		List<Paciente> p =  (List<Paciente>) q.getResultList();
		em.getTransaction().commit();
		return p;
		
	}

	
}
