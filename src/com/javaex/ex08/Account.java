package com.javaex.ex08;

import com.javaex.ex06.CConverter;

public class Account {

    private String accountNo;
    private int balance;
    
  
    
    //생성자 작성
    public Account() {}
    public Account(String accountNo) {}
    public Account(int balance) {}
    public Account(String accountNo, int balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
    
    
    

    //필요한 메소드 작성
    
    public String getAccountNo() {
		return accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
    
    
    //
	public static int money;
    
	public static void setMoney(int money){
        Account.money = money;
    }
	
	
    //
	public void deposit(int d) {}
	public void withdraw(int w) {}
	public void showBalance() {
		
	}

    

}
