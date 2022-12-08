package in.co.OOP;

public class Test_Encapsulation {
public static void main(String[] args) {
	
	Encapsulation a = new Encapsulation();
	
	
	//person
	a.setFname("Rohit");
	a.setOname("Singh");
	a.setLname("Patel");
	a.setAddress("Sehore");
	a.setDob("01/07/2001");
	//String b = a.getFname();
	
System.out.println(a.getFname() );
System.out.println(a.getOname());
System.out.println(a.getLname());
System.out.println(a.getAddress());
System.out.println(a.getDob());

    
      //Account

      a.setNumber("23456788");
      a.setAccountType("Saving");
      a.setBalance(40000.00);
  	  a.setWithdrawal(12000);

System.out.println(a.getNumber());
System.out.println(a.getAccountType());
System.out.println(a.getBalance());
System.out.println(a.getWithdrawal());


     //Automobile
  
     a.setFname("Ferrari");
     a.setColour("Black");
     a.setMake("By Tata");
     a.setSpeed(360);

System.out.println(a.getFname());
System.out.println(a.getColour());
System.out.println(a.getMake());
System.out.println(a.getSpeed());
}
}
