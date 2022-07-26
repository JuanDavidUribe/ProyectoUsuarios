package com.proyecto.taller2.dao;

import java.util.List;

import com.proyecto.taller2.models.Rol;

public interface RolesDao {

	List<Rol> getRoles();

	Object registrar(Rol rol);
}
