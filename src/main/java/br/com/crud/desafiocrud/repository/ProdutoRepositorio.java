package br.com.crud.desafiocrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.crud.desafiocrud.entity.ProdutoEntity;

public interface ProdutoRepositorio extends JpaRepository<ProdutoEntity, Long> {

	
}
