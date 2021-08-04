package com.revature.bloodbank.dao;

import com.revature.bloodbank.model.BloodBankCenter;

public interface BloodBankDAO {
	public void addBloodBankCenter(BloodBankCenter bloodBankCenter);
	public void update(BloodBankCenter bloodBankCenter);
	public void deleteDetails(BloodBankCenter bloodBankCenter);
	public void displayDetailsOne(BloodBankCenter bloodBankCenter);
	public void displayDetails();
}