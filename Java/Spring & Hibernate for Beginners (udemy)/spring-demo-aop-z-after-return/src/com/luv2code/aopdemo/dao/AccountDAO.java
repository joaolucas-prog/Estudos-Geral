package com.luv2code.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {
	
	private String name;
	private String serviceCode;
	
	public List<Account> findAccount(){
		List<Account> myaccounts = new ArrayList<>();
		
		Account temp1 = new Account("John","Silver");
		Account temp2 = new Account("Madhu","gOLD");
		Account temp3 = new Account("Luca","Platinum");
		
		myaccounts.add(temp1);
		myaccounts.add(temp2);
		myaccounts.add(temp3);

		return myaccounts;
	}

	public void addAccount(Account theAccount, boolean vipFlat){
		System.out.println(getClass()+ " DOING MY DB WORK: ADDING AN ACCOUNT");
	}
	
	public boolean doWork() {
		System.out.println("Metodo doWord()");
		return false;
	}

	public String getName() {
		System.out.println();
		return name;
	}

	public void setName(String name) {
		System.out.println();
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println();
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println();
		this.serviceCode = serviceCode;
	}
	
	
}
