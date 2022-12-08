package in.co.OOP;

public class Person {
	
	private String fname;
	private String lname;
	private String address;
	private int pincode;
	
	
	public Person () {            //default constructor
	System.out.println("default constructor");	
	}
	
	public Person (String a) {
		this();
	System.out.println("parameterised constructor");
	}
	
	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getAddress() {
		return address;
	}

	public int getPincode() {
		return pincode;
	}

	public Person(String a, String b, String c ,int ds) {
		this (a);
		this.lname= b;
		this.address=c;
		this.pincode=ds;
		System.out.println("three parameterised");
		
		
	}
	
	

}
