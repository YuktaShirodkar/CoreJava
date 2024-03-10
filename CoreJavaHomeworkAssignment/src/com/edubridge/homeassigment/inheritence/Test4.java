package com.edubridge.homeassigment.inheritence;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {

	public static void main(String[] args) {
	List<String>list=Arrays.asList("A","Z","B","a","b","9","1");
	List<String>sortedList=list.stream().sorted().collect((Collectors.toList()));
	
	System.out.println(sortedList);

	
	
	List<String>ListSorted=list.stream().sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());


System.out.println(ListSorted);

	}
	
}