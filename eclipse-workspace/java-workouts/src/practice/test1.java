package practice;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int target= 4;
		int pos=binarySearch(arr,target,0,arr.length-1);
		System.out.println(pos);
	}

	private static int binarySearch(int[] arr, int target, int i, int j) {
		// TODO Auto-generated method stub
		if(i<=j) {
			int mid= i+(j-i)/2;
			if(arr[mid] == target)
				return mid;
			if(arr[mid]>target)
				return binarySearch(arr,target,i,mid-1);
			else
				return binarySearch(arr,target,mid+1,j);
		}
		return -1;
	}

}
