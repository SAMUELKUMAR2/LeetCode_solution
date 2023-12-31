
public class Maximum_SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(max_subarray(arr));
	}
	public static int max_subarray(int arr[]) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			sum = sum + arr[i];
			ans = Math.max(ans, sum);
			if(sum<0) {
				sum = 0;
			}
		}
		return ans;
	}

}
