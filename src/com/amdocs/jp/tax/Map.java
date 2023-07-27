package com.amdocs.jp.tax;

import java.util.HashMap;

public class Map 
{

	public static void main(String[] args) 
	{
		
		HashMap<Integer,String> map = new HashMap();
		
		map.put(23, "Nikhil");
		map.put(56, "nikhil");
		map.put(28, "Nikhil");
		map.put(56, "Nikhil");
		
		System.out.println(map);
		
	}
	
}
