package entities;

import java.util.Scanner;

public class Turma {
	Scanner sc = new Scanner(System.in) ; 
	
	private Aluno[] Alunos ; // type[] name
	
	public Turma(int quantidade) {
		this.Alunos = new Aluno[quantidade] ; 
	}
	
	public void instAlunos() {
		for(int i=0 ; i<Alunos.length ; i++) {
			Double nota1, nota2, nota3, nota4 ; 
			String nome ; 
			Integer idade ; 
			char sexo ; 
			
			System.out.println("Nome : ") ; 
			nome = sc.nextLine() ; 
			System.out.println("Idade : ") ; 
			idade = sc.nextInt() ; 
			System.out.println("Sexo (M/F/O) : ") ; 
			sexo = sc.next().charAt(0) ; 
			System.out.println("Nota1 Nota2 Nota3 Nota4 : ") ; 
			nota1 = sc.nextDouble() ; 
			nota2 = sc.nextDouble() ; 
			nota3 = sc.nextDouble() ; 
			nota4 = sc.nextDouble() ; 
			
			Alunos[i] = new Aluno(nome, sexo, idade, nota1, nota2, nota3 , nota4) ; 
		}
	}
	public Aluno[] getAlunos() {
		return Alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		Alunos = alunos;
	}
}
