class Solution {
    public int minimumArea(int[][] arr) {
        int minRow = arr.length, maxRow = -1;
        int minCol = arr[0].length, maxCol = -1;
       for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == 1){
                    minRow = Math.min(i, minRow);
                    maxRow = Math.max(i, maxRow);
                    minCol = Math.min(j, minCol);
                    maxCol = Math.max(j, maxCol);
                }
            }
       }return (maxRow-minRow+1)*(maxCol-minCol+1);
    }
}