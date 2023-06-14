package application;

import entities.BusinessAccount;
import entities.Conta;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Conta acc = new Conta(1001, "Alex" , 0.0) ; 
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0) ; 
		
		//UPCASTING BusinessAccount -> Account
		
		Conta acc1 = bacc ; // Subclass to SuperClass. BusinessAccount is a Account, because it extends Account. Thats why they have attributes and methods in common.
		Conta acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0) ;	
		Conta acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01) ; 
		
		//DOWNCASTING SuperClass -> Subclass 
		
		/*
		BusinessAccount bacc2 = acc2 ; // In this case we don't know if the content of acc2 is a BusinessAccount. Nothing is guaranteed.
		*/
		// We need to cast manually acc2 to BusinessAccount
		BusinessAccount bacc2 = (BusinessAccount)acc2 ; 
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3 ; 
			acc5.updateBalance(); 
			System.out.println("Updated!") ;  
		}
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc6 = (BusinessAccount)acc3 ;
			acc6.loan(200.0);
			System.out.println("Loan!") ; 
		}
	}

}
