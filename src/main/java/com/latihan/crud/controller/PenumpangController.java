package com.latihan.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.latihan.crud.model.Penumpang;
import com.latihan.crud.service.PenumpangService;

@RestController
public class PenumpangController {
	
	@Autowired
	private PenumpangService penumpangService;
	
	//Save
	@PostMapping("/penumpang")
	public Penumpang savePenumpang(@RequestBody Penumpang penumpang) {
		return penumpangService.savePenumpang(penumpang);
	}
	
	//Read
	@GetMapping("/penumpang")
	public List<Penumpang> penumpangList(){
		return penumpangService.fetchPenumpangList();
	}
	
	//Update
	@PutMapping("/penumpang/{id}")
	public Penumpang updatePenumpang(@RequestBody Penumpang penumpang, @PathVariable("id") Integer id_penumpang) {
		return penumpangService.updatePenumpang(penumpang, id_penumpang);
	}
	
	//Delete
	@DeleteMapping("/penumpang/{id}")
	public String deletePenumpangById(@PathVariable("id") Integer id_penumpang) {
		penumpangService.deletePenumpangById(id_penumpang);
		return "Berhasil";
	}
}
