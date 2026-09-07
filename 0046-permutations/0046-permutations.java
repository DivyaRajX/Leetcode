class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<>();
        List<Integer> per = new ArrayList<>();
        boolean[] usr = new boolean[nums.length];
        backtrack(per, nums, usr);
        return ans;
    }

    void backtrack(List<Integer> per, int[] arr, boolean[] usr){
        if(per.size() == arr.length){
            ans.add(new ArrayList<>(per));
            return;
        }

        for(int i=0; i<arr.length; i++){
            if(usr[i]) continue;

            usr[i] = true;
            per.add(arr[i]);
            backtrack(per, arr, usr);
            per.remove(per.size()-1);
            usr[i] = false;
        }
    }
}