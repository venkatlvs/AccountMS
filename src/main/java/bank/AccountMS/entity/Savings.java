package bank.AccountMS.entity;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="savings")
public class Savings {
	@Id
	@Column(name="CUSTOMERID",nullable=false)
	private int customerId;
	
	@Column(name="ACCOUNTNUMBER",nullable=false)
	private long accountNumber;
	
	@Column(name="ACCOUNT_TYPE",nullable=false)
	private String accountType;
	
	@Column(name="AVAILABLE_BALANCE",nullable=false)
	private double availableBalance;
	
	@Column(name="LAST_TRANSACTION_DATE",nullable=false)
	private Date lastTransactionDate;
	
	@Column(name="INTEREST",nullable=false)
	private int interest;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}

	public Date getLastTransactionDate() {
		return lastTransactionDate;
	}

	public void setLastTransactionDate(Date lastTransactionDate) {
		this.lastTransactionDate = lastTransactionDate;
	}

	public int getInterest() {
		return interest;
	}

	public void setInterest(int interest) {
		this.interest = interest;
	}
}
