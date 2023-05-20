package entities;

public class Onibus {
	private int lotacao ; 
	private double peso ; 
	
	public Onibus(int lotacao , double peso) {
		this.lotacao = lotacao ; 
		this.peso = peso ; 
	}
	
	public void setLotacao(int lotacao) {
		this.lotacao = lotacao ; 
	}
	
	public void setPeso(double peso) {
		this.peso = peso ; 
	}
	
	public double getPeso() {
		return this.peso ; 
	}
	public int getLotacao() {
		return this.lotacao ; 
	}
	
}
