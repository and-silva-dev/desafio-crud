package br.com.crud.desafiocrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.crud.desafiocrud.dto.UsuarioDTO;
import br.com.crud.desafiocrud.entity.UsuarioEntity;
import br.com.crud.desafiocrud.repository.UsuarioRepositorio;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepositorio usuarioRepository;
	
	
	public List<UsuarioDTO> listarTodos(){
		
		List<UsuarioEntity> usuarios = usuarioRepository.findAll();
		return usuarios.stream().map(UsuarioDTO::new).toList();
	
	}
	public void inserir(UsuarioDTO usuario) {
		UsuarioEntity usuarioEntity = new UsuarioEntity(usuario);
		usuarioRepository.save(usuarioEntity);
	}
	public UsuarioDTO alterar(UsuarioDTO usuario) {
		UsuarioEntity usuarioEntity = new UsuarioEntity(usuario);
		return new UsuarioDTO(usuarioRepository.save(usuarioEntity));
		
		
	}
	public void excluir ( Long id) {
		UsuarioEntity usuario = usuarioRepository.findById(id).get();
		usuarioRepository.delete(usuario);
	}
	
	public UsuarioDTO buscarPorId(Long id) {
		return new UsuarioDTO(usuarioRepository.findById(id).get());
	}
	
	
	
}
