package com.latihan.crud.serviceImpl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.latihan.crud.model.Tiket;
import com.latihan.crud.repository.TiketRepository;
import com.latihan.crud.service.TiketService;

@Service
public class TiketServiceImpl implements TiketService{
	
	@Autowired
	private TiketRepository tiketRepo;
	
	//Save
	@Override
	public Tiket saveTiket(Tiket tiket) {
		return tiketRepo.save(tiket);
	}
	
	//Read
	@Override
	public List<Tiket> fetchTiketList() {
		return (List<Tiket>)tiketRepo.findAll();
	}
	
	//Update
	@Override
	public Tiket updateTiket(Tiket tiket, Integer Id) {
		
		Tiket tikDB = tiketRepo.findById(Id).get();
		
		if (Objects.nonNull(tiket.getJadwal())
	            && !"".equalsIgnoreCase(
	                tiket.getJadwal())) {
	            tikDB.setJadwal(
	                tiket.getJadwal());
	        }
	        return tiketRepo.save(tikDB);
	}
	
	//Delete
	@Override
	public void deleteTiketById(Integer Id) {
		tiketRepo.deleteById(Id);
	}

}
