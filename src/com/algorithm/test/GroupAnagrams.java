package com.algorithm.test;

import java.util.ArrayList;
import java.util.List;

/*
 * input 
 * {1,2,3},
 * {4,5,6},
 * {7,8,9}
 * 
 * output {1,2,3,6,9,8,7,4,5}
 */
public class GroupAnagrams {
	
	public static void main(String[] args) {
		
		int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
		solve(input);
	}
	
	public static void solve(int[][] input) {
		int startIndex = 0;
		int endIndex = input.length;
		int startRowIndex = 0;
		int endRowIndex = input[0].length;
		List<Integer> list = new ArrayList<>();
			
		//while ( startIndex <= endIndex ) {
			
			for ( int i = startRowIndex; i < endRowIndex; i++ ) {
				list.add(input[startRowIndex][i]);
				//startRowIndex++;
			}
			print(list);
			
			for ( int i = endRowIndex; i < endIndex; i++ ) {
				list.add(input[i][startRowIndex]);
				endRowIndex++;
			}
			
			for ( int i = startRowIndex; i > 0; i-- ) {
				list.add(input[endRowIndex][i]);
				startRowIndex--;
			}
			
			for ( int i = endRowIndex; i > startRowIndex; i-- ) {
				list.add(input[i][startRowIndex]);
				endRowIndex--;
			}
			
			for ( int i = endRowIndex; i < endIndex; i++ ) {
				list.add(input[i][startRowIndex]);
				startRowIndex++;
			}
			//startIndex++;
		//}
		
	}
	
	public static void print(List list) {
		for ( int i = 0 ; i < list.size(); i++ ) {
			System.out.print(list.get(i) + " ");
		}
	}
}
