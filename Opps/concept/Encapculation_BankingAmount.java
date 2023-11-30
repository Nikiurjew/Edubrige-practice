package Opps.concept;

import java.util.Scanner;

class Details{
	
	private long accountNo;
	private String bankName;
	private double balance;
	
	
	
	
	
	
	public Details(long accountNo, String bankName, double balance) {
		super();
		this.accountNo = accountNo;
		this.bankName = bankName;
		this.balance = balance;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	
	public double getBalance() {
		return balance;
	}

	public double setBalance(double balance) {
		return this.balance = balance;
	}

	public void Withdrawal(double balance,int wamount) {
		if (balance > wamount) {
			balance-=wamount;
			System.out.println("withdrawal succesfull : "+balance);
		}
		else {
			System.out.println("insufficient bal.");
		}
	}
	public void Deposit(double balance,int dAmount) {
		balance+=dAmount;
		System.out.println(" new bal:"+balance);
	}
	
}


public class Encapculation_BankingAmount {

	public static void main(String[] args) {
		
		 Details ob = new Details(123456,"SBI",5000);
	        System.out.println("initial balance "+ob.getBalance());
	        
	        System.out.println();
	        
    }
		
		

	}


