package com.tccsinet.sinet.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Date dataLogin;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataLogin() {
		return dataLogin;
	}
	public void setDataLogin(Date dataLogin) {
		this.dataLogin = dataLogin;
	}
	
	
	
	

}
