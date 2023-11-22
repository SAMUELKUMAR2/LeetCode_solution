
public class Longest_Palindrome_Substring_5 {

	public static void main(String[] args) {
		String str = "a";
		System.out.println(substring(str)); 
	}
	public static String substring(String str) {
		String ans = "";
		for(int i =0;i<=str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				String sub = str.substring(i,j);
				
				if(isPalindrome(sub)) {
					if(sub.length()>ans.length()) {
						ans = sub;
					}
				}
			}
		}
		 return ans;
	}
	public static boolean isPalindrome(String sub) {
		int i =0; int j= sub.length()-1;
		while(i<j) {
			if(sub.charAt(i)!=sub.charAt(j)) {
				return false;
			} i++; j--;
		}
		return true;
	}

}
