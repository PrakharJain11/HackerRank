package com.prakharjain.StringEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MakeAnagram {
	public static void main(String[] args)
	{
		String str1 = "abc";
		String str2= "cde";
		
		str1.charAt(index)
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		Map<Character, Integer> map1 = new TreeMap<Character, Integer>();
		for(int i=0; i< ch1.length; i++)
		{
			if(map.get(ch1[i])!=null)
				map.put(ch1[i], map.get(ch1[i])+1);
			else
				map.put(ch1[i], 1);
		}
		for(int j=0; j< ch2.length; j++)
		{
			if(map1.get(ch2[j])!=null)
				map1.put(ch2[j], map1.get(ch1[j])+1);
			else
				map1.put(ch2[j], 1);
		}
		Iterator<Map.Entry<Character, Integer>> entries1= map.entrySet().iterator();
		Iterator<Map.Entry<Character, Integer>> entries2 = map1.entrySet().iterator();
		
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		while (entries1.hasNext() && entries2.hasNext())
		{
			Map.Entry<Character, Integer> entry1 = entries1.next();
			Map.Entry<Character, Integer> entry2 = entries2.next();
			
			if(entry1.getKey() == entry2.getKey())
			{
				if(entry1.getValue() == entry2.getValue())
				{}
				else {
					map2.put(entry1.getKey(), entry1.getValue()-entry2.getValue());
				}
			}
			
		}
		
		for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
			System.out.println("Key: "+entry.getKey()+"Value: "+entry.getValue());
		}
		
	
	
	
	}
}
