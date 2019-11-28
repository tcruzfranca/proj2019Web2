package dao;

import java.util.List;

public interface DAOInterface<T> {
	public void persist(T obj);
	public void remove(T obj);
	public T findOne(String text);
	public List<T> findMany(String text);
	
}
