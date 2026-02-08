class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] arr = new int[m][n];
        int pro = m*n;
        if(pro != original.length) return new int[0][0];
        else{
            int i=0;
            while(i<original.length){
                int x = i/n;
                int y = i%n;
                arr[x][y] = original[i];
                i++;
            }
        }return arr;
    }
}