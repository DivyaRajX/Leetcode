class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        return topDwn(n, dp);
    }

    int topDwn(int n, int[] dp){
        if(n == 1 || n == 2) return n;
        if(dp[n] != 0) return dp[n];

        int f = topDwn(n-1, dp);
        int s = topDwn(n-2, dp);

        return dp[n] = f+s;
    }
}