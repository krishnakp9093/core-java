package in.co.OOP;

import java.util.Date;

public class Encapsulation {
	
	//person
	
	private String fname;   //first name
	private String lname;   //last name
	private String oname;   //other name
	private String address;
	private String dob ;
	
	public void setDob ( String dob) {
		this.dob= dob;
	}
	public String getDob() {
		return  dob;
	}
	
	
	public void setFname (String fname) {
		this.fname = fname;
	}
     public String getFname () {
    	 return fname;
     }
     
     public void setLname (String lname) {
    	 this.lname = lname;
     }
     public String getLname () {
    	 return lname;
     }
     
     public void setOname(String oname) {
    	 this.oname = oname;
     }
     public String getOname() {
    	return oname; 
     }
     
     public void setAddress(String address) {
    	 this.address=address;
    	 
     }
     public String getAddress( ) {
    	 return address;
     }
     
     
     //Account
     
     private String number;
     private String accountType;
     private double balance;
     private double withdrawal;
     
     public void setWithdrawal (double withdrawal) {
    	 this.withdrawal = withdrawal;
     }
     public double getWithdrawal () {
    	 return balance - withdrawal;
     }
     
     public void setNumber (String number) {
    	 this.number= number;
     }
     public String getNumber() {
    	 return number;
     }
     
     public void setAccountType(String accountType) {
    	 this.accountType= accountType;
     }
     public String getAccountType() {
    	 return accountType;
     }
     
     public void setBalance(double balance) {
    	 this.balance = balance;
     }
     public double getBalance() {
    	 return balance;
     }
     
   //Automobiles
     
     private String colour;
     private String make;
     private int speed;
     
     
     public void setColour(String colour) {
     this.colour= colour;
}
     public String getColour() {
    	 return colour;
     }
   
     public void setMake(String make) {
    	 this.make= make;
     }
     public String getMake() {
    	 return make;
     }
     
     public void setSpeed(int speed) {
    	 this.speed= speed;
     }
     public int getSpeed() {
    	 return speed;
     } 
     
     }