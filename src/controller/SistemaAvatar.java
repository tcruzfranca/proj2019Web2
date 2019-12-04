package controller;

import java.util.List;

import dao.AvatarDao;
import dao.DAO;
import model.Avatar;

public class SistemaAvatar {

	private static AvatarDao dao = new AvatarDao();

	public void cadastraAvatar(Avatar avatar) {
		DAO.open();
		DAO.begin();
		dao.persist(avatar);
		DAO.commit();
		DAO.close();

	}

	public void removeAvatar(Avatar avatar) {
		DAO.open();
		DAO.begin();
		dao.remove(avatar);
		DAO.commit();
		DAO.close();

	}

	public void editaAvatar(Avatar avatar) {
		DAO.open();
		DAO.begin();
		dao.merge(avatar);
		DAO.commit();
		DAO.close();

	}

	public void atualizaAvatar(Avatar avatar) {
		DAO.open();
		DAO.begin();
		dao.refresh(avatar);
		DAO.commit();
		DAO.close();

	}

	public List<Avatar> getAllAvatar() {
		DAO.open();
		DAO.begin();
		List<Avatar> avatar = dao.findAll();
		DAO.commit();
		DAO.close();
		return avatar;
	}

}
