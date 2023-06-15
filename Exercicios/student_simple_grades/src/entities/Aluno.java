package entities;

import java.util.Scanner;

public class Aluno extends Pessoa{
	Scanner sc = new Scanner(System.in) ; 
	
	private Nota[] notas ; 
	
	public Aluno() {
	}
	
	public Aluno(String nome, Integer cpf, Integer n) {
		super(nome, cpf) ; 
		this.notas = new Nota[n] ; 
	}
	
	public Aluno(String nome, Integer cpf, Nota[] notas) {
		super(nome, cpf) ; 
		this.notas = new Nota[notas.length] ; 
		this.notas = notas ; 
	}

	public Nota[] getNotas() {
		return notas;
	}

	public void setNotas(Nota[] notas) {
		this.notas = notas;
	}
	
	public void addNotas() {
		Integer n_notas ; 
		System.out.println("Insira o numero de notas : ") ; 
		n_notas = sc.nextInt() ; 
		
		for(int i=0 ; i<n_notas ; i++) {
			System.out.println("Insira \\NOTA\\DATA\\ : ") ; 
			this.notas[i] = new Nota(sc.nextLine(), sc.nextDouble());
		}
	}
}
