package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Inventario;

public interface inventarioDAO {
public List<Inventario> findALL();
	
	public Inventario findOne(int id);
	
	public void add (Inventario inventario);
	
	public void up (Inventario inventario);
	
	public void dell (int id);
	
	
	//CRUD avansados
}
