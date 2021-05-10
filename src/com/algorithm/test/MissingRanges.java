package com.algorithm.test;

import java.util.ArrayList;
import java.util.List;

/* 숙제
 * int[] nums = {2,3,5,50,75};
 * int lower = 0, upper = 99;
 * 
 * Output : [0 -> 1, 4 ,6 -> 49, 51->74, 76 -> 99]
 * 요소의 범위가 포함 범위 [ lower , upper ]에 있는 정렬 된 정수 배열 nums가 주어지면 누락 된 범위를 반환합니다.
 */
public class MissingRanges {

	public static void main(String[] args) {
		
		int[] nums = {2,3,5, 50, 75};
		
		int lower = 0, upper = 99;
		System.out.println(solve(nums, lower, upper));
	}
	
	public static List<String> solve(int[] nums, int lower, int upper ) {
		List<String> result = new ArrayList<>();
		
		if ( lower < nums[0] ) {
			result.add(makeRange(lower, nums[0]-1));
		}
		for ( int i = 0 ; i < nums.length-1 ; i++ ) {
			if ( nums[i] < nums[i+1] && nums[i] < nums[i+1] - 1 ) {
				result.add(makeRange(nums[i]+1, nums[i+1]-1));
			}
		}
		
		if ( nums[nums.length-1] < upper) {
			result.add(makeRange(nums[nums.length-1]+1, upper));
		}
		
		return result;
	}
	
	public static String makeRange(int lower, int high) {
		return lower == high ? String.valueOf(lower) : lower + " -> " + high;
	}
	
	
//	public static List<String> solve(int[] nums, int lower, int upper) {
//		//1
//		List<String> result = new ArrayList<>();
//		if ( nums == null || nums.length == 0 ) return result;
//		
//		//2-1
//		if ( lower < nums[0] ) {
//			result.add(makeRange(lower, nums[0]-1));
//		}
//	
//		//2-2
//		for ( int i = 0; i < nums.length -1; i++ ) {
//			if ( nums[i] != nums[i+1] && nums[i]+1 < nums[i+1] ) {
//				result.add(makeRange(nums[i]+1, nums[i+1]-1));
//			}
//		}
//		
//		if ( nums[nums.length-1] < upper ) {
//			result.add(makeRange(nums[nums.length-1]+1,upper));
//		}
//		
//		return result;
//	}
//	
//	public static String makeRange(int low, int high) {
//		return low == high ? String.valueOf(low) : (low + "->" +high);
//	}
}
