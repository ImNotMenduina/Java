package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account (1001, "Alex" , 0.0) ; 
		BusinessAccount bacc = new BusinessAccount (1002 , "Maria" , 0.0 , 500.0) ; 
		
		//UPCASTING BusinessAccount --->> Account Sub to Class
		Account acc1 = bacc ; 
		//acc1.getBalance()// OK
		//Como visto em aula, uma BusinessAccount "É UM(A)" Account. 
		//Por isso o Upcasting funciona corretamente 
		//Uma "conta empresarial" É UMA "conta"
		Account acc2 = new BusinessAccount (1003, "Lucas", 0.0, 1000.0) ; 
		//Referenciar uma BusinessAccount à uma conta, também é possível por conta da herança
		Account acc3 = new SavingAccount(1004, "Valeria", 0.0, 0.01) ;
		//Referenciar uma SavingAccount à uma conta também é possível, por conta da herança
		
		
		//DOWNCASTING Class to Sub
		
		/*
		
		BusinessAccount acc4 = acc3 ; // Não é possível
		
		*/
		
		
		// Nada garante é uma account é uma BusinessAccount. Não é natural.
		// Para forçar esta conversão, é necessário realizar um casting manual 
		
		BusinessAccount acc4 = (BusinessAccount)acc2 ; 
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3 ; // DOWNCASTING NÃO PERMITIDO
	
		// Uma businessAccount NÃO É uma SavingsAccount. Dará erro ao compilar.
		
		//Como evitar o erro acima ? 
		//Testar (Instanceof)
		if(acc3 instanceof BusinessAccount)
		{
			BusinessAccount acc5 = (BusinessAccount)acc3 ; 
			acc5.loan(500.0);
			System.out.println("Loan!") ; 
		}
		
		if(acc3 instanceof SavingAccount)
		{
			SavingAccount acc5 = (SavingAccount)acc3 ; 
			acc5.updateBalance();
			System.out.println("Update!") ; 
		}
		
		
	}
	
	

}
