package org.bazinga.entities;

import java.net.PasswordAuthentication;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class UsuarioRegistrado extends Usuario{
	
	@NotNull
	private String nickName;
	@NotNull
	@Size(min=6,max=20)
	private String pass;
	
}
