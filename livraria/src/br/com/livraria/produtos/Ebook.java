package br.com.livraria.produtos;

import br.com.livraria.Autor;

public class Ebook extends Livro implements Promocional {

	private String waterMar;

	public Ebook(Autor autor) {
		super(autor);
	}
	
	public String getWaterMar() {
		return waterMar;
	}

	public void setWaterMar(String waterMar) {
		this.waterMar = waterMar;
	}

	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.15) {
			return false;
		}
		double desconto = this.getValor() * porcentagem;
		this.setValor(this.getValor() - desconto);
		System.out.println("aplicando desconto no Ebook");
		return true;
	}
	
	@Override
	public String toString() {
		return "Eu sou um Ebook";
	}
}
