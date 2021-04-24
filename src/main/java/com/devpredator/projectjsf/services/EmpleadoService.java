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
		Empleado empleadoNetflix = new Empleado();
		Empleado empleadoAmazon = new Empleado();
		Empleado empleadoHP = new Empleado();
		Empleado empleadoOracle = new Empleado();
		Empleado empleadoDeloitte = new Empleado();
		Empleado empleadoDisney = new Empleado();
		
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
		
		empleadoNetflix.setNombre("Pablo1");
		empleadoNetflix.setPrimerApellido("Ramirez");
		empleadoNetflix.setSegundoApellido("Solorzano");
		empleadoNetflix.setPuesto("Sr Software Engineer");
		empleadoNetflix.setStatus(true);
		
		empleadoAmazon.setNombre("Fabian1");
		empleadoAmazon.setPrimerApellido("Flores");
		empleadoAmazon.setSegundoApellido("Flores");
		empleadoAmazon.setPuesto("Sr Software Engineer");
		empleadoAmazon.setStatus(true);
		
		empleadoHP.setNombre("Juan Carlos1");
		empleadoHP.setPrimerApellido("Mejia");
		empleadoHP.setSegundoApellido("Mejia");
		empleadoHP.setPuesto("Sr Software Engineer");
		empleadoHP.setStatus(true);
		
		empleadoOracle.setNombre("Pablo2");
		empleadoOracle.setPrimerApellido("Ramirez");
		empleadoOracle.setSegundoApellido("Solorzano");
		empleadoOracle.setPuesto("Sr Software Engineer");
		empleadoOracle.setStatus(true);
		
		empleadoDeloitte.setNombre("Fabian2");
		empleadoDeloitte.setPrimerApellido("Flores");
		empleadoDeloitte.setSegundoApellido("Flores");
		empleadoDeloitte.setPuesto("Sr Software Engineer");
		empleadoDeloitte.setStatus(true);
		
		empleadoDisney.setNombre("Juan Carlos2");
		empleadoDisney.setPrimerApellido("Mejia");
		empleadoDisney.setSegundoApellido("Mejia");
		empleadoDisney.setPuesto("Sr Software Engineer");
		empleadoDisney.setStatus(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		empleados.add(empleadoNetflix);
		empleados.add(empleadoAmazon);
		empleados.add(empleadoHP);
		empleados.add(empleadoOracle);
		empleados.add(empleadoDeloitte);
		empleados.add(empleadoDisney);
		
		return empleados;
	}

}
