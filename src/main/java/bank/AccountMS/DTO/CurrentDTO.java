package bank.AccountMS.DTO;


import java.util.Date;

import javax.persistence.Column;

import bank.AccountMS.entity.Credit;
import bank.AccountMS.entity.Current;

public class CurrentDTO {
	
    private int customerId;
	private long accountNumber;
	private String accountType;
	private double beginningBalance;
	private double availableBalance ;
    private double dueAmount;
	private Date paymentDueDate;
    private double outstandingBalance;
    
	public CurrentDTO() {
		super();
		
	}

	public CurrentDTO(int customerId, long accountNumber, String accountType, double beginningBalance,
			double availableBalance, double dueAmount, Date paymentDueDate, double outstandingBalance) {
		super();
		this.customerId = customerId;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.beginningBalance = beginningBalance;
		this.availableBalance = availableBalance;
		this.dueAmount = dueAmount;
		this.paymentDueDate = paymentDueDate;
		this.outstandingBalance = outstandingBalance;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
	
	//converts entity into DTO
		public static CurrentDTO valueOf(Current current) {
			CurrentDTO currentDTO=new CurrentDTO();
			currentDTO.setCustomerId(current.getCustomerId());
			currentDTO.setAccountNumber(current.getAccountNumber());
			currentDTO.setAccountType(current.getAccountType());
			currentDTO.setAvailableBalance(current.getAvailableBalance());
			currentDTO.setBeginningBalance(current.getBeginningBalance());
			currentDTO.setDueAmount(current.getDueAmount());
			currentDTO.setPaymentDueDate(current.getPaymentDueDate());
			currentDTO.setOutstandingBalance(current.getOutstandingBalance());
			
			return currentDTO;
			
		}
	
	
	@Override
	public String toString() {
		return "CurrentDTO [customerId=" + customerId + ", accountNumber=" + accountNumber + ", accountType="
				+ accountType + ", beginningBalance=" + beginningBalance + ", availableBalance=" + availableBalance
				+ ", dueAmount=" + dueAmount + ", paymentDueDate=" + paymentDueDate + ", outstandingBalance="
				+ outstandingBalance + "]";
	}
	
	

}
