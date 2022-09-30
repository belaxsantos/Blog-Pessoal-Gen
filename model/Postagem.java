package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

@Entity //criar um entidade, tabela
@Table(name = "tb_postagem") //cria nome da tabela
public class Postagem {
	
	@Id //vai ser a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Auto incremente 
	private Long id;// vai criar a varivel, e long vira bigint
	
	@NotBlank //quando é obrigatorio o usuario preencher o campo
	@Size(min = 5, max =50) //limitar quantidade de caracteres
	private String titulo;
	
	@NotBlank 
	@Size(min = 5, max =1000)
	private String texto;
	
	@UpdateTimestamp
	private LocalDateTime data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	
	
	

}
