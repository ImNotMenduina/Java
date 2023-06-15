package entities;

public class Pessoa {
	protected String nome ; 
	protected char sexo ;
	protected Integer idade ; 
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, char sexo, Integer idade) {
		this.nome = nome ; 
		this.sexo = sexo ; 
		this.idade = idade ; 
	}
	
	public void setNome(String nome) {
		this.nome = nome ; 
	}
	
	public String getNome() {
		return this.nome ; 
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo ; 
	}
	
	public char getSexo() {
		return this.sexo ; 
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade ; 
	}
	
	public Integer getIdade() {
		return this.idade ; 
	}
}









