package com.edubridge.homeassigment.inheritence;

import java.util.Comparator;

class Sortybyroll implements Comparator<Student1> {

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return o1.rollno - o2.rollno;
	}

}
 class Sortbyname implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return o1.name .compareTo(o2.name);
	}
	 
 }
