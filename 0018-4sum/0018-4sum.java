class Solution {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        // Arrays.sort(nums);
        // int lft = 0, rgt = nums.length-1;
        // while(lft<rgt){
        //     int p1 = lft+1, p2 = rgt-1;
        //     while(p1<p2){
        //         int sum = nums[p1]+nums[p2]+nums[rgt]+nums[lft];
        //         if( sum == target) {
        //             ans.add(Arrays.asList(nums[p1], nums[p2], nums[rgt], nums[lft]));
        //             p1++;
        //             p2--;
        //         }
        //         else if(sum < target) p1++;
        //         else p2--;
        //     }
        //     lft++;
        //     rgt--;
        // }
        // 
        Arrays.sort(nums);
int n = nums.length;

for (int i = 0; i < n - 3; i++) {

    // Skip duplicate first elements
    if (i > 0 && nums[i] == nums[i - 1]) continue;

    for (int j = i + 1; j < n - 2; j++) {

        // Skip duplicate second elements
        if (j > i + 1 && nums[j] == nums[j - 1]) continue;

        int left = j + 1;
        int right = n - 1;

        while (left < right) {
            long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

            if (sum == target) {
                ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                left++;
                right--;

                // Skip duplicate third elements
                while (left < right && nums[left] == nums[left - 1]) left++;

                // Skip duplicate fourth elements
                while (left < right && nums[right] == nums[right + 1]) right--;

            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}

return ans;
    }
}