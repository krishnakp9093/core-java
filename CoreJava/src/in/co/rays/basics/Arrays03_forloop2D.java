package in.co.rays.basics;

public class Arrays03_forloop2D {
public static void main(String[] args) {
	//10 rows and 2 coloums
	
	int[][]tables = new int [9][2];
	//add values in coloum #1
	tables [0][0] =2;
    tables [1][0] =4;
	tables [2][0] =6;
	tables [3][0] =8;
	tables [4][0] =10;
	tables [5][0] =12;
	tables [6][0] =14;
	
	//add values in coloum #2
	
	tables [0][0] =3;
	tables [1][0] =6;
	tables [2][0] =9;
	tables [3][0] =12;
	tables [4][0] =15;
	tables [5][0] =18;
	tables [6][0] =21;
 
	//print all elements of 2D array
	
	for (int row=0;row<tables.length;row++) {
    for (int col=0;col<tables[4].length;col++) {
    System.out.print(tables[row][col]+ "\t");	
    	
    }System.out.println();
	}
	

    
			
	
}
}

