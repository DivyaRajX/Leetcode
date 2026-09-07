class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans = new ArrayList<>();
        List<Integer> cmb = new ArrayList<>();
        int sum = 0;

        backtrack(sum, target, 0, cmb, candidates);
        return ans;

    }

    void backtrack(int sum, int tar, int st, List<Integer> comb, int[] arr){
        if(sum > tar) return;
        if(sum == tar){
            ans.add(new ArrayList<>(comb));
            return;
        }

        for(int i=st; i<arr.length; i++){
            sum += arr[i];
            comb.add(arr[i]);

            backtrack(sum, tar, i, comb, arr);

            sum -= arr[i];
            comb.remove(comb.size()-1);
        }
    }
}