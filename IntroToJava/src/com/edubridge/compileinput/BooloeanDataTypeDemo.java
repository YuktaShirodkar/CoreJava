package com.edubridge.compileinput;

import java.util.Scanner;

public class BooloeanDataTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s =new Scanner(System.in);
		boolean b = true ;
		char c= s.next().charAt(0);
		String str= s.next();
		System.out.println(b);
		System.out.println("The value for Char is : " +c);
		System.out.println("The value for String is : " +str);
		s.close();
	

	}

}
