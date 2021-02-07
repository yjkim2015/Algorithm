package com.algorithm.test;

// Height : {0,1,0,2,1,0,1,3,2,1,2,1}
// left
// right
// max
// min
/*
 * Example
 * 1. int[] left 	= {0,1,1,2,2,2,2,3,3,3,3,3}
 * 2. int[] right 	= {3,3,3,3,3,3,3,3,2,2,2,1}
 * 3. Math.min  	= {0,1,1,2,2,2,2,3,2,2,2,1}
 * 4. Height		= {0,1,0,2,1,0,1,3,2,1,2,1}
 * 5.				= {0,0,1,0,1,2,1,0,0,1,0,0}
 * 
 * 1. Math.min(left[i],right[i])-height[i];
 * left,right를 구해서 가장 작은 값을 구한 뒤 가지고있는 높이만큼 뺀다.
 */
public class TrappingRainWater {

}
