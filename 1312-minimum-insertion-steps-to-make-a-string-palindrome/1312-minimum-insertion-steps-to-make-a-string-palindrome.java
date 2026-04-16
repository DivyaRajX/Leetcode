class Solution {
    int[][] dp;
    public int minInsertions(String s) {
        int n = s.length();
        dp = new int[n+1][n+1];
        String rev = new StringBuilder(s).reverse().toString();
        return lcs(s, rev);
    }

    int lcs(String s, String rev){
        int n = s.length();
        for(int i=1; i<n+1; i++){
            for(int j=1; j<n+1; j++){
                if(s.charAt(i-1) == rev.charAt(j-1)) dp[i][j] = 1+dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }return n-dp[n][n];
    }
}