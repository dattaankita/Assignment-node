package practice;

import java.util.HashMap;
import java.util.Map;

//Given a sorted array and a number x, find the pair in array whose sum is x
public class ArraySum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 22, 28, 29, 30, 40};
		int x = 54;
		findSum(arr,x);
	}
	
	private static int[] findSum(int[] arr, int x) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map= new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int y=arr[i]-x;
			if(map.containsKey(y)) {
				return new int[] {map.get(y),i};
			}else
				map.put(arr[i], i);
		}
		return null;
	}

	

	
}
