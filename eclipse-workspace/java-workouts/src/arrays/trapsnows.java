package arrays;

public class trapsnows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,3,0,1,2,0,4,0,1,2,3,0};
		System.out.println(trapsnow(arr));

	}

	public static int trapsnow(int[] arr) {
		// TODO Auto-generated method stub
		int l=0,h=arr.length-1, leftmax=0,rightmax=0;
		int sum=0;
		while(l<h) {
			if(arr[l] <= arr[h]) {
				if(arr[l] <= leftmax) {
					sum += leftmax-arr[l];
				}else
					leftmax=arr[l];
				l++;
			}else {
				if(rightmax<=arr[h]) {
					sum += arr[h]- rightmax;
				}else
					rightmax=arr[h];
				h--;
			}
			
		}
		return sum;
	}

}//result 15
