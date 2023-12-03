package br.com.crud.desafiocrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.crud.desafiocrud.dto.ProdutoDTO;
import br.com.crud.desafiocrud.service.ProdutoService;
@RestController
@RequestMapping (value = "/produto")
public class ProdutoController {
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping 
	public List<ProdutoDTO> listarTodos(){
		return produtoService.listarTodos();
	}
	@PostMapping
	public void inserir(@RequestBody ProdutoDTO produto) {
		produtoService.inserir(produto);
	}
	@PutMapping
	public ProdutoDTO alterar (@RequestBody ProdutoDTO produto) {
		return produtoService.alterar(produto);
	}
	@DeleteMapping ("/{id}")
	public ResponseEntity<Void> delete (@PathVariable Long id){
		produtoService.excluir(id);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<ProdutoDTO> buscarPorId(@PathVariable Long id) {
        ProdutoDTO produto = produtoService.buscarPorId(id);
        if (produto != null) {
            return ResponseEntity.ok(produto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	
	
}
