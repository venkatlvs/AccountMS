package bank.AccountMS.entity;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="credit")
public class Credit {
	
	@Id
	@Column(name="CUSTOMERID",nullable=false)
	private int customerId;
	
	@Column(name="ACCOUNTNUMBER",nullable=false)
	private BigInteger accountNumber;
	
	@Column(name="ACCOUNT_TYPE",nullable=false)
	private String accountType;
	
	@Column(name="AVAILABLE_BALANCE",nullable=false)
	private double availableBalance;
	
	@Column(name="INTEREST",nullable=false)
	private float interest;
	
	@Column(name="DUEAMOUNT",nullable=false)
	private double dueAmount;
	
	@Column(name="PAYMENT_DUE_DATE",nullable=false)
	private Date paymentDueDate;
	
	@Column(name="OUTSTANDINGBALANCE",nullable=false)
	private double outStandingBalance;
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public BigInteger getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(BigInteger accountNumber) {
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

	public float getInterest() {
		return interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
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

	public double getOutStandingBalance() {
		return outStandingBalance;
	}

	public void setOutStandingBalance(double outStandingBalance) {
		this.outStandingBalance = outStandingBalance;
	}


}
