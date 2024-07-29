package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.inventarioDAO;
import com.distribuida.entities.Inventario;



public class PrincipalInventario {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		//Patron IoC inverción de control
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		inventarioDAO InventarioDAO = context.getBean("inventarioDAOImpl", inventarioDAO.class);
		
		
		List<Inventario> clientes= InventarioDAO.findALL();
		
		clientes.forEach(item ->{
			System.out.println(item.toString());	
		});
			
		
		
		
		context.close();


	}

}
