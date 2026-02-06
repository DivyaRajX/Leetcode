class Solution {
    public int maxFrequency(int[] nums, int k) {
        int cnt[] = new int[51], res = 0;
        for(int a: nums){
            cnt[a] = Math.max(cnt[a], cnt[k])+1;
            res = Math.max(cnt[a]-cnt[k], res);
        }
        return cnt[k]+res;

    }
}