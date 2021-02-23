package com.generation.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "categoria")
public class Categoria {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public long id;
	
	@NotNull
	@Size(min = 5, max = 100)
	public String nomeCategoria;
	
	public boolean ativoCategoria;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public boolean isAtivoCategoria() {
		return ativoCategoria;
	}

	public void setAtivoCategoria(boolean ativoCategoria) {
		this.ativoCategoria = ativoCategoria;
	}
	
	

}
