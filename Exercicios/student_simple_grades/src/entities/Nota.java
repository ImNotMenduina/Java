package entities;

public class Nota {
	private String data ; 
	private Double nota ; 
	
	public Nota(){
	}
	
	public Nota(String data, Double nota) {
		this.data = data ; 
		this.nota = nota ; 
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}
}
