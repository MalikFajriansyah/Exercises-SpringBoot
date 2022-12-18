package com.latihan.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.latihan.crud.model.Tiket;

@Repository
public interface TiketRepository extends CrudRepository<Tiket, Integer>{

}
