package strings;

import java.util.Arrays;

public class kthsmallestElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7, 10, 4, 3, 20, 15} ;
		int k = 3 ;
		System.out.println(findelement(arr,k));

	}

	public static int findelement(int arr[], int k) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
//		return arr[arr.length-k];
		return arr[k-1];
	}

}
