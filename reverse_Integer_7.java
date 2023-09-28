import java.util.Scanner;

public class reverse_Integer_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(rev(n));
		
	}
	public static int rev(int n) {
		long sum = 0;
		while(n!=0) {
		int rev = n%10;
		sum = sum+rev;
		sum = sum *10;
		n/=10;
		}
		sum = sum/10;
		if(sum>Integer.MAX_VALUE || sum<Integer.MIN_VALUE) {
			return 0;
		}
		if(n<0) {
			sum = (int)sum*(-1);
		}
		else {
			sum = (int)sum;
		}
		return (int)sum;
	}

}
