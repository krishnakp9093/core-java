package in.co.rays.basics;

public class Test_increament_decreament {
public static void main(String[] args) {
	
	//{++i=pre increament,  i++=post increament}
	//{--i=pre decreament,  i--=post decreament}
	

	int i = 0;
	System.out.println( i++ + ++i + ++i + i++ + ++i );
	
	int g = 2;
	System.out.println(""+g++ + g++ + g++);
	
	int j = 5;
	 System.out.println(j++ + ++j);
	 
	 int k = 4;
	 System.out.println(++k + k++);  
	 
     int l = 0 ;
     System.out.println(""+--l + --l);
      
     int m = 5;
     System.out.println(m-- + --m);
     
     int n = 4;
     System.out.println(--n + n--);
     int z = 6;
     System.out.println(""+ z-- + --z+ --z);
     int x = 7;
     System.err.println(""+ --x + x-- + x-- + --x);   //err for red
     
	int y = 2;
	//System.out.println("" + ++y + y++);
	System.out.println(""+ y++ + ++y);
	
	
	int p = 1;
	System.out.println(++p + p++ + ++p);
	
	
	int r =7;
	System.out.println(r++ + ++r);
	
	
}	


	
	
}
