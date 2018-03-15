package com.tkr.brewer.storage;

import org.springframework.web.multipart.MultipartFile;

public interface FotoStorage {

	public String salvarTemporariamente(MultipartFile[] files);

	public byte[] recupararFotoTemporaria(String nome);

	public void salvar(String foto);

	public byte[] recuparar(String foto);
	
	

	
	
}