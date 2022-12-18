package com.latihan.crud.service;

import java.util.List;

import com.latihan.crud.model.Penumpang;

public interface PenumpangService {
	
	//Save
	Penumpang savePenumpang(Penumpang penumpang);
	
	//Read
	List<Penumpang> fetchPenumpangList();
	
	//Update
	Penumpang updatePenumpang(Penumpang penumpang, Integer id_penumpang);
	
	//Delete
	void deletePenumpangById(Integer id_penumpang);
}
