package com.algorithm.test;

import java.util.HashMap;
import java.util.Map;

public class LongestSubMostTwoDist {

	public static void main(String[] args) {
		String s = "ccaabbb";
		System.out.println(solve(s));
	}
	
	public static int solve(String s) {
		int count = 0;
		int startIndex = 0;
		int endIndex = 0;
		int length = 0;
		Map<Character, Integer> map = new HashMap<>();
		
		while( endIndex < s.length() ) {
			char ch = s.charAt(endIndex);
			map.put(ch, map.getOrDefault(ch, 0)+1);
			endIndex++;
			
			if ( map.get(ch) == 1 ) {
				count++;
			} 
			//String s = "ccaabbb";

			while ( count > 2 ) {
				char startChar = s.charAt(startIndex);
				map.put(startChar, map.getOrDefault(startChar, 0)-1);
				
				if ( map.get(startChar) == 0 ) count--;
				startIndex++;
			}
			
			length = Math.max(length, endIndex-startIndex);
			
		}
		
		return length;
	}
}
