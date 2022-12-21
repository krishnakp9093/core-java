package in.co.Rohit;

public class Precedennce_associativity {
public static void main(String[] args) {
	
	int a = 6*5-34/2;
	//highest precedence goes to * and /(both)but from left to right
	// a = 30 - 17
	
	
	int b = 60/5 - 34*2;
	// b = 12-68
			
	System.out.println(a);
	System.out.println(b);
}
}
 