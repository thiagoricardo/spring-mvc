package com.tkr.brewer.repository.helper.cerveja;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tkr.brewer.model.Cerveja;
import com.tkr.brewer.repository.filter.CervejaFilter;

public interface CervejasQueries {
	
	public Page<Cerveja> filtrar(CervejaFilter filtro, Pageable pageable);

}
