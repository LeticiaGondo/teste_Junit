package br.com.caelum.leilao.dominio;

public class Usuario {

	private int id;
	private String nome;
	private String sobrenome;

	
public Usuario (int id){
	this.id = id;
}
public Usuario (String nome) {
	this.nome = nome;
}
	public Usuario(int id, String nome) {
		this.id = id;
		this.nome = nome;


	}
	public Usuario(int id, String nome, String sobrenome) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;

	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {return sobrenome;}
	
}
