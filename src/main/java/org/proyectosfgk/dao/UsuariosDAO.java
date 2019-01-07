package org.proyectosfgk.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.proyectosfgk.entity.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UsuariosDAO {
	@Autowired
	SessionFactory session;
	
	@SuppressWarnings("unchecked")
	public List<Usuarios> listar(){
		return session.getCurrentSession().createQuery("from Usuarios").list();
	}
	
	public void guardar(Usuarios u) {
		session.getCurrentSession().save(u);
	}
	
	public void eliminar(Usuarios u) {
		session.getCurrentSession().delete(u);
	}
	
	public Usuarios buscarPorId (int id) {
		return (Usuarios) session.getCurrentSession().createQuery("from Usuarios where id="+id+"").uniqueResult();
	}
	
	public void editar(Usuarios u) {
		session.getCurrentSession().update(u);
	}
}
