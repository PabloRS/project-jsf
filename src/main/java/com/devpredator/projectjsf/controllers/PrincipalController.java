/**
 * 
 */
package com.devpredator.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devpredator.projectjsf.entity.Empleado;
import com.devpredator.projectjsf.services.EmpleadoService;

/**
 * @author pablo
 * Clase controller que se encarga de procesar informacion para la pantalla principal
 *
 */
@ManagedBean
@ViewScoped
public class PrincipalController {
	
	private List<Empleado> empleados;
	
	private List<Empleado> empleadosFiltrados;
	
	public List<Empleado> getEmpleadosFiltrados() {
		return empleadosFiltrados;
	}

	public void setEmpleadosFiltrados(List<Empleado> empleadosFiltrados) {
		this.empleadosFiltrados = empleadosFiltrados;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	private EmpleadoService empleadoService = new EmpleadoService();
	
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}
	
	public void consultarEmpleados() {
		this.empleados = this.empleadoService.consultarEmpleados();
	}

}
