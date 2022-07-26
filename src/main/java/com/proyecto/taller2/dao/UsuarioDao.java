package com.proyecto.taller2.dao;

import java.util.List;

import com.proyecto.taller2.models.Usuario;

public interface UsuarioDao {
	List<Usuario> getUsuarios ();

	void eliminar(int id);

	Object registrar(Usuario usuario);
	

}
