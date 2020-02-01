package br.com.caelum.ingresso.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DetalhesDoFilme {
	@JsonProperty("Title")
	private String titulo;
	
	@JsonProperty("Year")
	private String ano;
	
	@JsonProperty("Poster")
	private String imagem;
	
	@JsonProperty("Director")
	private String diretor;
	
	@JsonProperty("Writer")
	private String escritores;
	
	@JsonProperty("Actors")
	private String atores;
	
	@JsonProperty("Plot")
	private String descricao;
	
	@JsonProperty("Reting")
	private Double avaliacao;
}
