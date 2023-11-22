class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      return  search(matrix,target);
        
    }
    public static boolean search(int [][]arr,int t){
        int row = 0;
      
        int col = arr[0].length-1;
        while(row<arr.length && col>=0) {
        if(arr[row][col]==t){
            return true;
        }
       else if(arr[row][col]>t){
            col--;

        }
        else{
            row++;
        }}
        return false;
    }
}