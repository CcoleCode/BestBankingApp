package com.account.bestbankingapp.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Checking extends Account {

	@Column
	private long debitCardNumber;
	@Column
	private int debitCardPin;

	public Checking() {
	}

	public Checking(String name, String SSN, double initDeposit) {
		super(name, SSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}

	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
	}

	@Override
	public String toString() {
		return "Checking [debitCardNumber=" + debitCardNumber + ", debitCardPin=" + debitCardPin + ", rate=" + rate
				+ ", accountNum=" + accountNum + "]";
	}

}
