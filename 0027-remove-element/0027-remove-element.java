class Solution {
    public int removeElement(int[] arr, int val) {
        int n = arr.length;
        int i=0, j=0;
        int c = 0;
        while(i<n && j<n){
            if(arr[i] != val){
                c++;
                i++;
                j++;
            }
            else if(arr[j] == val) j++;
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }return i;
    }
}