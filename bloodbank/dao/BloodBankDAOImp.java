package com.revature.bloodbank.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.revature.bloodbank.model.BloodBankCenter;
import com.revature.bloodbank.util.DBUtil;



public class BloodBankDAOImp  implements BloodBankDAO{
	public void addBloodBankCenter(BloodBankCenter bloodBankCenter)  {
		
		try {
			if(checkId(bloodBankCenter) == 0) {
			Connection con= DBUtil.getConnection();
			PreparedStatement pst=con.prepareStatement("insert into Bloodbankuser values(?,?,?,?,?,?)");
			pst.setInt(1, bloodBankCenter.getCenterId());
			pst.setString(2, bloodBankCenter.getCenterName());
			pst.setString(3, bloodBankCenter.getStreet());
			pst.setString(4, bloodBankCenter.getCity());
			pst.setString(5, bloodBankCenter.getState());
			pst.setString(6, bloodBankCenter.getPincode());
			pst.execute();
			System.out.println("Data inserted Successfully......");
			}
			else { 
				System.out.println("......Already exist");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(".....Try again ");
		}
	}
		
		public static int checkId(BloodBankCenter bloodBankCenter) {
			int status =0;
			try {
				Connection con = DBUtil.getConnection();
				PreparedStatement pst=con.prepareStatement("select * from Bloodbankuser where centerId=?");
				pst.setInt(1,bloodBankCenter.getCenterId());
				
//				pst.execute();
				ResultSet rs=pst.executeQuery();
				if(rs.next()) {
					status=1; 
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return status;
		
	}
	public void update(BloodBankCenter bloodBankCenter) {
		if(checkId(bloodBankCenter)==1) {
			try {
				Connection con = DBUtil.getConnection();
				PreparedStatement pst=con.prepareStatement("UPDATE Bloodbankuser"+" SET City= ?, CenterName=?, Street=?, State=?, Pincode=? WHERE centerId=?");
				pst.setString(1,bloodBankCenter.getCity());
				pst.setString(2,bloodBankCenter.getCenterName());
				pst.setString(3,bloodBankCenter.getStreet());
				pst.setString(4,bloodBankCenter.getState());
				pst.setString(5,bloodBankCenter.getPincode());
				pst.setInt(6,bloodBankCenter.getCenterId());
				pst.executeUpdate();
				
				
				
				 
				System.out.println("Updation was Successful");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
		else	{
			System.out.println(" ******************* Sorry not in record...Try Again.....*********************");
		}
	}
		public void deleteDetails(BloodBankCenter bloodBankCenter) {
			if(checkId(bloodBankCenter)==1) {
				try {
					Connection con = DBUtil.getConnection();
					PreparedStatement pst=con.prepareStatement("Delete FROM Bloodbankuser where centerId=?");
					pst.setInt(1,bloodBankCenter.getCenterId());//1
					pst.execute();
					
					System.out.println("Deleted Successfully");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			else {
				System.out.println("....sorry ! try again....");
			}
		}
			public void displayDetailsOne(BloodBankCenter bloodBankCenter) {
				if(checkId(bloodBankCenter)==1) {
					try {
						Connection con = DBUtil.getConnection();
						PreparedStatement pst=con.prepareStatement("Select * FROM Bloodbankuser where centerId=?");
						pst.setInt(1,bloodBankCenter.getCenterId());
						ResultSet rs=pst.executeQuery();
						while(rs.next()) {
					
							System.out.println("State : "+rs.getString("state"));
							System.out.println("City : "+rs.getString("city"));
				            System.out.println("Street  : "+rs.getString("street"));
							System.out.println("Pincode : "+rs.getString("pincode"));
							System.out.println("Center Name : "+rs.getString("centerName"));
							
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
			}
					
				}
				else {
					System.out.println("Sorry .Put correct Id to display!");
				}	
			}
				public void displayDetails() {
					try {
						Connection con = DBUtil.getConnection();
						PreparedStatement pst=con.prepareStatement("Select * FROM Bloodbankuser");
						ResultSet rs=pst.executeQuery();
						while(rs.next()) {
							System.out.print("CenterId : "+rs.getInt("centerId")+"\n");
							System.out.print("Center Name : "+rs.getString("centerName")+"\n");
							System.out.print(" PinCode : "+rs.getString("pincode")+"\n");
							System.out.print(" Street : "+rs.getString("street")+"\n");
							System.out.print(" City : "+rs.getString("city")+"\n");
							System.out.print(" State : "+rs.getString("state")+"\n");
						
							
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
}
			}
		

