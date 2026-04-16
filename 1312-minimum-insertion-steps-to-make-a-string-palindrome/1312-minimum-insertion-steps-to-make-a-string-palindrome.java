class Solution {
    Integer dp[][];

    public int minInsertions(String s) {
        int n = s.length();
        if(n<=1) return 0;
        dp = new Integer[n][n];
        return solve(s,0,n-1);
    }

    public int solve(String s, int i, int j) {
        if (i >= j) {
            return 0;
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        if (s.charAt(i) == s.charAt(j)) {
            return dp[i][j] = solve(s, i + 1, j - 1);
        } else {
            return dp[i][j] = 1 + Math.min(solve(s, i, j - 1), solve(s, i + 1, j));
        }
    }
}