class Solution {
    public int minDays(int[] arr, int m, int k) {
        long c = (long)m*k;
        if(c > arr.length) return -1;
        int l = Arrays.stream(arr).min().getAsInt();
        int r = Arrays.stream(arr).max().getAsInt();
        int ans = 0;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(isBloom(arr, mid, k, m)){
                ans = mid;
                r = mid-1;
            }
            else l = mid+1;
        }return ans;
    }

    boolean isBloom(int[] arr, int mid, int k, int m){
        int cnt = 0;
        int ans = 0;
        for(int f : arr){
            if(f <= mid) cnt++;
            else{
                ans += cnt/k;
                cnt = 0;
            }
        }
        ans += cnt/k;
        return m<=ans;

    }
}