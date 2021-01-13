package com.algorithm.test;

import java.util.HashMap;
import java.util.Map;

// int[] A = {11,27,45,31,50}
// int[] B = {50,11,31,45,27}
// Output {1 4 3 2 0}
// A의 배열의 값이 B의 배열에서 몇번 인덱스에 있는지 출력하기
public class FindAnagramsMapping {
	
	public static void main(String[] args) {
		int[] A = {11,27,45,31,50};
		int[] B = {50,11,31,45,27};

		solve(A,B);
	}
	
	public static void solve(int[] A, int[] B) {
		
		Map map = new HashMap<>();
		int result[] = new int[A.length];
		for ( int i = 0 ; i < B.length; i++ ) {
			map.put(B[i], i);
		}
		
		for ( int i = 0; i < A.length; i++) {
			result[i] = (int) map.get(A[i]);
			System.out.print(result[i] + " ");
		}
	}

}
