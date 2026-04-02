class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 1) return s;
        String res = "";
        int resL = 0, n = s.length();
        for(int i=0; i<n; i++){
            int l=i, r=i;
            while(l>=0 && r<n && s.charAt(l) == s.charAt(r)){
                if(r-l+1 > resL){
                    res = s.substring(l, r+1);
                    resL = r-l+1;
                } 
                l--;
                r++;
            }
            l=i;
        r=i+1;
        while(l>=0 && r<n && s.charAt(l) == s.charAt(r)){
                if(r-l+1 > resL){
                    res = s.substring(l, r+1);
                    resL = r-l+1;
                } 
            l--;
            r++;
        }
 
        }
        return res; 
    }
}