class Solution {
    int[][] dp;
    public int minDistance(String word1, String word2) {
        if(word1.equals(word2)) return 0;
        int n = word1.length();
        int m = word2.length();

        dp = new int[n+1][m+1];
       return solve(word1, word2);
    }

    int solve(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(s1.charAt(i) == s2.charAt(j)) dp[i+1][j+1] = 1+dp[i][j];
                else{
                    dp[i+1][j+1] = Math.max(dp[i+1][j], dp[i][j+1]);
                }
            }
        }return m+n-2*dp[n][m];
    }
}