package br.com.mat.lojadecarros.sistema;

import java.util.ArrayList;

import br.com.mat.lojadecarros.entidade.Carro;
import br.com.mat.lojadecarros.entidade.Loja;

public class MantemCarro {
	
	Loja loja = new Loja();	
	
	public void adicionarCarro(){
		
		System.out.println("###Método Adicionar Carro###");
		
		Carro novoCarro;
		novoCarro = new Carro();
		
		ArrayList<Carro> carros = new ArrayList<>();
		
		novoCarro.setCambio("manual");		
		novoCarro.setChassi("12121asa323asa");		
		novoCarro.setCor("branco");	
		novoCarro.setModelo("Uno");	
		novoCarro.setMontadora("Fiat");	
		novoCarro.setMotorizacao(1.0F);	
		novoCarro.setPreco(30.000F);	
		novoCarro.setTipo("Hatch");
				
		carros.add(novoCarro);			
		
		Carro novoCarro2;
		novoCarro2 = new Carro();
		
		novoCarro2.setCambio("manual");		
		novoCarro2.setChassi("12121asa323asa");		
		novoCarro2.setCor("branco");	
		novoCarro2.setModelo("Gol");	
		novoCarro2.setMontadora("Volkswagen");	
		novoCarro2.setMotorizacao(1.0F);	
		novoCarro2.setPreco(30.000F);	
		novoCarro2.setTipo("Hatch");		
			
		carros.add(novoCarro2);	
		
		Carro novoCarro3;
		novoCarro3 = new Carro();
		
		novoCarro3.setCambio("manual");		
		novoCarro3.setChassi("12345sdf123sse");		
		novoCarro3.setCor("branco");	
		novoCarro3.setModelo("KA");	
		novoCarro3.setMontadora("Ford");	
		novoCarro3.setMotorizacao(1.0F);	
		novoCarro3.setPreco(30.000F);	
		novoCarro3.setTipo("Hatch");		
			
		carros.add(novoCarro3);			
		
		loja.setEstoquedeCarros(carros);		
						
	}
	
	public void listarEstoquedeCarros(){
		
		System.out.println("###Método Listar Carro###");
		
		ArrayList<Carro> carro = loja.getEstoquedeCarros();
		
		  for (int i = 0; i < carro.size(); i++) {
			  
				  System.out.println(carro.get(i).getModelo());  			  
			    
		   }			
		
	}
	
	public void buscarCarro(String chassi){
		
		System.out.println("###Método Buscar Carro###");
		
		ArrayList<Carro> carro = loja.getEstoquedeCarros();
		int quantidadeCarrosEncontrados = 0;
		
		 for (int i = 0; i < carro.size(); i++) {
			 
			 if(carro.get(i).getChassi() == chassi){	
				 quantidadeCarrosEncontrados++;
				 System.out.println(carro.get(i).getMontadora()+" - "+carro.get(i).getModelo()+" - "+carro.get(i).getCor());				 				
			 }			 			 
		 
		 }
		 
		 System.out.println("Foram encontrados "+quantidadeCarrosEncontrados+" carro(s) com o chassi passado.");				
	}
	
	public void pesquisarCarro(String modelo){
		
		System.out.println("###Método Pesquisar Carro###");
		
		ArrayList<Carro> carro = loja.getEstoquedeCarros();
		
		 for (int i = 0; i < carro.size(); i++) {
			 
			 if(carro.get(i).getModelo() == modelo){				 
				 System.out.println(carro.get(i).getModelo());				 				
			 }
		 
		 }		
		
	}
				
}