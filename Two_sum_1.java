class Solution {
    public int[] twoSum(int[] nums, int target) {
        return sum(nums,target);
    }
    public static int []sum(int []arr,int t){
        int index[] = new int[2];
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==t){
                index[0] = i;
               index[1] =j;
               break;
            }
        }
        }
       return index; 
    }
}
