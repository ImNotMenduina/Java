package entities;

public class SavingsAccount extends Conta{
	private Double interestRate ; 
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance) ; 
		this.interestRate = interestRate ; 
	}
	
	public void updateBalance() {
		this.balance += this.balance * interestRate ; 
	}
	
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate ; 
	}
	
	public Double getInterestRate() {
		return this.interestRate ; 
	}
}
