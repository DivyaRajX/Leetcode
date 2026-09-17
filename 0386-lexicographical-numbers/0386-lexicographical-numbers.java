class Solution {
    List<Integer> ans; 
    public List<Integer> lexicalOrder(int n) {
       ans = new ArrayList<>();
       print(0, n);
       return ans.subList(1, ans.size());
    }

    void print(int curr, int n){
        if(curr > n) return;
        ans.add(curr);
        int i=0;
        if(curr == 0) i=1;
        for(;i<=9; i++) print(curr*10+i, n);
    }
}