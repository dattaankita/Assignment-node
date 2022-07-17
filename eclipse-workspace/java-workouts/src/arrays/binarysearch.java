package arrays;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,2,3,10};
		int searchElement=3;
		System.out.println(search(arr,0,arr.length-1,searchElement));
	}

	private static int search(int[] arr, int i, int j, int searchElement) {
		// TODO Auto-generated method stub
		if(i<=j) {
			int mid=i+(j-i)/2;
			if(searchElement < arr[mid]) {
				return search(arr,i,mid,searchElement);
			}else if(searchElement > arr[mid]) {
				return search(arr,mid+1,j,searchElement);
			}else
				return mid;
		}
		return -1;
	}
}
