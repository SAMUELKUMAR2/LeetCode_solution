package leetcode;

public class Two_sum_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {3,2,4};
		int target = 6;
		
		Sum(arr,target);
	
	}
	 public static void Sum(int []arr, int target) {
			
			for(int i = 0; i<arr.length-1;i++){
				if( arr[i]+arr[i+1]==target) {
			
					System.out.print(i+" "+ (i+1));
				}
				
			}
		
	}
}
