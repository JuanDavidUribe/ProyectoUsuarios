package com.proyecto.taller2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.taller2.dao.UsuarioDao;
import com.proyecto.taller2.models.Usuario;

@RequestMapping(value = "usuarios")
@RestController
public class UsuariosController {

	@Autowired
	private UsuarioDao usuarioDao;
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public List<Usuario> getUsuarios(){
		return usuarioDao.getUsuarios();
	}
	
	@RequestMapping(value = "/eliminar/{id}", method = RequestMethod.DELETE)
	public void eliminar(@PathVariable int id) {
		usuarioDao.eliminar(id);
	}
	
	@RequestMapping(value = "/registrar", method = RequestMethod.POST)
	public void registrarUsuario(@RequestBody Usuario usuario) {
		usuarioDao.registrar(usuario);
	}
	
	@RequestMapping(value = "/editar")
	public void actualizarUsuario(@RequestBody Usuario usuario) {
		
	}
	
}
