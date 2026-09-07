class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> permuteUnique(int[] nums) {
        ans = new ArrayList<>();
        List<Integer> per = new ArrayList<>();
        boolean[] usr = new boolean[nums.length];
        backtrack(per, nums, usr);
        return new ArrayList<>(ans);
    }

    void backtrack(List<Integer> per, int[] arr, boolean[] usr){
        if(per.size() == arr.length){
            if(ans.contains(per)) return;
            ans.add(new ArrayList<>(per));
            return;
        }

        for(int i=0; i<arr.length; i++){
            //if(usr[i]) continue;
            if(usr[i]) continue;
            usr[i] = true;
            per.add(arr[i]);
            backtrack(per, arr, usr);
            per.remove(per.size()-1);
            usr[i] = false;
        }
    }
}