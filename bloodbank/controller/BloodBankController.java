package com.revature.bloodbank.controller;

import com.revature.bloodbank.model.BloodBankCenter;
import com.revature.bloodbank.service.BloodBankService;
import com.revature.bloodbank.service.BloodBankServiceImpl;

public class BloodBankController {
	
	BloodBankService bloodBankServiceImpl=new BloodBankServiceImpl();
	 public  void addBloodBankCenter(BloodBankCenter bloodBankCenter ) {
		   
		  try {
			bloodBankServiceImpl.addBloodBankCenter(bloodBankCenter);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	 public void update(BloodBankCenter bloodBankCenter) {
			try {
				bloodBankServiceImpl.update(bloodBankCenter);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void deleteDetails(BloodBankCenter bloodBankCenter) {
			try {
				bloodBankServiceImpl.deleteDetails(bloodBankCenter);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void displayDetailsOne(BloodBankCenter bloodBankCenter) {
			try {
				bloodBankServiceImpl.displayDetailsOne(bloodBankCenter);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void displayDetails() {
			try {
				bloodBankServiceImpl.displayDetails();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	 
			// TODO Auto-generated method stub
	
	}


