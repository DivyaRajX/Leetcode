class Solution {
    public int countSubstrings(String s) {
        if(s.length() <= 1) return s.length();  
        int cnt = 0, n = s.length();
        for(int i=0; i<n; i++){
            int l=i, r=i;
            while(l>=0 && r<n && s.charAt(l)  == s.charAt(r)){
                cnt++;
                l--;
                r++;
            }

            l=i;
            r=i+1;
            while(l>=0 && r<n && s.charAt(l)  == s.charAt(r)){
                cnt++;
                l--;
                r++;
            }
            

        }
        return cnt;
    }
}