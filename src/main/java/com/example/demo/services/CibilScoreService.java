package com.example.demo.services;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.enitity.CibilScore;
import com.example.demo.repos.CibiScoreRepository;

import lombok.Setter;
@Setter
@Service
public class CibilScoreService {
	@Autowired
	private CibiScoreRepository repo;
	public List<CibilScore> findAll(){
		return this.repo.findAll();
	}
	
	
	public CibilScore add(CibilScore entity) {
		return this.repo.save(entity);
	}


	public CibilScore update(CibilScore entity) {
		// TODO Auto-generated method stub
		return this.repo.save(entity);
	}


	public List<CibilScore> delete(int id,HttpServletResponse resp) {
		// TODO Auto-generated method stub
		System.out.println(id);
		
		try {
		if(this.repo.existsById(id)) {
			
			this.repo.deleteById(id);
			return this.repo.findAll();
		}else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Requested Entity is not Found");
		}
		}catch(ResponseStatusException exeException) {
			throw exeException;
		}
		
	}
	
	
	

}
