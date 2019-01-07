package org.proyectosfgk.controller;

import org.proyectosfgk.service.TelefonosServicio;
import org.proyectosfgk.service.UsuariosServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/telefonos")
public class TelefonosController {
	@Autowired
	TelefonosServicio service;
	@Autowired
	UsuariosServicio usuario;
	
	@RequestMapping(value = "/verTelefonos/{id}",method = RequestMethod.GET)
	public ModelAndView verTelefonos(@PathVariable int id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("lista", service.buscarTodos(usuario.encontrar(id)));
		mav.setViewName("telefonos");
		return mav;
	}
}
