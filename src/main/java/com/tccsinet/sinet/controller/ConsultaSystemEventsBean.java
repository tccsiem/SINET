package com.tccsinet.sinet.controller;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import com.tccsinet.sinet.modelo.SystemEvents;
import com.tccsinet.sinet.repository.FiltroConsulta;
import com.tccsinet.sinet.repository.SysEvents;



@Named
@ViewScoped
public class ConsultaSystemEventsBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private SysEvents sysEventsRepository;
	
	//private List<SystemEvents> systemevents;
	
	
	private FiltroConsulta filtro = new FiltroConsulta();
	private LazyDataModel<SystemEvents> modelo;
	
	public ConsultaSystemEventsBean() {
		
		modelo = new LazyDataModel<SystemEvents>() {

			private static final long serialVersionUID = 1L;
			

			@Override
			public List<SystemEvents> load(int first, int pageSize,
					String sortField, SortOrder sortOrder, Map<String, Object> filters) {
				
				filtro.setRegistro(first);
				filtro.setQtdRegistro(pageSize);
				filtro.setAscendente(SortOrder.ASCENDING.equals(sortOrder));
				filtro.setOrdem(sortField);
				
				setRowCount(sysEventsRepository.qtddeFiltro(filtro));
				
				return sysEventsRepository.filtrar(filtro);
			
				}
	
		};
	
	

	}
		public FiltroConsulta getFiltro() {
			return filtro;
		}

		public LazyDataModel<SystemEvents> getModelo() {
			return modelo;
		}

	
	}
 

