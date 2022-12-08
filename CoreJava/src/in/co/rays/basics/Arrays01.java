package in.co.rays.basics;

public class Arrays01 {
public static void main(String[] args) {
	/*
	 *  classroom of 5 student - need to store marks o these students
	 * we have 2 options :
	 * 1. create 5 variables 
	 * 2. use arrays (recommanded)(3 main ways to create an array in java)
	 
	
	 //1.(decleration + memory allocation)
	
	//int [] marks = new int[5];    
	
	 // 2.decleration 
	 //   and memory allocation 
	
	
	/*int[]marks;                 
	marks = new int [5];*/         
	
	
  /*marks[0] = 90;
	marks[1] = 93;
	marks[2] = 95;
	marks[3] = 97;
	marks[4] = 98; */
	
	// 3. decleration , memory allocation and initialisation
	
	int []marks = {100,77,89,98,67};
	
	System.out.println(marks[2]);
}
}
