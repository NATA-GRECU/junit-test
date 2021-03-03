package com.generation.contato.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.contato.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>
{
	
}
