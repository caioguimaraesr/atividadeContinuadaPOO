package br.edu.cs.poo.ac.ordem.entidades;

public enum Dificuldade {
	NORMAL(1,"Normal"),
	DIFICIL(2,"Dificil");
	
	private int codigo;
	private String nome;
	
	private Dificuldade(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public int getCodigo(Dificuldade dificuldade) {
		return codigo;
	}
	
	public String getNome(Dificuldade dificuldade) {
		return nome;
	}
	

}