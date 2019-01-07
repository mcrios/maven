package org.proyectosfgk.controller;

import org.proyectosfgk.entity.Usuarios;
import org.proyectosfgk.service.UsuariosServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {
	
	@Autowired
	UsuariosServicio service;
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public ModelAndView listar() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("lista", service.listar());
		mav.addObject("user", new Usuarios());
		mav.setViewName("usuarios");
		return mav;
	}
	
	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String guardar(Usuarios user) {
		service.guardar(user);
		return "redirect:/usuarios/listar";
	}
	
	@RequestMapping(value= "/eliminar/{id}", method = RequestMethod.GET)
	public ModelAndView eliminar(@PathVariable int id) {
		service.eliminar(service.encontrar(id));
		return listar();
	}
	
	@RequestMapping(value= "/editar/{id}", method = RequestMethod.GET)
	public ModelAndView editar(@PathVariable int id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("user", service.encontrar(id));
		mav.setViewName("editar");
		return mav;
	}
	
	@RequestMapping(value = "/editar", method = RequestMethod.POST)
	public String editar(Usuarios user) {
		service.editar(user);
		return "redirect:/usuarios/listar";
	}
}
