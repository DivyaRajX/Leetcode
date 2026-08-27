class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] l = new int[n], r = new int[n];

        //NSL
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            l[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();


        // NSR
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            r[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        int max = 0;
        for(int i=0; i<n; i++){
            max = Math.max(max, arr[i]*(r[i]-l[i]-1));
        }

        return max;
    }
}