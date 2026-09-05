class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i=0, j=0;
        int max=0;
        while(j<s.length()){
            char ch = s.charAt(j);
            while(set.contains(ch)){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(ch);
            max = Math.max(max, j-i+1);
            j++;
        }
        return max;
    }
}