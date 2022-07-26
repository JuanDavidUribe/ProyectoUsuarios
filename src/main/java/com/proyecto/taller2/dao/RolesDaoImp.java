package com.proyecto.taller2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.taller2.models.Rol;

@Repository
@Transactional
public class RolesDaoImp implements RolesDao{

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Rol> getRoles() {
		String query = "from Rol";
		return entityManager.createQuery(query).getResultList();
	}

	@Override
	public Object registrar(Rol rol) {
		entityManager.merge(rol);
		return null;
	}
	
}
