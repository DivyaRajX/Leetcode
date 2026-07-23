class Solution {
    public int[] twoSum(int[] arr, int target) {
        int pt1 = 0, pt2 = arr.length-1;
        while(pt1 <= pt2){
            int sum = arr[pt1]+arr[pt2];
            if(sum == target) break;
            else if(sum < target) pt1++;
            else pt2--;
        }

        return new int[]{++pt1, ++pt2};
    }
}