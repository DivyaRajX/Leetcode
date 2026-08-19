class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        int[] pre = new int[n], suf = new int[n];
        String ans = "";

        int cnt = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '(') {
                if(cnt < 0) cnt = 0;
                pre[i] = ++cnt;
            }
            else if(s.charAt(i) == ')') pre[i] = --cnt;
        }
        cnt = 0;
        for(int i=n-1; i>=0; i--){
            if(s.charAt(i) == ')') {
                if(cnt < 0) cnt = 0;
                suf[i] = ++cnt;
            }
            else if(s.charAt(i) == '(') suf[i] = --cnt;
        }
        // System.out.println(Arrays.toString(pre));
        // System.out.println(Arrays.toString(suf));
        for(int i=0; i<n; i++){
            if(pre[i] >= 0 && suf[i] >= 0) ans += s.charAt(i);
        }
        return ans;
    }
}