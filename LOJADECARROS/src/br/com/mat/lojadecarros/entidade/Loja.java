package br.com.mat.lojadecarros.entidade;

import java.util.ArrayList;

public class Loja {
	
	String nome;
	String endereco;
	ArrayList<Carro> estoquedeCarros;
	ArrayList<Motocicleta> estoquedeMotos;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}		
	
	public ArrayList<Carro> getEstoquedeCarros() {
		return estoquedeCarros;
	}

	public void setEstoquedeCarros(ArrayList<Carro> estoquedeCarros) {
		this.estoquedeCarros = estoquedeCarros;
	}

	public ArrayList<Motocicleta> getEstoquedeMotos() {
		return estoquedeMotos;
	}

	public void setEstoquedeMotos(ArrayList<Motocicleta> estoquedeMotos) {
		this.estoquedeMotos = estoquedeMotos;
	}

	
	
	
}
