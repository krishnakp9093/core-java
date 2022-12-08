package in.co.OOP;

public class Test_Constructor {
	public static void main(String[] args) {
		Constructor p =new Constructor("Rohit" ,"patel" , "indore", 452001);
		
		System.out.println(p.getFname());
		System.out.println(p.getLname());
		System.out.println(p.getAddress());
		System.out.println(p.getPincode());
	}
	

}
