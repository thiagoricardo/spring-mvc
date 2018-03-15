package com.tkr.brewer.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;



import com.tkr.brewer.model.Estilo;
import com.tkr.brewer.repository.helper.estilo.EstilosQueries;



public interface Estilos extends JpaRepository<Estilo, Long> , EstilosQueries{
	
	public Optional<Estilo> findByNomeIgnoreCase(String nome);

}
