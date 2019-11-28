package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import model.Dentista;

public class DentistaDAO implements DAOInterface<Dentista>{
	private EntityManager em;
	private EntityManagerFactory emf;

	
	public DentistaDAO(EntityManager em, EntityManagerFactory emf) {
		this.em = em;
		this.emf = emf;
		
	}
	
	@Override
	public void persist(Dentista dentista) {
		em.getTransaction().begin();
		em.persist(dentista);
		em.getTransaction().commit();
	}
	
	@Override
	public void remove(Dentista dentista) {
		em.getTransaction().begin();
		Query q = em.createNativeQuery("delete from Dentista where cro="+ dentista.getCro());
	    q.executeUpdate();
	    em.getTransaction().commit();
	}
	
	@Override 
	public Dentista findOne(String text) {
		em.getTransaction().begin();
		Query q = em.createNativeQuery("select * from Dentista p where p.cro like :atributo", Dentista.class);
		q.setParameter("atributo", text+"%");
		Dentista p =  (Dentista) q.getSingleResult();
		em.getTransaction().commit();
		return p;
	}
	
	@Override
	public List<Dentista> findMany(String text){
		em.getTransaction().begin();
		Query q = em.createNativeQuery("select * from Dentista p where p.nome like :atributo", Dentista.class);
		q.setParameter("atributo", text+"%");
		List<Dentista> p =  (List<Dentista>) q.getResultList();
		em.getTransaction().commit();
		return p;
		
	}

}
