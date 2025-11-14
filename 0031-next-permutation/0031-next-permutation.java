class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int j = arr.length-1;
        while(j>=1 && arr[j]<=arr[j-1]) j--;
        if(j == 0) reverse(arr, 0);
        else{
        int pivot = j-1;
        int max = j;

        while(j<n){
            if(arr[j]>arr[pivot] && arr[j]<=arr[max]) max = j;
            j++;
        }

        int temp = arr[pivot];
        arr[pivot] = arr[max];
        arr[max] = temp;
        reverse(arr, pivot+1);
        }
    }

    static void reverse(int[] arr, int idx){
        int j = arr.length-1;
        while(idx < j){
            int temp = arr[idx];
            arr[idx] = arr[j];
            arr[j] = temp;
            j--;
            idx++;
        }
    }
}