class Solution {
    public int partitionDisjoint(int[] nums) {
        int maxSoFar = nums[0];
        int leftMax = nums[0];
        int prttn = 0;
        for(int i=1; i<nums.length; i++){
            maxSoFar = Math.max(maxSoFar, nums[i]);

            if(nums[i] < leftMax){
                leftMax = maxSoFar;
                prttn = i;
            }
        }return prttn+1;
    }
}
