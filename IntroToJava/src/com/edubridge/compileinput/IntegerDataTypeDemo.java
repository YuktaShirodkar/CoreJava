package com.edubridge.compileinput;

import java.util.Scanner;

public class IntegerDataTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		byte num = s.nextByte();
		long num2 = s.nextLong();
		int num3 =s.nextInt();
		short num4 =s.nextShort();
		System.out.println("The Byte num Value is : " +num);
		System.out.println(" and long Num Value is : " +num2);
		System.out.println(" and long Num Value is : " +num3);
		System.out.println(" and long Num Value is : " +num4);
		s.close();
		

	}

}
