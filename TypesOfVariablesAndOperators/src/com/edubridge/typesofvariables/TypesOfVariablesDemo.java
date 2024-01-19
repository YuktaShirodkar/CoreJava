package com.edubridge.typesofvariables;

public class TypesOfVariablesDemo {
	static int x =18;  //static variable
	float salary= 78900.56f; //instance variable
	
	
	String display()
	{
		char x1 ='z'; // local variable
		System.out.println(x1);
		return "Local Variable";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(x);
		TypesOfVariablesDemo obj =new TypesOfVariablesDemo();
		System.out.println(obj.display());
		System.out.println(obj.salary);
		

	}

}
