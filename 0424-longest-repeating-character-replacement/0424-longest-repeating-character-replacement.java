class Solution {
    public int characterReplacement(String s, int k) {
        int[] freqArr = new int[26];
        int max = 0, ans = 0;
        int l=0, r=0;
        while(r<s.length()){
            freqArr[s.charAt(r)-'A']++;
            max = Math.max(max, freqArr[s.charAt(r)-'A']);

            if(r-l+1-max > k){
                freqArr[s.charAt(l)-'A']--;
                l++;
            }

            if(r-l+1-max <= k){
                ans = Math.max(ans, r-l+1);
            }
            r++;
        }

        return ans;
    }
}