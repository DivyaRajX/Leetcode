class Solution {
    public long maxMatrixSum(int[][] arr) {
        long sum = 0, ans = 0;
        int t_neg = 0;
        long mn = Integer.MAX_VALUE;
        for(int[] i: arr){
            for(int j: i){
                sum += (long)Math.abs(j);
                mn = Math.min(mn, Math.abs(j));
                if(j<0) t_neg++; 
            }
        }
        if(t_neg%2 == 0) return sum;
        return sum-2*mn;
    }
}