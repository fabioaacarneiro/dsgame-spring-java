package com.dslist.fabioaacarneiro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dslist.fabioaacarneiro.repositories.GameRepository;

import dto.GameMinDTO;

@Service
public class GameService {

	@Autowired
	private GameRepository repository;
	
	public List<GameMinDTO> findAll(){
		var result = repository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
