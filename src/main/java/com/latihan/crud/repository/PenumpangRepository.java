package com.latihan.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.latihan.crud.model.Penumpang;

@Repository
public interface PenumpangRepository extends CrudRepository<Penumpang, Integer> {
	
}
