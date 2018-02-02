package com.bcp.tc.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persona {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PersonaID")
	private int personaID;
	
	@Column(name="Agencia")
	private String agencia;

	@Column(name="Celular")
	private String celular;

	@Column(name="Conformidad")
	private String conformidad;

	@Column(name="Correo")
	private String correo;

	@Column(name="Dni")
	private String dni;

	@Column(name="Fecha")
	private String fecha;

	@Column(name="fecha_creacion")
	private Timestamp fechaCreacion;

	@Column(name="fecha_modificacion")
	private Timestamp fechaModificacion;

	@Column(name="NombreCompleto")
	private String nombreCompleto;

	@Column(name="TipoTarjeta")
	private String tipoTarjeta;

	public Persona() {
	}

	public int getPersonaID() {
		return this.personaID;
	}

	public void setPersonaID(int personaID) {
		this.personaID = personaID;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getConformidad() {
		return this.conformidad;
	}

	public void setConformidad(String conformidad) {
		this.conformidad = conformidad;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Timestamp getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Timestamp getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Timestamp fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getNombreCompleto() {
		return this.nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getTipoTarjeta() {
		return this.tipoTarjeta;
	}

	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}
}
