package org.proyectosfgk.service;

import java.util.List;

import org.proyectosfgk.dao.UsuariosDAO;
import org.proyectosfgk.entity.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosServicio {
	@Autowired
	private UsuariosDAO dao;
	
	public List<Usuarios> listar(){
		return dao.listar();
	}
	
	public void guardar(Usuarios u) {
		dao.guardar(u);
	}
	
	public void eliminar(Usuarios u) {
		dao.eliminar(u);
	}
	
	public Usuarios encontrar(int id) {
		return dao.buscarPorId(id);
	}
	
	public void editar(Usuarios u) {
		dao.editar(u);
	}
}
