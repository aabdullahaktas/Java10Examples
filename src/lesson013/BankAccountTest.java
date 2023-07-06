package lesson013;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount.interestRate = 0.05;
		BankAccount bankAccount1 = new BankAccount("456",5);
		//bankAccount1.accountNumber="123";
		//bankAccount1.balance = 1258.50;
		bankAccount1.getInformation();
		
		BankAccount bankAccount2 = new BankAccount("1456",5);
		bankAccount2.setAccountNumber("456");
		bankAccount2.setBalance(5464651.50);
		bankAccount2.getInformation();
		
		
		BankAccount bankAccount3= new BankAccount("123", 1563);
		bankAccount1.getInformation();
		
		BankAccount bankAccount4 = new BankAccount("4513");
		bankAccount4.getInformation();
		

		BankAccount bankAccount5 = new BankAccount("fd",5153);
		bankAccount5.getBalance();
		
		System.out.println(bankAccount5.getBalance());
		System.out.println(bankAccount5.getAccountNumber());
		
		
	}

}
