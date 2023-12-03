package br.com.crud.desafiocrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.crud.desafiocrud.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

	

}
