package com.bridge.generics;

public class GenericsDemo {

	public static void main(String[] args) {
		String str[] = {"Shubham","shdb","gdbhd","dkjior"};
		int arr[] = {10,20,30,40,50,60,70,80,33,22,65};
		Integer[] in = {10,20,30,40,50,60,70,80,33,22,65};
		
		SuperSort<Integer[]> ss = new SuperSort<Integer[]>(in);
		
		
		
	}

	
	
}
