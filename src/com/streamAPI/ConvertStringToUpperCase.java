package com.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringToUpperCase {

	public static void main(String[] args) {
		
		// convert string into uppercase
		
		 String [] s = {"Ram", "Sita", "Lakshman", "Hanuman", "", "", "Ravan"};
		
		List<String> list = Arrays.asList(s);

	     list.stream().map(m->m.toUpperCase()).collect(Collectors.toList()).forEach(System.out::print);
	     System.out.println("\n");
	     
	     //another way
	     list.stream().map(m->m.toUpperCase()).collect(Collectors.toList()).forEach(m->System.out.print(m+ ", "));;
	     System.out.println("\n");
	     
	     //removing duplicate string and converting into lowercase
	     list.stream().map(m->m.toLowerCase()).collect(Collectors.toSet()).forEach(m->System.out.print(m+ ", "));;
        }

}//
