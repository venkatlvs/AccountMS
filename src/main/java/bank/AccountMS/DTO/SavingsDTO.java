package bank.AccountMS.DTO;


import java.util.Date;

import bank.AccountMS.entity.Savings;


public class SavingsDTO {
	
	private int customerId;
	private long accountNumber;
	private String accountType;
	private double availableBalance;
	private Date lastTransactionDate;
	private int interest;
	
	
	public SavingsDTO() {
		super();
	}


	

	public SavingsDTO(int customerId, long accountNumber, String accountType, double availableBalance,
			Date lastTransactionDate, int interest) {
		this();
		this.customerId = customerId;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.availableBalance = availableBalance;
		this.lastTransactionDate = lastTransactionDate;
		this.interest = interest;
	}
	
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

	//converts entity into DTO
	public static SavingsDTO valueOf(Savings savings) {
		SavingsDTO savingDTO=new SavingsDTO();
		savingDTO.setCustomerId(savings.getCustomerId());
		savingDTO.setAccountNumber(savings.getAccountNumber());
		savingDTO.setAccountType(savings.getAccountType());
		savingDTO.setAvailableBalance(savings.getAvailableBalance());
		savingDTO.setInterest(savings.getInterest());
		savingDTO.setLastTransactionDate(savings.getLastTransactionDate());
		return savingDTO;
		
	}


	@Override
	public String toString() {
		return "SavingsDTO [customerId=" + customerId + ", accountNumber=" + accountNumber + ", accountType="
				+ accountType + ", availableBalance=" + availableBalance + ", lastTransactionDate="
				+ lastTransactionDate + ", interest=" + interest + "]";
	}
    
	
	

}
