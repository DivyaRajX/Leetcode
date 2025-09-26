class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0, j=n;
        int[] ans = new int[nums.length];
        int k = 0;
        while(k < nums.length){
            ans[k] = nums[i++];
            ans[k+1] = nums[j++];
            k += 2;       
        }return ans;
    }
}