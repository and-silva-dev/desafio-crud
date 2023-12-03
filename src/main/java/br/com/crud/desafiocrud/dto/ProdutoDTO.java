package br.com.crud.desafiocrud.dto;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import br.com.crud.desafiocrud.entity.ProdutoEntity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ProdutoDTO {

	private Long id;
	private String nome;
	private String categoria;
	private String marca;
	private Double preco;
	
	/**
	 * Construtores
	 */
	public ProdutoDTO() {
	}

	public ProdutoDTO(ProdutoEntity produto) {
		BeanUtils.copyProperties(produto, this);
		
	}

	/**
	 * Getter e Setter
	 * @return
	 */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoDTO other = (ProdutoDTO) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
	
}
