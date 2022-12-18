package com.latihan.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.latihan.crud.model.Tiket;
import com.latihan.crud.service.TiketService;

@RestController
public class TiketController {
	
	@Autowired
	private TiketService tiketService;
	
	//Save
	@PostMapping("/tiket")
	public Tiket saveTiket(@RequestBody Tiket tiket) {
		return tiketService.saveTiket(tiket);
	}
	
	//Read
	@GetMapping("/tiket")
	public List<Tiket> tiketList(){
		return tiketService.fetchTiketList();
	}
}
