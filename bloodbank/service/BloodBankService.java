package com.revature.bloodbank.service;

import com.revature.bloodbank.model.BloodBankCenter;

public interface BloodBankService {
	public void addBloodBankCenter(BloodBankCenter bloodBankCenter);
	public void update(BloodBankCenter bloodBankCenter);
	public void deleteDetails(BloodBankCenter bloodBankCenter); 
	public void displayDetailsOne(BloodBankCenter bloodBankCenter);
	public void displayDetails();


}
