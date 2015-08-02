package br.com.mat.lojadecarros.sistema;

import java.util.ArrayList;

import br.com.mat.lojadecarros.entidade.Loja;
import br.com.mat.lojadecarros.entidade.Motocicleta;

public class MantemMotocicleta {
	
	Loja loja = new Loja();
	
	public void adicionarMoto(){

		System.out.println("###Método Adicionar Moto###");
		
		Motocicleta novaMoto;
		novaMoto = new Motocicleta();
		ArrayList<Motocicleta> motocicletas = new ArrayList<>();
		
		novaMoto.setCapacidadedoTanque(10);
		novaMoto.setChassi("123456789");
		novaMoto.setCilindrada(125);
		novaMoto.setCor("azul");
		novaMoto.setModelo("twister");
		novaMoto.setMontadora("Honda");
		novaMoto.setPreco(10.000F);
		novaMoto.setTipo("street");
						
		motocicletas.add(novaMoto);
		
		loja.setEstoquedeMotos(motocicletas);
	}
	
		public void listarEstoquedeMotocicletas(){
			
			System.out.println("###Método Listar Motocicleta###");
				
				ArrayList<Motocicleta> motocicleta = loja.getEstoquedeMotos();
				
				  for (int i = 0; i < motocicleta.size(); i++) {					  
						  System.out.println(motocicleta.get(i).getModelo());  			  					    				
				  }
		} 
		
		public void buscarMotocicleta(String chassi){
				System.out.println("###Método Buscar Motocicleta###");
				
				ArrayList<Motocicleta> motocicleta = loja.getEstoquedeMotos();
				int quantidadeMotosEncontradas = 0;
			
				for (int i = 0; i < motocicleta.size(); i++) {
				 
					 if(motocicleta.get(i).getChassi() == chassi){	
						 quantidadeMotosEncontradas++;
						 System.out.println(motocicleta.get(i).getMontadora()+" - "+motocicleta.get(i).getModelo()+" - "+motocicleta.get(i).getCor());	
					 }					 					 
			 
				}
				
				System.out.println("Foram encontradas "+quantidadeMotosEncontradas+" moto(s) com o chassi passado.");
		}
		
		public void pesquisarMoto(String modelo){
			System.out.println("###Método Pequisar Moto###");
			
			ArrayList<Motocicleta> motocicleta = loja.getEstoquedeMotos();
			
			 for (int i = 0; i < motocicleta.size(); i++) {
				 
				 if(motocicleta.get(i).getModelo() == modelo){				 
					 System.out.println(motocicleta.get(i).getModelo());				 				
				 }
			 
			 }		
			
		}		
		
}