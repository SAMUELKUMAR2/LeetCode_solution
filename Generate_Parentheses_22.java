class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ll = new ArrayList<>();
		GenerateParenthesis(n, 0,0 ,"",ll);
		return ll;
	}
	public static void GenerateParenthesis(int n ,int open, int close,String ans,List<String>ll) {
		if(open==n && close==n) {

			ll.add(ans);
			return;
		}
		if(open<n) {
			GenerateParenthesis(n,open+1,close,ans+"(",ll);
		}
		if(close<open) {
			GenerateParenthesis(n,open,close+1,ans+")",ll);
		}
	}

}
