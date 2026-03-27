class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int cnt = s1.length(), l = 0, r = 0;
        int[] arr = new int[26];
        for(char ch : s1.toCharArray()) arr[ch-'a']++; 
        while(r<s2.length()){
            if(arr[s2.charAt(r)-'a'] > 0) cnt--;
            arr[s2.charAt(r)-'a']--;
            r++;

            if(cnt == 0) return true;
            if(r-l == s1.length()){
                if(arr[s2.charAt(l)-'a'] >= 0) cnt++;
                arr[s2.charAt(l)-'a']++;
                l++;
            }
        }return false;
    }
}