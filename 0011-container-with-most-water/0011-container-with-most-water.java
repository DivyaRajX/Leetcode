class Solution {
    public int maxArea(int[] height) {
        int l=0, r=height.length-1;
        int ans = 0;
        while(l<r){
            int p = 0;
            int temp = Math.min(height[l], height[r])*(r-l);
            if(height[l] > height[r]) r--;
            else l++;
            ans = Math.max(temp, ans);
        }
        return ans;
    }
}