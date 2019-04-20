package br.com.livraria;

import java.util.ArrayList;
import java.util.List;

import br.com.livraria.produtos.Produto;

public class CarrinhoDeCompras {
	
	private double total;
	private List<Produto> produtos;

	public CarrinhoDeCompras() {
		this.produtos = new ArrayList<>();
	}
	
	public void adiciona(Produto produto) {
		this.produtos.add(produto);
	}

	public void remove(int posicao) {
		this.produtos.remove(posicao);
	}
	
	public double getTotal() {
		return total;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

}
