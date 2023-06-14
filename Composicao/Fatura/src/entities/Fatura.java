package entities;

import java.util.ArrayList;
import java.util.List;

public class Fatura {
	public String nome ; 
	public String cpf ; 
	
	public Fatura() {
	}
	
	public Fatura(String nome, String cpf) {
		this.nome = nome ; 
		this.cpf = cpf ; 
	}
	
	List<Item> ItemList = new ArrayList<Item>() ; 
	
	public void adicionaItem(Integer i , Item item) {
		for(int j=0 ; j<i ; j++) {
			ItemList.add(item) ; 
		}
	}
	
	public Double obtemPreco() {
		
		Double preco = 0.0 ; 
		
		for(Item item : ItemList) {
			preco += item.getPrecoUnitario() ; 
		}
		
		return preco ; 
	}
	
	public void setNome(String nome) {
		this.nome = nome ; 
	}
	
	public String getNome() {
		return this.nome ;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf ; 
	}
	
	public String getCpf() {
		return this.cpf ; 
	}
}
