package com.edubridge.homeassigment;

import java.util.Scanner;

public class FibonacciSeriesUsingLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a=0;
		int b=1;
		//int c=0;
		
		for(int i=1; i<=n; ++i)
		{
			System.out.print(a + " ");
			
			a=b;
			
			int c=a+b;
			b=c;
			
			
		}
		
		
		
		

	}

}
