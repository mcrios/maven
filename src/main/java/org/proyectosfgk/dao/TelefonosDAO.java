package org.proyectosfgk.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.proyectosfgk.entity.Telefonos;
import org.proyectosfgk.entity.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class TelefonosDAO {
	@Autowired
	SessionFactory session;

	
	@SuppressWarnings("unchecked")
	public List<Telefonos> buscarTodos(Usuarios u){
		return session.getCurrentSession().createQuery("from Telefonos where IdUsuario = "+u.getId()+"").list();	
	}
}
