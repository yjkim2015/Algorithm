package com.algorithm.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//input ["eat", "tea", "tan", "ate", "nat", "bat"]
/*
 * ["ate","eat","tea"],
 * ["nat","tan"],
 * ["bat"]
 *
 */

//같은 아나그램 즉 같은 문자열로 이루어진애를 리스트로 만들어라
public class GroupAnagrams {
	
	public static void main(String[] args) {
		String[] input = {"eat", "tea", "tan","ate","nat","bat"};
		
		solve(input);
	}
	public static void solve(String[] input) {
		Map<String, List<String>> map = new HashMap<>();
		
		for ( String one : input ) {
			
			char[] arr = new char[one.length()];
			arr = one.toCharArray();
			Arrays.sort(arr);
			StringBuilder result = new StringBuilder(new String(arr));
			if ( map.get(result.toString()) == null )  {
				List<String> list = new ArrayList<>();
				list.add(one);
				map.put(result.toString(),list);
			}
			else {
				List<String> list = map.get(result.toString());
				list.add(one);
				map.put(result.toString(), list);
			}
		}
		
		for ( String key : map.keySet() ) {
			List<String> list = map.get(key);
			System.out.println("key : " + key);
			for ( int i = 0 ; i < list.size(); i++ ) {
				System.out.print(list.get(i) + " ");
			}
			System.out.println("");
		}
	}
}
