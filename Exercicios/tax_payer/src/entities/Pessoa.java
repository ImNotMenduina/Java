package entities;

public abstract class Pessoa {
	protected String nome ; 
	protected Double rendaAnual ; 
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, Double rendaAnual) {
		this.nome = nome ; 
		this.rendaAnual = rendaAnual ; 
	}
	
	public void setNome(String nome) {
		this.nome = nome ; 
	}
	
	public String getNome() {
		return this.nome ; 
	}
	
	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual ; 
	}
	
	public Double getRendaAnual() {
		return this.rendaAnual ; 
	}
	
	//This class has a abstract method
	//The class needs to become abstract either
	public abstract Double impostoPago() ; 
}
