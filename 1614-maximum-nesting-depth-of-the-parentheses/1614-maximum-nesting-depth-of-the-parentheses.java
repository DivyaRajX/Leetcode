class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int cnt = 0;
        for(char ch : s.toCharArray()){
            if(ch == '(') cnt+=1;
            else if(ch == ')'){
                max = Math.max(cnt, max);
                cnt--;
            }
        }return max;
    }
}