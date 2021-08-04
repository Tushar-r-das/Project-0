package com.revature.bloodbank.client.BloodBank;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.bloodbank.controller.BloodBankController;
import com.revature.bloodbank.model.BloodBankCenter;

public class BloodbankApplication {
	static Logger logger = Logger.getLogger("BloodbankApplication.class");
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//System.out.println("====BloodBank Application===========");
		
int choice;
do {
	           System.out.println("******** ====== Hey User! Welcome to BloodBank Application ********** ===========");
			//System.out.println("********||Welcome to BLOODBANK||Your Blood can Save a Life||***********");
			//logger.info("Opened BloodBank Application for you");
			System.out.println("1. Enter a new Detail");
			System.out.println("2. Display particular detail");
			System.out.println("3. Display all details");
			System.out.println("4. Update Detail");
			System.out.println("5. Delete details");
			System.out.println("6. Exit");
			System.out.println("-----Enter your choice-----");
           
			choice=sc.nextInt();

			switch (choice) {
			case 1:
				addBloodBankCenter();
				break;
			case 2:
				displayDetailsone();
				break;
			case 3:
				displayDetails();
				break;
			case 4:
				update();
				break;
			case 5:
				deleteDetails();
				break;
			case 6:
				//logger.info("See you again!!!!!!!!");
				System.out.println("Thank you for using Blood Bank Application. Keep Donating Blood !! .");
				break;
			default:
				System.out.println("Incorrect choice !!!!!!!!!!!! enter again");
				break;
			}
		}while( choice!=6);
		
		
	}

	private static void update() {
		
		Scanner sc = new Scanner(System.in);
	    BloodBankController bloodbankcontroller = new BloodBankController();
	    BloodBankCenter bloodbankmodel = new BloodBankCenter();
	    logger.info("Enter In Client ");
	    System.out.println(" *** Welcome to Updation *** ");
	    System.out.println(" Update a Detail ");
	    System.out.println("Enter CenterId");
	    int CenterId = sc.nextInt();sc.nextLine();
	    System.out.println("Enter City to update : ");
	    String City = sc.nextLine();
	    System.out.println("Enter Center Name to update : ");
	    String CenterName = sc.nextLine();
	    System.out.println("Enter street to update : ");
	    String Street= sc.nextLine();
	    System.out.println("Enter state to update : ");
	    String State = sc.nextLine();
	    System.out.println("Enter pincode to update : ");
	    String Pincode = sc.nextLine();
	    bloodbankmodel.setCenterId(CenterId);
	    bloodbankmodel.setCity(City);
	    bloodbankmodel.setCenterName(CenterName);
	    bloodbankmodel.setStreet(Street);
	    bloodbankmodel.setState(State);
	    bloodbankmodel.setPincode(Pincode);
	    bloodbankcontroller.update(bloodbankmodel);
	}

	private static void displayDetails() {
		 Scanner sc = new Scanner(System.in);
		    BloodBankController bloodbankcontroller = new BloodBankController();
		    
		    bloodbankcontroller.displayDetails();	
		
	}

	private static void deleteDetails() {
		
		 Scanner sc = new Scanner(System.in);
		    BloodBankController bloodbankcontroller = new BloodBankController();
		    logger.info("Enter In Client ");
		    System.out.println(" *** Welcome to Deletion *** ");
		    System.out.println(" Delete a Detail ");
		    BloodBankCenter bloodbankmodel = new BloodBankCenter();
		    System.out.println("Enter  CenterId");
		    int CenterId = sc.nextInt();sc.nextLine();
		    bloodbankmodel.setCenterId(CenterId);
		    bloodbankcontroller.deleteDetails(bloodbankmodel);	
	}

	private static void displayDetailsone() {
		    Scanner sc = new Scanner(System.in);
		    BloodBankController bloodbankcontroller = new BloodBankController();
		    System.out.println(" Display a Detail ");
		    BloodBankCenter bloodbankmodel = new BloodBankCenter();
		    System.out.println("Enter CenterId");
		    int CenterId = sc.nextInt();sc.nextLine();
		    bloodbankmodel.setCenterId(CenterId);
		    bloodbankcontroller.displayDetailsOne(bloodbankmodel);		
		    
	}

	private static void addBloodBankCenter() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BloodBankCenter bloodbankmodel = new BloodBankCenter();
		logger.info("Enter In Client ");
		  System.out.println(" *** Welcome to Add details*** ");
		System.out.println("Create your new details:");
		BloodBankController bloodbankcontroller = new BloodBankController();
		System.out.println("Enter your center ID");
		
		int CenterId = sc.nextInt();sc.nextLine();
		System.out.println("Enter your center name");
		String CenterName = sc.nextLine();
		System.out.println("Enter the street name");
		String Street =sc.nextLine();
		System.out.println("Enter the City name");
		String City=sc.nextLine();
		System.out.println("Enter the state name");
		String State =sc.nextLine();
		System.out.println("Enter the pincode name");
		String Pincode =sc.nextLine();
		
		bloodbankmodel.setCenterId(CenterId);  //  to model class 
		bloodbankmodel.setCenterName(CenterName);
		bloodbankmodel.setStreet(Street);
		bloodbankmodel.setCity(City);
		bloodbankmodel.setState(State);
		bloodbankmodel.setPincode(Pincode);
		
		bloodbankcontroller.addBloodBankCenter(bloodbankmodel);		
	}

}
	