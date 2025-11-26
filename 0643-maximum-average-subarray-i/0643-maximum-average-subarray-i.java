class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = Integer.MIN_VALUE;
        double sum = 0;
        int i=0, j=0;
        int n = nums.length;
        while(j<n){
            int wind = j-i+1;
            sum += nums[j]; 
            if(wind < k) j++;
            else if(wind == k){
                ans = Math.max(ans, sum/k);
                sum -= nums[i];
                i++;
                j++;
            }
        }return ans;
    }
}