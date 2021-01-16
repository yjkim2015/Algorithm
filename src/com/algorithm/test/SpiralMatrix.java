package com.algorithm.test;

import java.util.ArrayList;
import java.util.List;

/*
 * input 
 * {1,2,3},
 * {4,5,6},
 * {7,8,9}
 * 
 * 
 * {1,2,3,4},
 * {5,6,7,8},
 * {9,10,11,12}
 * output {1,2,3,6,9,8,7,4,5}
 */
public class SpiralMatrix {
	
	public static void main(String[] args) {
		
		//int[][] input = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
		solve(input);
	}
	
	public static void solve(int[][] input) {
		int startRowIndex = 0;
		int endRowIndex = input.length - 1;
		int startColIndex = 0;
		int endColIndex = input[0].length - 1;
		
		List<Integer> list = new ArrayList<>();
		while ( startRowIndex <= endRowIndex && startColIndex <= endColIndex ) {
			
			for ( int i = startColIndex; i <= endColIndex; i++ ) {
				list.add(input[startRowIndex][i]);
			}
			startRowIndex++;
			for ( int i = startRowIndex; i <= endRowIndex; i++ ) {
				list.add(input[i][endColIndex]);
			}
			startRowIndex++;
			endColIndex--;
			if ( startRowIndex <= endRowIndex )
			for ( int i = endColIndex; i >= startColIndex; i-- ) {
				list.add(input[endRowIndex][i]);
			}
			startRowIndex--;
			endRowIndex--;
			if ( startRowIndex <= endRowIndex )
			for ( int i = endRowIndex; i >= startRowIndex; i-- ) {
				list.add(input[i][startColIndex]);
			}
			startColIndex++;
		}

		print(list);
	}
	
	public static void print(List list) {
		System.out.println("");
		for ( int i = 0 ; i < list.size(); i++ ) {
			System.out.print(list.get(i) + " ");
		}
	}
}
