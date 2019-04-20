package br.com.livraria.teste;

import br.com.livraria.Autor;
import br.com.livraria.produtos.Ebook;
import br.com.livraria.produtos.LivroFisico;

public class RegraDeDesconto {
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		
		/*
		MiniLivro livro = new MiniLivro(autor);
		livro.setValor(39.90);
		
		//System.out.println("Valor atual: " + livro.getValor());
		
		if (!livro.aplicaDescontoDe(0.3)) {
			System.out.println("Não pode aplicar desconto!");
		} else {
			System.out.println("Valor do livro com desconto: " + livro.getValor());
		}
		*/
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setValor(59.90);
		
		if (!fisico.aplicaDescontoDe(0.3)) {
			System.out.println("Desconto não pode ser maior do que 30%!");
		} else {
			System.out.println("Valor do livro com desconto: " + fisico.getValor());
		}
		
		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);
		
		if (!ebook.aplicaDescontoDe(0.15)) {
			System.out.println("Desconto não pode ser maior do que 15%!");
		} else {
			System.out.println("Valor do ebook com desconto: " + ebook.getValor());
		}
	}
}
