package entities;

public class Item {
	public Integer quantidade ; 
	public Double precoUnitario ; 
	public String nome ; 
	
	public Item() {
	}
	
	public Item(Integer quantidade, Double precoUnitario, String nome) {
		this.quantidade = quantidade ; 
		this.precoUnitario = precoUnitario ; 
		this.nome = nome ; 
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade ; 
	}
	
	public Integer getQuantidade() {
		return this.quantidade ; 
	}
	
	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario ; 
	}
	
	public Double getPrecoUnitario() {
		return this.precoUnitario ; 
	}
	
	public void setNome(String nome) {
		this.nome = nome ; 
	}
	
	public String getNome() {
		return this.nome ; 
	}
}
