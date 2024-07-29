package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Inventario;


@Repository
public class inventarioDAOImpl implements inventarioDAO {

	
	@Autowired
	private SessionFactory ssessionFactory;
	@Override
	@Transactional
	public List<Inventario> findALL() {
		// TODO Auto-generated method stub
		Session session = ssessionFactory.getCurrentSession();
		return session.createQuery("from Inventario", Inventario.class).getResultList();
	}

	@Override
	public Inventario findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Inventario inventario) {
		// TODO Auto-generated method stub

	}

	@Override 
	public void up(Inventario inventario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dell(int id) {
		// TODO Auto-generated method stub

	}

}
