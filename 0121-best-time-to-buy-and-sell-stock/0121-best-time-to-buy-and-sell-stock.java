class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int i=0, j=1;
        int mx = 0;
        while(j<n){
            if(arr[j]-arr[i] <= 0) {
                i=j;
                //mx=0;
            }
            else mx = Math.max(mx, arr[j]-arr[i]);
            j++;
        }return mx;
    }
}