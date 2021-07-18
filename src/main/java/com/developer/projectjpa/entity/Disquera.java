/**
 * 
 */
package com.developer.projectjpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Junior Mendez
 * Clase que representa el entity que mappea a la tabla de disquera con JPA
 */
@Entity
@Table(name = "disquera")
public class Disquera {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idDisquera")
	private Long idDisquera;
	
	@Column(name = "descripcion", length = 100)
	private String descripcion;
	
	@Column(name = "fechaCreacion")
	private LocalDateTime fechaCreacion;
	
	@Column(name = "fechaModificacion")
	private LocalDateTime fechaModificacion;
	
	@Column(name = "estatus")
	private boolean estatus ;
	/**
	 * @return the idDisquera
	 */
	public Long getIdDisquera() {
		return idDisquera;
	}


	/**
	 * @param idDisquera the idDisquera to set
	 */
	public void setIdDisquera(Long idDisquera) {
		this.idDisquera = idDisquera;
	}


	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}


	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	/**
	 * @return the fechaCreacion
	 */
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}


	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	/**
	 * @return the fechaModificacion
	 */
	public LocalDateTime getFechaModificacion() {
		return fechaModificacion;
	}


	/**
	 * @param fechaModificacion the fechaModificacion to set
	 */
	public void setFechaModificacion(LocalDateTime fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}


	/**
	 * @return the estatus
	 */
	public boolean isEstatus() {
		return estatus;
	}


	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}



}
