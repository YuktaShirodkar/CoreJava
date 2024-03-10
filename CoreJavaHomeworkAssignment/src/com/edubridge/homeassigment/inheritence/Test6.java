package com.edubridge.homeassigment.inheritence;

import java.util.ArrayList;
import java.util.Collections;

public class Test6 {

	public static void main(String[] args) {
		ArrayList<Student1>a1=new ArrayList<Student1>();
		
		a1.add(new Student1(101,"maya","mumbai"));
		a1.add(new Student1(131,"Aasha","pune"));
		a1.add(new Student1(111,"Arjun","Nashik"));
		a1.add(new Student1(100,"sujay","Thane"));
		
		  System.out.println("Unsorted Data...");
		for (int i = 0; i < a1.size(); i++)
            System.out.println(a1.get(i));
 
        // Sorting student entries by roll number
        Collections.sort(a1, new Sortybyroll());
			
    System.out.println("Sorted Data...");
		for (int i = 0; i < a1.size(); i++)
            System.out.println(a1.get(i));
System.out.println("Unsorted Data...");
			for (int i = 0; i < a1.size(); i++)
	            System.out.println(a1.get(i));
	 
	        // Sorting student entries by roll number
	        Collections.sort(a1, new Sortbyname());
				
	    System.out.println("Sorted Data...");
			for (int i = 0; i < a1.size(); i++)
	            System.out.println(a1.get(i));
	
		
		

	}

}