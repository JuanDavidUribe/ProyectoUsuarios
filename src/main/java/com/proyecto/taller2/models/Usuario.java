package com.proyecto.taller2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@Column(name = "ID")
	private int id;

	@Column(name = "NOMBRE")
    private String nombre;
	
	@Column(name = "NICKNAME")
    private String nickName;
	
	@Column(name = "ROL")
    private String rol;

    public Usuario(int id, String nombre, String nickName, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.nickName = nickName;
        this.rol = rol;
    }

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRol() {
        return rol;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", nickName='" + nickName + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
