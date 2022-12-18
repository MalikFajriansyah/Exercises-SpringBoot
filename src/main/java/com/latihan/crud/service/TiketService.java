package com.latihan.crud.service;

import java.util.List;
import com.latihan.crud.model.Tiket;

public interface TiketService {
	//Save
	Tiket saveTiket(Tiket tiket);
	
	//Read
	List<Tiket> fetchTiketList();
	
	//Update
	Tiket updateTiket(Tiket tiket, Integer Id);
	
	//Delete
	void deleteTiketById(Integer Id);
}
