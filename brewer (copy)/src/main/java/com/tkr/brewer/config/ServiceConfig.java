package com.tkr.brewer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


import com.tkr.brewer.service.CadastroCervejaService;
import com.tkr.brewer.storage.FotoStorage;
import com.tkr.brewer.storage.local.FotoStorageLocal;

@Configuration
@ComponentScan(basePackageClasses = CadastroCervejaService.class)
public class ServiceConfig {

	
	@Bean
	public FotoStorage fotoStorage() {
		return new FotoStorageLocal();
	}
}
