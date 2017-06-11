package com.BitwiseAndLogical;

import java.util.Scanner;

public class BitwiseAndLogicalAND {

	public static void Cal(byte a,byte b){
		

		System.out.println("The output of the Bitwise (&) is "+(a&b));
		System.out.println("The output of the Logical (||) AND is "+(a>0&&b>0));
	
	}
	
	
	
	public static void main(String[] args){
		// TODO Auto-generated method stub

		//Declaring variables 
		
		byte firstByte ;
		byte secondByte ;
		
		
		// Taking input from the user
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter two bytes(only 0 and 1 are allowed)");
		firstByte=scan.nextByte();
		secondByte=scan.nextByte();
		scan.close();
		//Calling the function to perform the BITWISE and LOGICAL operation
		Cal(firstByte,secondByte);
		
			
	}
			

}
