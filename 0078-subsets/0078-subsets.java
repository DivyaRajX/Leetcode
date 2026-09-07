class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        backtrack(sub, 0, nums);
        return ans;
    }

    void backtrack(List<Integer> sub, int idx, int[] arr){
        ans.add(new ArrayList<>(sub));
        for(int i=idx; i<arr.length; i++){
            sub.add(arr[i]);
            backtrack(sub, i+1, arr);
            sub.remove(sub.size()-1);
        }
    }

}