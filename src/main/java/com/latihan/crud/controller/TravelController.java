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
import com.latihan.crud.model.Travel;
import com.latihan.crud.service.TravelService;

@RestController
public class TravelController {
	
	@Autowired
	private TravelService travelService;
	
	//Save
	@PostMapping("/travel")
	public Travel saveTravel(@RequestBody Travel travel) {
	return travelService.saveTravel(travel);
	}
		
	//Read
	@GetMapping("/travel")
	public List<Travel> travelList(){
	return travelService.fetchTravelList();
	}
		
	//Update
	@PutMapping("/travel/{id}")
	public Travel updateTravel(@RequestBody Travel travel, @PathVariable("id") Integer id_travel) {
	return travelService.updateTravel(travel, id_travel);
	}
		
	//Delete
	@DeleteMapping("/travel/{id}")
	public String deleteTravelById(@PathVariable("id") Integer id_travel) {
	travelService.deleteTravelById(id_travel);
	return "Berhasil";
	}
}
