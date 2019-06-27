package com.prakharjain.StringEx;

import java.util.HashMap;
import java.util.Map;

public class SherlockValidString {

	static String isValid(String s) {

        char[] ch = s.toCharArray();
       Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(int i = 0; i<ch.length; i++)
        {
            if(map.get(ch[i]) != null)
            {
                map.put(ch[i],map.get(ch[i])+1);
            }
            else
            {
                map.put(ch[i],1);
            }
        }
        int cnt = 0;
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            //if((cnt==0 && entry.getValue()%2!=0) || (cnt>1 && entry.getValue()%2!=0))
            if(entry.getValue()%2!=0)
            {
               if((entry.getValue()%2) - 1==0)
               {
                   cnt ++;
               } 
            }

        }

        if(cnt == 1)
            return "YES";
        else
            return "NO";
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdefghhgfedecba";
		//String s = "aabbcd";
		String result = isValid(s);
		System.out.println(result);
	}

}
