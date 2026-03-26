class Solution {
    public int maxArea(int[] h) {
        int i=0, j=h.length-1;
        int max = Integer.MIN_VALUE;
        while(i<j){
            max = Math.max(max, Math.min(h[i],h[j])*(j-i));
            if(h[j] < h[i]) j--;
            else i++;
        }
        return max;
    }
}