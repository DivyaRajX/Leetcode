class Solution {
    public int minAddToMakeValid(String s) {
        int cnt = 0;
        int temp = 0;
        for(char ch: s.toCharArray()){
            if(ch == '(') cnt++;
            else cnt--;
            if(cnt<0){
                temp += Math.abs(cnt);
                cnt = 0;
            }    
        }return cnt+temp;
    }
}