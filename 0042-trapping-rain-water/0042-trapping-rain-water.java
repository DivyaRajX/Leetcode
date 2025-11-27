class Solution {
    public int trap(int[] height) {
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        int n = height.length;
        int maxl = height[0];
        int maxr = height[n-1];
        for(int i=0; i<n; i++) {
            maxl= Math.max(maxl, height[i]);
            leftMax[i] = maxl;
        }

        for(int j=n-1; j>=0; j--){
            maxr = Math.max(maxr, height[j]);
            rightMax[j] = maxr;
        } 

        int sum=0;
        for(int i=0; i<n; i++) sum+= Math.min(leftMax[i], rightMax[i])-height[i];
        return sum; 
    }
}