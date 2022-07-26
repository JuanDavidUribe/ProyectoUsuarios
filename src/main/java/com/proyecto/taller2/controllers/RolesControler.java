package com.proyecto.taller2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.taller2.dao.RolesDao;
import com.proyecto.taller2.models.Rol;
import com.proyecto.taller2.models.Usuario;

@RequestMapping(value = "roles")
@RestController
public class RolesControler {

	@Autowired
	private RolesDao rolesDao;
	
	@RequestMapping(value = "/listar")
	public List<Rol> getUsuarios(){
		return rolesDao.getRoles();
	}
	
	@RequestMapping(value = "/registrar")
	public void registrarRol(@RequestBody Rol rol) {
		rolesDao.registrar(rol);
	}
}