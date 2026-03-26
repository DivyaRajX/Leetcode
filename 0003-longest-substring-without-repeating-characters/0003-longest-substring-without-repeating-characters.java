class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int l = 0, r = 0;
        while(r<s.length()){
            char ch = s.charAt(r);
            while(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
            }

            set.add(ch);
            max = Math.max(max, r-l+1);
            r++;
        }return max;
    }
}