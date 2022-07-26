package com.proyecto.taller2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Rol {

	@Id
	@Column(name = "Nombre")
	private String nombre;
	
	@Column(name = "Funcion")
    private String funcion;

    public Rol(String nombre, String funcion) {
        this.nombre = nombre;
        this.funcion = funcion;
    }

    public Rol() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "nombre='" + nombre + '\'' +
                ", funcion='" + funcion + '\'' +
                '}';
    }
}
