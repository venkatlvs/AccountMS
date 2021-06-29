package bank.AccountMS.entity;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="current")
public class Current {
	
	@Id
	@Column(name="CUSTOMERID",nullable=false)
	private int customerId;
	
	@Column(name="ACCOUNTNUMBER",nullable=false)
	private long accountNumber;
	
	@Column(name="ACCOUNT_TYPE",nullable=false)
	private String accountType;
	
	@Column(name="BEGINNINGBALANCE",nullable=false)
	private double beginningBalance;
	
	@Column(name="AVAILABLEBALANCE",nullable=false)
	private double availableBalance ;
	
	@Column(name="DUEAMOUNT",nullable=false)
	private double dueAmount;
	
	@Column(name="PAYMENT_DUE_DATE",nullable=false)
	private Date paymentDueDate;
	
	@Column(name="OUTSTANDINGBALANCE",nullable=false)
	private double outstandingBalance;
	
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

	public double getBeginningBalance() {
		return beginningBalance;
	}

	public void setBeginningBalance(double beginningBalance) {
		this.beginningBalance = beginningBalance;
	}

	public double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}

	public double getDueAmount() {
		return dueAmount;
	}

	public void setDueAmount(double dueAmount) {
		this.dueAmount = dueAmount;
	}

	public Date getPaymentDueDate() {
		return paymentDueDate;
	}

	public void setPaymentDueDate(Date paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
	}

	public double getOutstandingBalance() {
		return outstandingBalance;
	}

	public void setOutstandingBalance(double outstandingBalance) {
		this.outstandingBalance = outstandingBalance;
	}

}
