package BitMasking_ques;

public class NumberOf1Bits_191 {

	public static void main(String[] args) {
		
		int n = 85;
		int count = 0;
	      while(n!=0){
	          count++;
	          n = n&(n-1);
	      }
	    return count;
	      
	}

}
