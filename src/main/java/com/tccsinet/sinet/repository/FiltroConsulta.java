package com.tccsinet.sinet.repository;

import java.io.Serializable;

public class FiltroConsulta implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String SysLogTag;
	
	private int Registro;
	private int qtdRegistro;
	private String Ordem;
	private boolean ascendente;
	
	
	public String getSysLogTag() {
		return SysLogTag;
	}
	
	public void setSysLogTag(String sysLogTag) {
		SysLogTag = sysLogTag;
	}
	public int getRegistro() {
		return Registro;
	}
	public void setRegistro(int registro) {
		Registro = registro;
	}
	public int getQtdRegistro() {
		return qtdRegistro;
	}
	public void setQtdRegistro(int qtdRegistro) {
		this.qtdRegistro = qtdRegistro;
	}
	public String getOrdem() {
		return Ordem;
	}
	public void setOrdem(String ordem) {
		Ordem = ordem;
	}
	public boolean isAscendente() {
		return ascendente;
	}
	public void setAscendente(boolean ascendente) {
		this.ascendente = ascendente;
	}
	
}
