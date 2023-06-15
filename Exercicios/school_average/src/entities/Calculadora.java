package entities;

public class Calculadora {
	private Integer resultadoInt ;
	private Double resultadoReal ; 
	
	public Calculadora(){
	}
	
	public Integer Soma(Integer a, Integer b)
	{
		this.resultadoInt = (a + b) ; 
		return resultadoInt ; 
	}
	
	public Double Soma(Double a, Double b)
	{
		this.resultadoReal = (a + b) ; 
		return resultadoReal ; 
	}
	
	public Integer Subtracao(Integer a, Integer b)
	{
		this.resultadoInt = (a - b) ; 
		return resultadoInt ; 
	}
	
	public Double Subtracao(Double a, Double b)
	{
		this.resultadoReal = (a - b) ; 
		return resultadoReal ; 
	}
	
	public Integer Multiplicacao(Integer a, Integer b)
	{
		this.resultadoInt = (a * b) ; 
		return resultadoInt ; 
	}
	
	public Double Multiplicacao(Double a, Double b)
	{
		this.resultadoReal = (a * b) ; 
		return resultadoReal ; 
	}
	
	public Integer Divisao(Integer a, Integer b)
	{
		this.resultadoInt = (a / b) ; 
		return resultadoInt ; 
	}
	
	public Double Divisao(Double a, Double b)
	{
		this.resultadoReal = (a / b) ; 
		return resultadoReal ; 
	}
	
	public Double getResultadoReal() {
		return this.resultadoReal ; 
	}
	
	public void setResultadoReal(Double resultadoReal) {
		this.resultadoReal = resultadoReal ; 
	}
	
	public Integer getResultadoInt() {
		return this.resultadoInt ; 
	}
	
	public void setResultadoInt(Integer resultadoInt) {
		this.resultadoInt = resultadoInt ;
	}
}
