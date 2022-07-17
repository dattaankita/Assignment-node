package test;



public class code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-1,3,-2,5,6,-4,3,-8,-9};
		int l=0,r=arr.length-1;
		while(l<r) {
			if(arr[l] < 0 && arr[r] < 0)
				l++;
			else if(arr[l] > 0 && arr[r] > 0)
				r--;
			else if(arr[l] > 0 && arr[r] < 0) {
				int temp=arr[l];
				arr[l]=arr[r];
				arr[r]=temp;
				l++;
				r--;
			}else
				l++;
			
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
