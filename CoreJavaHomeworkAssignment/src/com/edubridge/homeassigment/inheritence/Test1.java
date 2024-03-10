package com.edubridge.homeassigment.inheritence;

import java.util.Arrays;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		
		List<Integer>l1=Arrays.asList(3,5,6,8,9);
		
		l1.stream().map(x -> x*3).forEach(System.out::println);
		
		List<String>name=Arrays.asList("jhon","sam","ajya","sujay");
		
		name.stream().map(n->n.toUpperCase()).forEach(System.out::println);
		

	}

}
