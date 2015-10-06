package com.tccsinet.sinet.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
//import javax.persistence.TypedQuery;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.apache.commons.lang3.StringUtils;


import com.tccsinet.sinet.modelo.SystemEvents;


public class SysEvents implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Inject
	private EntityManager manager;
	
	
/*	public SysEvents(EntityManager manager) {
		this.manager = manager;
	}
	*/
	/*
	public List<SystemEvents> todos() {
		TypedQuery<SystemEvents> query = manager.createQuery("from SystemEvents", SystemEvents.class);
		return query.getResultList();
	}
	*/
	
	@SuppressWarnings("unchecked")
	public List<SystemEvents> filtrar(FiltroConsulta filtro) {
		Criteria criteria = criaCriteriaFiltro(filtro);
		
		criteria.setFirstResult(filtro.getRegistro());
		criteria.setMaxResults(filtro.getQtdRegistro());
		
		if(filtro.isAscendente() && filtro.getOrdem() != null) {
			criteria.addOrder(Order.asc(filtro.getOrdem()));
			
		} else if (filtro.getOrdem() != null) {
			criteria.addOrder(Order.desc(filtro.getOrdem()));
		}
		
		return criteria.list();
	}

	
	public int qtddeFiltro(FiltroConsulta filtro) {
		Criteria criteria = criaCriteriaFiltro(filtro);
		
		criteria.setProjection(Projections.rowCount());
		
		return ((Number) criteria.uniqueResult()).intValue();
	}
	
	
	private Criteria criaCriteriaFiltro(FiltroConsulta filtro) {
		Session session = manager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(SystemEvents.class);
		
		if(StringUtils.isNotEmpty(filtro.getSysLogTag())) {
			
			criteria.add(Restrictions.ilike("sysLogTag", filtro.getSysLogTag(), MatchMode.ANYWHERE));
		}
		
		return criteria;
	}
}
