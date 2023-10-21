package com.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountString {

	public static void main(String[] args) {
		 String [] s = {"Ram", "Sita", "Lakshman", "Hanuman", "", "", "Ravan"};

			List<String> list = Arrays.asList(s);
		
			//count no of String 
			long l=list.stream().filter(m->m.length()>=0).count();
			System.out.println(l);
			
			//count no of String which length more than 4 
			long l1=list.stream().filter(m->m.length()>=4).count();
			System.out.println(l1);
			
			//printing no of String which has  length more than 4 
			list.stream().filter(m->m.length()>=4).collect(Collectors.toList()).forEach(m->System.out.print(m +", "));
		
			
			
	}
}
