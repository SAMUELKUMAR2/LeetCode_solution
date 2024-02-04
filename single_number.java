package BitMasking_ques;

public class single_number {

	public static void main(String[] args) {
		
		int arr[]= {3,4,2,5,3,4,5};
		unique(arr);
	}
	public static void unique(int arr[]) {
	
		int ans = 0;
		for(int i=0;i<arr.length;i++) {
			ans =ans^arr[i];
		}
		System.out.println("ans = "+ans);
	}

}
