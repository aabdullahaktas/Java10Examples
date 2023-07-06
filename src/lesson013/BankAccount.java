package lesson013;
/*
 * bir interest rate account number birde balance ozelliklerim var
 * 
 * simdi bu sınıfı soyutlamanızı istiyorum bizim bankamızın faiz oranı 0.05 olsun 
 * 
 * daha sonra faiz getirisini hesaplayan bir metod yazalım getInterestRate ==>
 * 
 * bir de getInformation metodu hesap bilgilerimizi gosterelim
 * 
 */

public class BankAccount {
	
	private double balance;
	static double interestRate;
	private String accountNumber;
	
	public BankAccount(String accountNumber,double balance) {
		
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	public BankAccount(String accountNumber) {
		this.accountNumber=accountNumber;
		this.balance=100;
	}
	public BankAccount() {
		balance = 100;
	}
	
	public void getInformation() {
		
		System.out.println("hesapnumarsı= "+accountNumber);
		System.out.println("hesapbakiyesi= " + balance);
		System.out.println("faiz oranı= " + interestRate);
		System.out.println("faiz getirisi= " + getInterestRate());
	}
	public double getInterestRate() {
		return balance * interestRate;
	}
	
	public double getBalance() {
		return balance; 
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber=accountNumber;
	}
	
	
}
