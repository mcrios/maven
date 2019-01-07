package org.proyectosfgk.service;

import java.util.List;

import org.proyectosfgk.dao.TelefonosDAO;
import org.proyectosfgk.entity.Telefonos;
import org.proyectosfgk.entity.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TelefonosServicio {
	
	@Autowired
	TelefonosDAO dao;
	
	public List<Telefonos> buscarTodos(Usuarios u){
		System.out.println("Generando lista" + u.getId());
		System.out.println("Generando lista" + dao.buscarTodos(u) );
		return dao.buscarTodos(u);
	}
}
