package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import model.Dentista;
import model.Paciente;
import model.Registro;

public class RegistroDAO implements DAOInterface<Registro>{
	private EntityManager em;
	private EntityManagerFactory emf;
	
	public RegistroDAO(EntityManager em, EntityManagerFactory emf) {
		this.em = em;
		this.emf = emf;
	}
	
	@Override
	public void persist(Registro registro) {
		em.getTransaction().begin();
		em.persist(registro);
		em.getTransaction().commit();
		
	}
	
	@Override
	public void remove(Registro registro) {
		em.getTransaction().begin();
		Query q = em.createNativeQuery("delete from Registro where id="+registro.getId());
	    q.executeUpdate();
	    em.getTransaction().commit();
	     	
	}
	
	@Override 
	public Registro findOne(String text) {
		em.getTransaction().begin();
		Query q = em.createNativeQuery("select * from Registro p where p.id like :atributo", Registro.class);
		q.setParameter("atributo", text+"%");
		Registro p =  (Registro) q.getSingleResult();
		em.getTransaction().commit();
		return p;
	}
	
	@Override
	public List<Registro> findMany(String text){
		em.getTransaction().begin();
		Query q = em.createNativeQuery("select * from Paciente p where p.procedimento like :atributo", Registro.class);
		q.setParameter("atributo", text+"%");
		List<Registro> p =  (List<Registro>) q.getResultList();
		em.getTransaction().commit();
		return p;
		
	}

	
	
	public List<Registro> findMany(Paciente paciente){
		em.getTransaction().begin();
		Query q = em.createNativeQuery("select * from Registro p where p.paciente like :atributo", Registro.class);
		q.setParameter("atributo", paciente+"%");
		List<Registro> p =  (List<Registro>) q.getResultList();
		em.getTransaction().commit();
		return p;
		
	}
	
	
	public List<Registro> findMany(Dentista dentista){
		em.getTransaction().begin();
		Query q = em.createNativeQuery("select * from Registro p where p.dentista like :atributo", Registro.class);
		q.setParameter("atributo", dentista+"%");
		List<Registro> p =  (List<Registro>) q.getResultList();
		em.getTransaction().commit();
		return p;
		
	}

	public List<Registro> findMany(Paciente paciente, Dentista dentista){
		em.getTransaction().begin();
		Query q = em.createNativeQuery("select * from Registro p where p.paciente like :atributo and p.dentista like :atributo1", Registro.class);
		q.setParameter("atributo", paciente+"%");
		q.setParameter("atributo1", dentista+"%");
		List<Registro> p =  (List<Registro>) q.getResultList();
		em.getTransaction().commit();
		return p;
		
	}
	
}