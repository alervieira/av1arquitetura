package br.com.mat.lojadecarros.principal;

import br.com.mat.lojadecarros.sistema.MantemCarro;
import br.com.mat.lojadecarros.sistema.MantemMotocicleta;

public class Principal {

	public static void main(String[] args) {

		MantemCarro mantemCarro = new MantemCarro();
		mantemCarro.adicionarCarro();		
		mantemCarro.listarEstoquedeCarros();
		mantemCarro.buscarCarro("12345sdf123sse");
		mantemCarro.pesquisarCarro("Gol");
		
		MantemMotocicleta mantemMotocicleta = new MantemMotocicleta();
		mantemMotocicleta.adicionarMoto();
		mantemMotocicleta.listarEstoquedeMotocicletas();
		mantemMotocicleta.buscarMotocicleta("123456789");
		mantemMotocicleta.pesquisarMoto("twister");
		
	}

}
