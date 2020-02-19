package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.enitity.CibilScore;
import com.example.demo.services.CibilScoreService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.Setter;

@RestController
@Setter
@CrossOrigin(origins = "*")
public class CibilScoreController {

	@Autowired
	private CibilScoreService service;

	@GetMapping(path="/api/v1/cibilscore")
	public List<CibilScore> getAll(){
		System.out.println( this.service.findAll());
		return this.service.findAll();
	}

	@PostMapping(path="/api/v1/cibilscore")
	public CibilScore add(@RequestBody CibilScore entity) {

		return this.service.add(entity);
	}

	@PutMapping(path="/api/v1/cibilscore")
	public CibilScore update(@RequestBody CibilScore entity) {
        return this.service.update(entity);
	}

	@Operation(description = "Delete a Given Entity If not found throws Exception")
	@DeleteMapping(path="/api/v1/cibilscore/{id}")
	public List<CibilScore> delete(@PathVariable int id) {
		return this.service.delete(id, null);
   }


}
