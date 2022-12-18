package com.latihan.crud.service;

import java.util.List;
import com.latihan.crud.model.Travel;

public interface TravelService {
	
	    //Save
		Travel saveTravel(Travel travel);
		
		//Read
		List<Travel> fetchTravelList();
		
		//Update
		Travel updateTravel(Travel travel, Integer id_travel);
		
		//Delete
		void deleteTravelById(Integer id_travel);
}
