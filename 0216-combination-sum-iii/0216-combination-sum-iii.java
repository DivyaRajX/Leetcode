class Solution {
    List<List<Integer>> ans;
    int[] arr;
    public List<List<Integer>> combinationSum3(int k, int n) {
        ans = new ArrayList<>();
        arr = new int[]{1,2,3,4,5,6,7,8,9};
        List<Integer> comb = new ArrayList<>();
        backtrack(comb, k, n, 0);
        return ans;
    }

    void backtrack(List<Integer> comb, int k, int n, int idx){
        if(n<0) return;
        if(n==0 && comb.size() == k){
            ans.add(new ArrayList<>(comb));
            return;
        }

        for(int i=idx; i<9 && n>=arr[i]; i++){
            comb.add(arr[i]);
            backtrack(comb, k, n-arr[i], i+1);
            comb.remove(comb.size()-1);
        }
    }
}