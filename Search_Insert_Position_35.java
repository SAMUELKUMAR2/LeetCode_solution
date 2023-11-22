
class Solution {
    public int searchInsert(int[] nums, int target) {
       return search(nums,target); 
    }
    public static int search(int []arr,int t){
        int first = 0;
        int last = arr.length-1;
        for(int i = 0;i<arr.length;i++){
            int mid = (first+last)/2;
           
            if(arr[mid]==t){
                return mid;
            }
            else if(arr[mid]>t){
                last = mid-1;
               
            }
            else if(arr[mid]<t){
                first = mid+1;
                
         
            }
        
        }
      return first;
    }
}