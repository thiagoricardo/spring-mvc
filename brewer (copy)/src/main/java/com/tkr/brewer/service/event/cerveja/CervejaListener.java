package com.tkr.brewer.service.event.cerveja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.tkr.brewer.storage.FotoStorage;

@Component
public class CervejaListener {
	
	@Autowired
	private FotoStorage fotoStorage;
	
	
	@EventListener(condition = "#evento.temFoto()")
	public void cervejaSalva(CervejaSalvaEvent evento) {
		
		//System.out.println("Teve foto");
		
		fotoStorage.salvar(evento.getCerveja().getFoto());
		
		
	}

}
