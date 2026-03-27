class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int r = 0, arr[] = new int[26];
        for(char ch : s1.toCharArray()) arr[ch-'a']++;
        while(r<s2.length()){
            char ch = s2.charAt(r);
            if(arr[ch-'a'] > 0){
                int f[] = arr.clone();
                f[ch-'a']--;
                int x = 1;
                int p = r+1;
                while(p<s2.length() && f[s2.charAt(p)-'a'] > 0){
                    f[s2.charAt(p)-'a']--;
                    x++;
                    p++;
                }
                if(x == s1.length()) return true;
            }
            r++;
        }return false;
    }
}