package BACKTRACKING2;
import java.util.*;
public class CoinPermutation_combination_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ll =new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		int []coin = {2,3,5};
		int amount =8;
		Permutation_combination(coin,amount,ll,0,ans);
		System.out.print(ans);
	}
	public static void Permutation_combination(int []coin ,int amount,List<Integer> ll,int idx,List<List<Integer>> ans) {
		if(amount ==0) {
			//It return one D list.
//			System.out.print(ll+" ");
			ans.add(new ArrayList<>(ll));
	//		System.out.print(ans);
			return;
		}
		
		for(int i =idx;i<coin.length;i++) {
			if(amount>=coin[i]) {
				ll.add(coin[i]);
				Permutation_combination(coin,amount-coin[i],ll,i,ans);
				ll.remove(ll.size()-1);  //backtracking
			}
		}
	}

}
