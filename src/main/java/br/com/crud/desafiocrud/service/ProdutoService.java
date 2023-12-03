package br.com.crud.desafiocrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.crud.desafiocrud.dto.ProdutoDTO;
import br.com.crud.desafiocrud.dto.UsuarioDTO;
import br.com.crud.desafiocrud.entity.ProdutoEntity;
import br.com.crud.desafiocrud.entity.UsuarioEntity;
import br.com.crud.desafiocrud.repository.ProdutoRepositorio;
@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepositorio produtoRepositorio;

	public List<ProdutoDTO> listarTodos() {

		List<ProdutoEntity> produtos = produtoRepositorio.findAll();
		return produtos.stream().map(ProdutoDTO::new).toList();

	}

	public void inserir(ProdutoDTO produto) {
		ProdutoEntity produtoEntity = new ProdutoEntity(produto);
		produtoRepositorio.save(produtoEntity);
	}

	public ProdutoDTO alterar(ProdutoDTO usuario) {
		ProdutoEntity produtoEntity = new ProdutoEntity(usuario);
		return new ProdutoDTO(produtoRepositorio.save(produtoEntity));

	}

	public void excluir(Long id) {
		ProdutoEntity produto = produtoRepositorio.findById(id).get();
		produtoRepositorio.delete(produto);
	}

	public ProdutoDTO buscarPorId(Long id) {
		return new ProdutoDTO(produtoRepositorio.findById(id).get());
	}

}
