package bank.AccountMS.DTO;

import java.math.BigInteger;
import java.util.Date;


import bank.AccountMS.entity.Credit;



public class CreditDTO {
	
    private int customerId;
	

	private BigInteger accountNumber;
	private String accountType;
	private double availableBalance;
	private float interest;
	
	private double dueAmount;
	private Date paymentDueDate;
	private double outStandingBalance;
	
	public CreditDTO() {
		super();
	}
	
	public CreditDTO(int customerId, BigInteger accountNumber, String accountType, double availableBalance,
			float interest, double dueAmount, Date paymentDueDate, double outStandingBalance) {
		this();
		this.customerId = customerId;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.availableBalance = availableBalance;
		this.interest = interest;
		this.dueAmount = dueAmount;
		this.paymentDueDate = paymentDueDate;
		this.outStandingBalance = outStandingBalance;
	}
	
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
	
	//converts entity into DTO
	public static CreditDTO valueOf(Credit credit) {
		CreditDTO creditDTO=new CreditDTO();
		creditDTO.setCustomerId(credit.getCustomerId());
		creditDTO.setAccountNumber(credit.getAccountNumber());
		creditDTO.setAccountType(credit.getAccountType());
		creditDTO.setAvailableBalance(credit.getAvailableBalance());
		creditDTO.setInterest(credit.getInterest());
		creditDTO.setDueAmount(credit.getDueAmount());
		creditDTO.setPaymentDueDate(credit.getPaymentDueDate());
		creditDTO.setOutStandingBalance(credit.getOutStandingBalance());
		return creditDTO;
		
	}

	@Override
	public String toString() {
		return "CreditDTO [customerId=" + customerId + ", accountNumber=" + accountNumber + ", accountType="
				+ accountType + ", availableBalance=" + availableBalance + ", interest=" + interest + ", dueAmount="
				+ dueAmount + ", paymentDueDate=" + paymentDueDate + ", outStandingBalance=" + outStandingBalance + "]";
	}
	
	
	
	


}
