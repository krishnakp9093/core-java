package in.co.Exercise_51;

public class Ques5_ReverseDigit {
public static void main(String[] args) {
	int number = 12345678,reverse=0;
	for(;number != 0; number=number/10) {
		
		int remainder= number%10;
		reverse= reverse*10+remainder;
	}
	System.out.println("reverse of the number is ="+reverse);
	
}
}
