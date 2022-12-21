package in.co.Rohit;

public class Logical_BitwiseOperator {
public static void main(String[] args) {
	
	
    //logical operator
	System.out.println(65<76 && 64<77); //any num wrong then eq wrong 
	System.out.println(65<76 && 64>77); //both num right then eq riht

	System.out.println(65<76 || 64<77);  //(any num right then eq. right)
	System.out.println(65<76 || 64>77);    
    System.out.println(65>76 || 64>77);    //(both false then eq. false)
	
	//Bitwise operator
    
    System.out.println(2&3);
    
	
	
}



}
