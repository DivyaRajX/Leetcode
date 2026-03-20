class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
       return TD(nums, dp, 0); 
    }
    static int TD(int[] arr, int[]dp, int idx){
        if(idx >= arr.length) return 0;

        if(dp[idx] != -1) return dp[idx];
        int rob = arr[idx] + TD(arr, dp, idx+2);
        int dRob = TD(arr, dp, idx+1);

        return dp[idx] = Math.max(rob, dRob);
    }
}