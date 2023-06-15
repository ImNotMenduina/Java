package application;

import java.util.Scanner;

import entities.Aluno;
import entities.Nota;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ; 
		
		Integer n = 2 ; 
		
		Nota[] notas = new Nota[2] ; 
		
		notas[0].setData("06/11/21");
		notas[0].setNota(9.7);
		notas[1].setData("04/12/99");
		notas[1].setNota(7.0);
		
		Aluno a1 = new Aluno("Joao" , 1234567230 , notas);
		
		
		a1.setNotas(notas) ; 
		
		sc.close(); 
	}

}
