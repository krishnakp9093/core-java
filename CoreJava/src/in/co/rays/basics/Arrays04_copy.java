package in.co.rays.basics;

public class Arrays04_copy {
	public static void main(String[] args) {
		
		char[]copyFrom = {'R','O','H','I','T','P','A','T','E','L'};
		char[] copyTo = new char[5];
		System.arraycopy(copyFrom,4,copyTo,0,5);
		System.out.println(copyTo);
		
	}


}
