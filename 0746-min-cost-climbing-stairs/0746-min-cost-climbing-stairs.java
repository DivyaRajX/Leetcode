class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);
        return Math.min(recClimb(cost, 0, dp), recClimb(cost, 1, dp));
    }

    static int recClimb(int[] arr, int idx, int[] dp){
        if(idx >= arr.length) return 0;
        if(dp[idx] != -1) return dp[idx]; 
        return dp[idx] = arr[idx] + Math.min(recClimb(arr, idx+1, dp), recClimb(arr, idx+2, dp));
    }
}