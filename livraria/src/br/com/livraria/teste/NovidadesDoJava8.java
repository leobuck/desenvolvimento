package br.com.livraria.teste;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import br.com.livraria.Autor;
import br.com.livraria.produtos.Livro;
import br.com.livraria.produtos.LivroFisico;

public class NovidadesDoJava8 {
	
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		Livro javaoo = new LivroFisico(autor);
		javaoo.setNome("Java O. O.");
		
		Livro java8 = new LivroFisico(autor);
		java8.setNome("Java 8 Prático");
		
		Livro ruby = new LivroFisico(autor);
		ruby.setNome("Livro Ruby");
		
		List<Livro> livros = Arrays.asList(javaoo, java8, ruby);
		
		List<Livro> filtrados = new ArrayList<>();
		
		//Collections.sort(livros, new ComparadorPorNome());
		/*
		Collections.sort(livros, new Comparator<Livro>() {
			@Override
			public int compare(Livro l1, Livro l2) {
				return l1.getNome().compareTo(l2.getNome());
			}
		});
		*/
		/*
		livros.sort(new Comparator<Livro>() {
			@Override
			public int compare(Livro l1, Livro l2) {
				return l1.getNome().compareTo(l2.getNome());
			}
		});
		*/
		/*
		livros.sort((Livro l1, Livro l2) -> {
			return l1.getNome().compareTo(l2.getNome());
		});
		*/
		
		livros.sort(comparing(l -> l.getNome()));
		
		/*
		for (Livro livro: livros) {
			System.out.println(livro.getNome());
		}
		*/
		
		livros.forEach(l -> System.out.println(l.getNome()));
		
		for (Livro livro : livros) {
			if (livro.getNome().contains("Java")) {
				filtrados.add(livro);
			}
		}
		
		for (Livro livro : filtrados) {
			System.out.println(livro.getNome());
		}
		
		Stream<Livro> stream = livros.stream();
		
		livros.stream()
			.filter(l -> l.getNome().contains("Java"))
			.forEach(l -> System.out.println(l.getNome()));
		
	}
}

