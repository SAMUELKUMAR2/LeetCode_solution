package self;

import java.util.Scanner;

public class majority_of_element_169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] =sc.nextInt();
		}
		System.out.println(majority(arr));

	}
	public static int majority(int []arr) {
		int n =arr.length;
	
		int count=0;
		int element = 0;
		for(int i = 0;i<arr.length;i++) {
			if(count==0) {
				element = arr[i];
			}
			if(element==arr[i]) {
				count++;
			}else {
				count--;
			}
			
		}
		
		count =0;
		for(int i = 0; i<arr.length;i++) {
			if(element==arr[i]) {
				count++;
			}
		}
		if(count>(n/2)) {
			return element;
	 
		}
		return -1;
	}

}
