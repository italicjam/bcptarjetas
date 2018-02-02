package com.bcp.tc.entity;

public class Cliente{
	
	private Integer id;
	
	private Integer idTarjeta;
	
	private String dni;
	
	private String nombre;
	
	private String celular;
	
	private String correo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdTarjeta() {
		return idTarjeta;
	}

	public void setIdTarjeta(Integer idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	

}
