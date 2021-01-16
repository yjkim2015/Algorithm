package com.algorithm.test;

import java.util.ArrayList;
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

	}
	
	public static boolean check(int[] one, int[] two) {
		
		for ( int i = 0 ; i < one.length; i++ ) {
			if ( one[i] != two[i] ) return false;
		}
		
		return true;
	}
}
