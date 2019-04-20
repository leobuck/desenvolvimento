package br.com.livraria.produtos;

import br.com.livraria.Autor;
import br.com.livraria.exception.AutorNuloException;

public abstract class Livro implements Produto {
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
	public Livro() {
		this.isbn = "000-00-00000-00-0";
	}
	
	public Livro(Autor autor) {
		//System.out.println("Novo livro criado!");
		
		if (autor == null) {
			throw new AutorNuloException("O autor do livro não pode ser nulo");
		}
		this.autor = autor;
		this.isbn = "000-00-00000-00-0";
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public void mostrarDetalhes() {
		System.out.println("*** Mostrando detalhes do livro ***");
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);
		
		if (this.temAutor()) {
			autor.mostrarDetalhes();	
		}		
		
		System.out.println("***********************************");
		System.out.println("");
	}
	
	public boolean temAutor() {
		return this.autor != null;
	}
	
	@Override
	public int compareTo(Produto outro) {
		if (this.getValor() < outro.getValor()) {
			return -1;
		} 
		if (this.getValor() > outro.getValor()) {
			return 1;
		}
		return 0;
	}
}
