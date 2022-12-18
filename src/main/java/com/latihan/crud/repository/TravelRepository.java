package com.latihan.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.latihan.crud.model.Travel;

@Repository
public interface TravelRepository extends CrudRepository<Travel, Integer>{
	
}
