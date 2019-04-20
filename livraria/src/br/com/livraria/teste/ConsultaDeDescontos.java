package br.com.livraria.teste;

public class ConsultaDeDescontos {
	
	public static void main(String[] args) {
		
		GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();
		
		Double desconto = gerenciador.validaCupom("cab11");
		
		if (desconto != null) {
			System.out.println("Cupom de desconto válido!");
			System.out.println("Valor: " + desconto);
		} else {
			System.out.println("Esse cupom não existe!");
		}
	}
}
