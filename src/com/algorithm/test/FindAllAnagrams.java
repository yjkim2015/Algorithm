package com.algorithm.test;

import java.util.ArrayList;
import java.util.List;

// String txt = "BACDGABCDA";
// String pat = "ABCD";
// Output : [0, 5 ,6]
public class FindAllAnagrams {

	public static void main(String[] args) {
	
		String txt = "BACDGABCDA";
		String pat = "ABCD";      
		solve(txt,pat);
	}
	
	public static void solve(String txt, String pat) {
		
		
		int[] patArr = new int[256];
		
		for ( int i = 0 ; i < pat.length(); i++ ) patArr[pat.charAt(i)]++; 
		
		List<Integer> result = new ArrayList<>();
		
		for ( int i = 0 ; i < txt.length() - pat.length() +1; i++ ) {
			int[] tmpArr = new int[256];
			for ( int j = i; j < pat.length() + i; j++ ) {
				tmpArr[txt.charAt(j)]++;
			}
			if ( check(patArr, tmpArr) ) {
				result.add(i);
			}
		}
		
		for ( int i = 0; i < result.size(); i++ ) {
			System.out.print(result.get(i) +  " ");
		}
	}
	public static boolean check(int[] patArr, int[] tmpArr) {
		
		for ( int i = 0 ; i < patArr.length; i++ ) {
			if ( patArr[i] != tmpArr[i] ) {
				return false;
			}
		}
		return true;
	}
} 
