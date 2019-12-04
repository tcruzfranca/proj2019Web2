package controller;

import java.util.List;

import dao.DAO;
import dao.ItemDao;
import model.Item;

public class SistemaItem {
	private static ItemDao dao = new ItemDao();

	public void cadastraItem(Item item) {
		DAO.open();
		DAO.begin();
		dao.persist(item);
		DAO.commit();
		DAO.close();

	}

	public void editaItem(Item item) {
		DAO.open();
		DAO.begin();
		dao.merge(item);
		DAO.commit();
		DAO.close();

	}

	public void atualizaItem(Item item) {
		DAO.open();
		DAO.begin();
		dao.refresh(item);
		DAO.commit();
		DAO.close();

	}

	public Item getItemById(Integer chave) {
		DAO.open();
		DAO.begin();
		Item item = dao.find(chave);
		DAO.commit();
		DAO.close();
		return item;
	}

	public Item getItemByCodigo(String chave) {
		DAO.open();
		DAO.begin();
		Item item = dao.find(chave);
		DAO.commit();
		DAO.close();
		return item;
	}

	public List<Item> getAllItem() {
		DAO.open();
		DAO.begin();
		List<Item> item = dao.findAll();
		DAO.commit();
		DAO.close();
		return item;
	}

}
