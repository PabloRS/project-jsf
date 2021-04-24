/**
 * 
 */
package com.devpredator.projectjsf.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.devpredator.projectjsf.dto.UsuarioDto;

/**
 * @author pablo
 * Mantener información del usuario que ingresa en sesión.
 */

@ManagedBean
@SessionScoped
public class SessionController {
	
	private UsuarioDto usuarioDto;
	
	@PostConstruct
	public void init() {
		System.out.println("Cargando información del usuario en la sesión...");
	}

	public UsuarioDto getUsuarioDto() {
		return usuarioDto;
	}

	public void setUsuarioDto(UsuarioDto usuarioDto) {
		this.usuarioDto = usuarioDto;
	}

}
