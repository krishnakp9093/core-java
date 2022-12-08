package in.co.OOP;

public class Test_Person {
	public static void main(String[] args) {
		Person p =new Person("Rohit" ,"patel" , "indore", 452001);
		
		System.out.println(p.getFname());
		System.out.println(p.getLname());
		System.out.println(p.getAddress());
		System.out.println(p.getPincode());
	}
	

}
