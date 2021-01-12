package com.algorithm.test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

//Input point = [[1,3],[-2,2]],K = 1
// Output : [[-2,2]]

// (0,0)(1,3) and the origin is sqrt(10) 1+9
// (0,0)(-2,2) and the origin is sqrt(8) 4+4
// Priority Queue 를 이용한 원점에서 가장 가까운 거리 찾기
public class KClosest {

	public static void main(String[] args) {
		KClosest a = new KClosest();
		int[][] points = {{1,3}, {-2,2}};
		int k = 1;
		
		int[][] result = a.solve(points, k);
		
		for ( int[] one: result ) {
			System.out.println(one[0] + " " + one[1]);
		}
		
	}
	
	public int[][] solve(int[][] points, int k) {
		Queue<int[]> pq =  new PriorityQueue<>(points.length, comp);
		
		for (int[] a: points) {
			pq.offer(a);
		}
		int result[][] = new int[k][];
		result[0] = pq.poll();
		return result;
	}
	
	Comparator<int[]> comp = new Comparator<int[]>() {

		@Override
		public int compare(int[] o1, int[] o2) {
			// TODO Auto-generated method stub
			return (o1[0]*o1[0]+o1[1]*o1[1]) - (o2[0]*o2[0]+o2[1]*o2[1]);
		}
	};
}
