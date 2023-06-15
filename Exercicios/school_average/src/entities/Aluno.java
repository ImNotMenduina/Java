package entities;

public class Aluno extends Pessoa{
	private Double nota1 ; 
	private Double nota2 ; 
	private Double nota3 ; 
	private Double nota4 ; 
	private boolean aprovado ; 
	
	public Aluno() {
	}
	
	public Aluno(String nome, char sexo, Integer idade, 
			Double nota1, Double nota2, Double nota3, Double nota4) {
		super(nome, sexo, idade) ; 
		this.nota1 = nota1 ; 
		this.nota2 = nota2 ; 
		this.nota3 = nota3 ; 
		this.nota4 = nota4 ; 
		//this.aprovado = aprovado ; 
	}
	
	public void setNota1(Double nota1) {
		this.nota1 = nota1 ; 
	}
	
	public Double getNota1() {
		return this.nota1 ;
	}
	
	public void setNota2(Double nota2) {
		this.nota2 = nota2 ; 
	}
	
	public Double getNota2() {
		return this.nota2 ; 
	}
	
	public void setNota3(Double nota3) {
		this.nota3 = nota3 ; 
	}
	
	public Double getNota3() {
		return this.nota3 ; 
	}
	
	public void setNota4(Double nota4) {
		this.nota4 = nota4 ; 
	}
	
	public Double getNota4() {
		return this.nota4 ; 
	}
	
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado ; 
	}
	
	public boolean getAprovado() {
		return this.aprovado ; 
	}
	
	public void responderChamada() {
		System.out.printf("O aluno %s está presente!" , this.getNome()) ; 
	}
	
	public void atestadoAluno() {
		System.out.println("-----ATESTADO DO ALUNO-----") ; 
		System.out.printf("Aluno : %s \n", this.getNome()) ; 
		System.out.printf("Nota 1 : %.2f \n", this.getNota1()) ;
		System.out.printf("Nota 2 : %.2f \n", this.getNota2()) ; 
		System.out.printf("Nota 3 : %.2f \n", this.getNota3()) ; 
		System.out.printf("Nota 4 : %.2f \n", this.getNota4()) ;
		
		if(this.aprovado == false) {
			System.out.println("Status : Reprovado \n") ; 
		}else {
			System.out.println("Status : Aprovado \n") ; 
		}
		System.out.println("---------------------------") ; 
	}
}
