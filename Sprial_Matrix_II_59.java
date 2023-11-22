class Solution {
    public int[][] generateMatrix(int n) {
      int arr[][] = new int [n][n];
			int minr = 0;
			int maxr = arr.length-1;
			int minc = 0;
			int maxc = arr[0].length-1;
			int k = 1;
			while(minr<=maxr && minc<=maxc){
				for(int i=minc;i<=maxc;i++){
					arr[minr][i] = k++;
				}
				minr++;
				for(int i = minr;i<=maxr;i++){
					arr[i][maxc] = k++;
				}
				maxc--;
				for(int i = maxc;i>=minc;i--){
					arr[maxr][i] = k++;
				}
				maxr--;
				for(int i= maxr;i>=minr;i--){
					arr[i][minc] = k++;
				}
				minc++;
			}
			return arr;
    }

	
}