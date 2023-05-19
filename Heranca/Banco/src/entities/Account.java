package entities;

public class Account {
	protected Integer number ; 
	protected String holder ;
	protected Double balance ; 
	
	public Account(){
	}
	
	public Account(Integer number , String holder , Double balance)
	{
		this.number = number ; 
		this.holder = holder ; 
		this.balance = balance ; 
	}
	// Account Number
	public void setNumber(Integer number) {
		this.number = number ; 
	}
	public Integer getNumber() {
		return this.number ; 
	}
	
	// Account Owner
	public void setHolder(String holder) {
		this.holder = holder ; 
	}
	public String getHolder()
	{
		return this.holder ; 
	}
	
	// Account Balance
	public Double getBalance()
	{
		return this.balance ; 
	}
	
	// Withdraw
	public void withdraw(double amount) {
		this.balance -= amount ; 
	}
	// Deposit 
	public void deposit(double amount) {
		this.balance += amount ; 
	}
}
