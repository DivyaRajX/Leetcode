class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int mx = nums[0], mn = nums[0];
        int re = nums[0], re2=nums[0];
        int sum = nums[0];
        for(int i=1; i<nums.length; i++){
            mx = Math.max(nums[i], mx+nums[i]);
            re = Math.max(re, mx);
            sum += nums[i];
            mn = Math.min(nums[i], mn+nums[i]);
            re2 = Math.min(re2, mn);
        }
        System.out.println(re+" "+re2+" "+sum);
        if(re > 0 && re2 > 0) return sum;
        else if(re < 0 && re2 < 0) return re;
        return Math.max(sum-re2, re);
    }
}