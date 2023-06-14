package entities;

public class Conta {
	protected Integer number ; 
	protected String holder ; 
	protected Double balance ; 
	
	public Conta() {
	}
	
	public Conta(Integer number, String holder, Double balance) {
		this.number = number ; 
		this.holder = holder ; 
		this.balance = balance ; 
	}
	
	public void setNumber(Integer number) {
		this.number = number ; 
	}
	
	public Integer getNumber() {
		return this.number ; 
	}
	
	public void setHolder(String holder) {
		this.holder = holder ; 
	}
	
	public String getHolder() {
		return this.holder ; 
	}
	
	public Double getBalance() {
		return this.balance ; 
	}
}
