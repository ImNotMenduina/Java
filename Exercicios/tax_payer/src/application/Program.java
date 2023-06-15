package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ; 
		
		System.out.println("Entre com o numero de pessoas : ") ; 
		Integer n ; 
		n = sc.nextInt() ; 
		sc.nextLine(); 
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>() ; 
		
		for(int i=0 ; i<n ; i++) {
			System.out.println("PF ou PJ ? (F/J) ") ; 
			char p ; 
			p = sc.next().charAt(0) ; 
			sc.nextLine();
			
			System.out.println("Nome : ") ;
			String nome ;
			nome = sc.nextLine(); 
			System.out.println("Renda : ") ; 
			Double renda; 
			renda = sc.nextDouble() ;  
			
			if(p == 'F') {
				System.out.println("Gastos : ") ; 
				Double gastosSaude ;
				gastosSaude = sc.nextDouble() ; 
				pessoas.add(new PessoaFisica(nome, renda, gastosSaude)) ;
			} else if(p == 'J') {
				System.out.println("Funcionarios : ") ; 
				Integer funcionarios ;
				funcionarios = sc.nextInt() ; 
				pessoas.add(new PessoaJuridica(nome, renda, funcionarios)) ;
			}
		}
		
		Double impostoTotal = 0.0 ; 
		for(Pessoa p : pessoas) {
			System.out.printf("%s : $ %.2f \n", p.getNome(), p.impostoPago()) ; 
			impostoTotal += p.impostoPago() ; 
		}
		
		System.out.printf("TOTAL : %.2f \n" , impostoTotal) ; 
		
		sc.close() ; 
	}

}
