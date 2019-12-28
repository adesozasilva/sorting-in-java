package br.com.adesozasilva.model;

import br.com.adesozasilva.Sortable;

public class Produto implements Sortable {

	private String nome;
	private double preco;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}

	@Override
	public boolean compare(Object outro) {
		Produto outroProduto = (Produto) outro;
		return this.getPreco() > outroProduto.getPreco();
	}
	
	@Override
	public String toString() {
		return this.getNome() + " " + getPreco();
	}
	
	

}
