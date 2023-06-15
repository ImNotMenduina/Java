package application;

import java.util.Scanner;

import entities.Fatura;
import entities.Item;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ; 
		
		Fatura fat = new Fatura("Lucas" , "999.888.555-44") ; 
		
		int ctnue = 1 ; 
		System.out.println("MENU \n") ; 
		
		while(ctnue == 1) {
			System.out.println("1 - Adicionar Item Ao Carrinho \n") ; 
			System.out.println("2 - Obter Fatura \n") ;
			System.out.println("3 - Terminar Programa \n") ; 
			System.out.println(">") ; 
			
			int op ; 
			op = sc.nextInt(); 
			
			switch(op) {
			case 1:
				int quantidade ; 
				String nome ; 
				Double preco ; 
				
				System.out.println("Quantidade : ") ; 
				quantidade = sc.nextInt(); 
				sc.nextLine() ; 
				
				System.out.println("Nome : ") ; 
				nome = sc.nextLine() ; 
				
				System.out.println("Preco Unitario : ") ; 
				preco = sc.nextDouble() ;
				
				Item item = new Item(quantidade, preco , nome) ;
				fat.adicionaItem(item.getQuantidade(), item);
				
				System.out.println("Item faturado com sucesso !") ; 
				
				break ; 
			case 2:
				System.out.println("-----------FATURA---------- \n") ;
				
				Double total = fat.obtemPreco() ; 
				System.out.printf("Comprador : %s \n", fat.getNome()) ;
				System.out.printf("cpf : %s \n", fat.getCpf()) ; 
				System.out.printf("Fatura : %.2f \n" , total) ; 
				System.out.println() ;
				 
				System.out.println("--------------------------- \n") ; 
				break ; 
			
			case 3:
				ctnue = 0 ; 
				break ; 
			}
		}
		
	}

}
