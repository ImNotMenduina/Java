package entities;

public class PessoaJuridica extends Pessoa{
	private Integer numeroFuncionarios ; 
	
	public PessoaJuridica() {
	}
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual); 
		this.numeroFuncionarios = numeroFuncionarios ; 
	}
	
	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios ; 
	}
	
	public Integer getNumeroFuncionarios() {
		return this.numeroFuncionarios ; 
	}
	
	public Double impostoPago() {
		if(numeroFuncionarios > 10) {
			return rendaAnual*0.14 ; 
		}
		return rendaAnual*0.16 ; 
	}
}
