class Solution {
    public int characterReplacement(String s, int k) {
        int[] freqArr = new int[26];
        int maxF = 0, ans = 0;
        int l = 0, r = 0;
        while(r<s.length()){
            freqArr[s.charAt(r)-'A']++;
            maxF = Math.max(maxF, freqArr[s.charAt(r)-'A']);

            if((r-l+1-maxF) > k){
                freqArr[s.charAt(l)-'A']--;
                l++;
            }

            if((r-l+1-maxF) <= k){
                ans = Math.max(ans, r-l+1);
            }
            r++;
        }return ans;
    }
}