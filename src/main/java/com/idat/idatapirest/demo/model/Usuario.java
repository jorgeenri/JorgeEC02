package com.idat.idatapirest.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="usuarios")
@Entity
public class Usuario {
	Integer idUsuario;
	String usuario;
	String contrasenia;
	String rol;


	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	
	

}
