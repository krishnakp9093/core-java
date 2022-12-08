package in.co.OOP;

public class Constructor {
	
	//person
	
	private String fname;
	private String lname;
	private String address;
	private int pincode;
	
	public Constructor () {            //default constructor when no parameter is passed
	System.out.println("default constructor");	
	}
	
	public Constructor (String a) {       //when parameter is passed (String a)
		this();
	System.out.println("parameterized constructor");  
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

	public Constructor(String a, String b, String c ,int ds) {
		//this (a); 
		this.fname=a;
		this.lname= b;
		this.address=c;
		this.pincode=ds;
	//	System.out.println("four parameterized");
		
		
	}
	
	
	
	

}
