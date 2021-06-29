package bank.AccountMS.validation;

import bank.AccountMS.DTO.CustomerDTO;
import bank.AccountMS.entity.Customer;

public class AccountValidator {

    /*public static void validateAccountBalance(double accountBalance) throws Exception{
     if(accountBalance<3000){
      throw new Exception("Validator.MINIMUM_BALANCE");
     }*/
	
	public static void validate(CustomerDTO accountDTO) throws Exception  {
		if(!validateAccountBalance(accountDTO.getAccountBalance()))
			throw new Exception("Validator.MINIMUM_BALANCE");
	
	}
	
	public static Boolean validateAccountBalance(double accountBalance) {
		  if(accountBalance<3000){
			  return true;
		  }
		  return false;
		

}
}
