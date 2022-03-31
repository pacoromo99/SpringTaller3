package com.nttdata.Spring.Taller3.Entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente 
{
	@Id
	@GeneratedValue
	private Long idCliente;
	private String nombreCliente;
	private String apellidosCliente;
	private Date nacimientoCliente;
	private String dniCliente;
	public Cliente(String nombreCliente, String apellidosCliente, Date nacimientoCliente,String dniCliente) {
		super();
		this.nombreCliente = nombreCliente;
		this.apellidosCliente = apellidosCliente;
		this.nacimientoCliente = nacimientoCliente;
		this.dniCliente = dniCliente;
	}
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidosCliente() {
		return apellidosCliente;
	}
	public void setApellidosCliente(String apellidosCliente) {
		this.apellidosCliente = apellidosCliente;
	}
	public Date getNacimientoCliente() {
		return nacimientoCliente;
	}
	public void setNacimientoCliente(Date nacimientoCliente) {
		this.nacimientoCliente = nacimientoCliente;
	}
	public String getDniCliente() {
		return dniCliente;
	}
	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}
	

}
