package com.dslist.fabioaacarneiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dslist.fabioaacarneiro.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
