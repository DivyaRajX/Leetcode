class Solution {
    public void sortColors(int[] arr) {
        for(int i=0; i<arr.length; i++){
            int loc = i, min = arr[i];
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < min){
                    loc = j;
                    min = arr[j];
                }
            }
            int temp = arr[loc];
            arr[loc] = arr[i];
            arr[i] = temp;
        }
    }
}