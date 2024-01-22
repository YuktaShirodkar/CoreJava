package com.edubridge.homeassigment;

import java.util.Scanner;

public class NumberPatternUsingLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner s = new Scanner(System.in);
		int i =1;
		int j =1;
		int a =1;
		
		for(i=1;i<=4;i++)
		{
			for(j=1;j<i+1;j++)
			{
				//prints the value of number
				System.out.print(a++ + " ");
				
			}
			
			System.out.println();
		}
		
		
	}

}

