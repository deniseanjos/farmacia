package com.generation.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	//Determina primary key e informa que é gerado automaticamente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	public long id;
	
	//Informa que não pode ficar em branco e delimita o tamanho
	@NotNull
	@Size(min = 5, max = 100)
	public String nomeProduto;
	
	
	@NotNull
	@Size(min = 10, max = 500)
	public String descricaoProduto;
	
	@NotNull
	public float precoProduto;
	
	//Define foreign key e informa a que existem varios produtos para uma categoria 
	@ManyToOne
	@JsonIgnoreProperties("Produto")
	private Categoria categoria;	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(float precoProduto) {
		this.precoProduto = precoProduto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	

}
