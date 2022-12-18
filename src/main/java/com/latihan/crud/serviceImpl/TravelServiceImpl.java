package com.latihan.crud.serviceImpl;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.latihan.crud.model.Travel;
import com.latihan.crud.repository.TravelRepository;
import com.latihan.crud.service.TravelService;

@Service
public class TravelServiceImpl implements TravelService {
	
	@Autowired
	private TravelRepository travelRepo;
	
	//Save
	@Override
	public Travel saveTravel(Travel travel) {
		return travelRepo.save(travel);
	}
	
	//Read
	@Override
	public List<Travel> fetchTravelList() {
		return (List<Travel>)travelRepo.findAll();
	}
	
	//Update
	@Override
	public Travel updateTravel(Travel travel, Integer id_travel) {
		
		Travel travelDB = travelRepo.findById(id_travel).get();
		
		if (Objects.nonNull(travel.getNamaSupir())
	            && !"".equalsIgnoreCase(
	                travel.getNamaSupir())) {
	            travelDB.setNamaSupir(
	                travel.getNamaSupir());
	        }
	 
	        if (Objects.nonNull(
	                travel.getNoTelpSupir())
	            && !"".equalsIgnoreCase(
	                travel.getNoTelpSupir())) {
	            travelDB.setNoTelpSupir(
	                travel.getNoTelpSupir());
	        }
	 
	        if (Objects.nonNull(travel.getAlamat())
	            && !"".equalsIgnoreCase(
	                travel.getAlamat())) {
	            travelDB.setAlamat(
	                travel.getAlamat());
	        }
	        
	        if (Objects.nonNull(travel.getNoPol())
		            && !"".equalsIgnoreCase(
		                travel.getNoPol())) {
		            travelDB.setNoPol(
		                travel.getNoPol());
		        }
	 
	        return travelRepo.save(travelDB);
	}
	
	//Delete
	@Override
	public void deleteTravelById(Integer id_travel) {
		travelRepo.deleteById(id_travel);
	}
}
