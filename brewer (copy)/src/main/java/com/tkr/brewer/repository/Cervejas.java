package com.tkr.brewer.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.tkr.brewer.model.Cerveja;
import com.tkr.brewer.repository.helper.cerveja.CervejasQueries;


public interface Cervejas extends JpaRepository<Cerveja, Long> , CervejasQueries{
	


}
