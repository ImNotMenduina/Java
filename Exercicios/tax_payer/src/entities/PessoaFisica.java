package entities;

public class PessoaFisica extends Pessoa{
	private Double gastosSaude ; 
	
	public PessoaFisica() {
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual) ; 
		this.gastosSaude = gastosSaude ; 
	}

	@Override
	public Double impostoPago() {
		Double impostoPago = 0.0; 
		
		if(this.rendaAnual < 2000.0) {
			impostoPago = rendaAnual*0.15 ; 
		} else {
			impostoPago = rendaAnual*0.25 ; 
		}
		
		if(gastosSaude > 0.0) {
			impostoPago -= gastosSaude*0.5 ; 
		}
		return impostoPago ;
	}
	
	
}
