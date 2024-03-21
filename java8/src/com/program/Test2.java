package com.program;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=1;i<=10;i++)
			list.add(i);
		
		list.forEach((i) -> {if(i!=5)System.out.println(i);});		
			
		}
}


