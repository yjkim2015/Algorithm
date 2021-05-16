package com.algorithm.test;

//Problem = Subaaray중에 합이 제일 큰 수 return
//배열안에 2개씩 합하여 가장 높은 수를 리턴한다.
//int[] nums = {-2,1-3,4,-1,2,1,-5,4}
public class MaximumSubarray {

	public static void main(String[] args) {
		int[] nums =  {-2,1,-3,4,-1,2,1,-5,3};
		solve(nums);
	}
	
	public static void solve(int[] nums) {
		int current = nums[0];
		int max = nums[0];
		for ( int i = 1; i < nums.length; i++ ) {
			if ( current < current + nums[i] ) {
				current = nums[i];
			}
			max = Math.max(current+nums[i], max);
		}
		System.out.println(max);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		int[] nums =  {-2,1,-3,4,-1,2,1,-5,4};
//		
//		System.out.println(solve(nums));
//	}
//	
//	public static int solve(int[] nums) {
//		int max = nums[0];
//		int current = nums[0];
//		for ( int i = 1 ; i < nums.length; i++ ) {
//			if ( current < current + nums[i] ) {
//				current = nums[i];
//			}
//			max = Math.max(max, current+nums[i]);
//			System.out.println("current : " + current + " max : " + max);
//		}
//		
//		return max;
//	}
}
