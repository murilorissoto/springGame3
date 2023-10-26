package com.senai.murilo.PrjGame.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.murilo.PrjGame.Entities.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long>{
	
}
