package com.revature.bloodbank.service;

import org.apache.log4j.Logger;

import com.revature.bloodbank.dao.BloodBankDAO;
import com.revature.bloodbank.dao.BloodBankDAOImp;
import com.revature.bloodbank.model.BloodBankCenter;

public class BloodBankServiceImpl implements BloodBankService{
	BloodBankDAO bloodBankDaoImpl=new BloodBankDAOImp();
	static Logger logger = Logger.getLogger("BloodBankServiceImpl.class");
	public void addBloodBankCenter(BloodBankCenter bloodBankCenter) {
		logger.info("In service add method ");
		try {
			bloodBankDaoImpl.addBloodBankCenter(bloodBankCenter);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void update(BloodBankCenter bloodBankCenter) {
		logger.info("In service update method ");
		try {
			bloodBankDaoImpl.update(bloodBankCenter);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void deleteDetails(BloodBankCenter bloodBankCenter) {
		logger.info("In service delete method ");
		try {
			bloodBankDaoImpl.deleteDetails(bloodBankCenter);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void displayDetailsOne(BloodBankCenter bloodBankCenter) {

		try {
			bloodBankDaoImpl.displayDetailsOne(bloodBankCenter);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void displayDetails() {

		try {
			bloodBankDaoImpl.displayDetails();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

