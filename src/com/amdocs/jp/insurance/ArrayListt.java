package com.amdocs.jp.insurance;

import java.util.ArrayList;

public class ArrayListt 
{

	public static void main(String[] args) {
		
		ArrayList arrl = new ArrayList();
		
		arrl.add(89);
		arrl.add("nikhil");
		arrl.add(null);
		arrl.add(67);
		arrl.add(234);
		
		System.out.println(arrl);
		
		ArrayList<Integer> arr = new ArrayList();
		
		arr.add(45);
		arr.add(34);
		arr.add(90);
		arr.add(13);
		
		System.out.println(arr);
		
		ArrayList<String> arr1 = new ArrayList();
		
		arr1.add("nik");
		arr1.add("Pawar");
		arr1.add("Nikhil");
		arr1.add("Pawar");
		
		System.out.println(arr1);
	}
	
}
