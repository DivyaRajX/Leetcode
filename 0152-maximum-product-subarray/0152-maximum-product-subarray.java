class Solution {
    public int maxProduct(int[] nums) {
       // edge case
       int res = Integer.MIN_VALUE;
       for(int i: nums) res = Math.max(res, i);

        int currMax =1, currMin = 1;
        for(int n : nums){
            int temp = n*currMax;
            currMax = Math.max(temp, Math.max(currMin*n, n));
            currMin = Math.min(temp, Math.min(currMin*n, n));

            res = Math.max(res, currMax);
        }return res;

   }
}