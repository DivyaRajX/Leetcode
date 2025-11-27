class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, mx = 0, zc=0;
        for(int r=0; r<nums.length; ++r){
            if(nums[r] == 0) zc++;
            while(zc > k){
                if(nums[l] == 0) zc--;
                l++;
            }
            mx = Math.max(mx, r-l+1);
        }return mx;
    }
}