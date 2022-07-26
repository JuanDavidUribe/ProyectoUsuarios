package com.proyecto.taller2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.taller2.models.Usuario;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> getUsuarios() {
		String query = "from Usuario";
		return entityManager.createQuery(query).getResultList();
	}

	@Override
	public void eliminar(int id) {
		Usuario usuario = entityManager.find(Usuario.class, id);
		entityManager.remove(usuario);
	}

	@Override
	public Object registrar(Usuario usuario) {
		entityManager.merge(usuario);
		return null;
	}

}
