package br.com.crud.desafiocrud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produtos")
public class ProdutoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String categoria;
	@Column(nullable = false)
	private String marca;
	@Column(nullable = false)
	private Double preco;
	
	
	/**
	 * Construtores	
	 */
	
	public ProdutoEntity() {
	}
/**
 * Getter & Setter
 */
	
	
	
}
