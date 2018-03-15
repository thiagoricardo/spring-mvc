package com.tkr.brewer.repository.helper.estilo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tkr.brewer.model.Estilo;
import com.tkr.brewer.repository.filter.EstiloFilter;



public interface EstilosQueries {
	
	public Page<Estilo> filtrar(EstiloFilter filtro, Pageable pageable);
	
}
