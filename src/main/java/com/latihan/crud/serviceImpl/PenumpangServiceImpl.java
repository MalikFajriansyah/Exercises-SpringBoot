package com.latihan.crud.serviceImpl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.latihan.crud.model.Penumpang;
import com.latihan.crud.repository.PenumpangRepository;
import com.latihan.crud.service.PenumpangService;

@Service
public class PenumpangServiceImpl implements PenumpangService {
	
	@Autowired
	private PenumpangRepository penumpangRepo;
	
	//Save
	@Override
	public Penumpang savePenumpang(Penumpang penumpang) {
		return penumpangRepo.save(penumpang);
	}
	
	//Read
	@Override
	public List<Penumpang> fetchPenumpangList() {
		return (List<Penumpang>)penumpangRepo.findAll();
	}
	
	//Update
	@Override
	public Penumpang updatePenumpang(Penumpang penumpang,  Integer id_penumpang) {
		
		Penumpang penDB = penumpangRepo.findById(id_penumpang).get();
		
		if (Objects.nonNull(penumpang.getNama())
	            && !"".equalsIgnoreCase(
	                penumpang.getNama())) {
	            penDB.setNama(
	                penumpang.getNama());
	        }
	 
	        if (Objects.nonNull(
	                penumpang.getNoTelpPnp())
	            && !"".equalsIgnoreCase(
	                penumpang.getNoTelpPnp())) {
	            penDB.setNoTelpPnp(
	                penumpang.getNoTelpPnp());
	        }
	 
	        if (Objects.nonNull(penumpang.getAlamat())
	            && !"".equalsIgnoreCase(
	                penumpang.getAlamat())) {
	            penDB.setAlamat(
	                penumpang.getAlamat());
	        }
	 
	        return penumpangRepo.save(penDB);
	}
	
	//Delete
	@Override
	public void deletePenumpangById(Integer id_penumpang) {
		penumpangRepo.deleteById(id_penumpang);
		
	}
	
}
