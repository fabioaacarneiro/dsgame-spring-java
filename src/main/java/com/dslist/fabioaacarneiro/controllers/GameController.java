package com.dslist.fabioaacarneiro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dslist.fabioaacarneiro.services.GameService;

import dto.GameMinDTO;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService service;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		return service.findAll();
	}
}
