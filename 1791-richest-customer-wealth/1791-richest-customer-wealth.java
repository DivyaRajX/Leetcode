class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int[] i : accounts){
            int sum = 0;
            for(int j=0; j<i.length; j++) sum += i[j];
            ans = Math.max(sum, ans);
        }return ans;
    }
}