/**
 * 
 */
package com.devpredator.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.projectjsf.entity.Empleado;

/**
 * @author pablo
 *Clase que permite realizar la logica de negocio para empleados
 */
public class EmpleadoService {
	
	public List<Empleado> consultarEmpleados() {
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		
		empleadoIBM.setNombre("Pablo");
		empleadoIBM.setPrimerApellido("Ramirez");
		empleadoIBM.setSegundoApellido("Solorzano");
		empleadoIBM.setPuesto("Sr Software Engineer");
		empleadoIBM.setStatus(true);
		
		empleadoMicrosoft.setNombre("Fabian");
		empleadoMicrosoft.setPrimerApellido("Flores");
		empleadoMicrosoft.setSegundoApellido("Flores");
		empleadoMicrosoft.setPuesto("Sr Software Engineer");
		empleadoMicrosoft.setStatus(true);
		
		empleadoApple.setNombre("Juan Carlos");
		empleadoApple.setPrimerApellido("Mejia");
		empleadoApple.setSegundoApellido("Mejia");
		empleadoApple.setPuesto("Sr Software Engineer");
		empleadoApple.setStatus(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		
		return empleados;
	}

}
