class Solution {
    public int[][] merge(int[][] arr) {
        Stack<int[]> st = new Stack<>();
        if(arr.length == 1) return arr;
        // Arrays.sort(arr, (a,b) -> {
        //     if(a[0] != b[0]) return a[0]-b[0];
        //     return a[1]-b[1];
        // });
        Arrays.sort(arr, (a, b) ->
            a[0] == b[0]
                ? Integer.compare(a[1], b[1])
                : Integer.compare(a[0], b[0])
        );
        for(int[] i: arr) System.out.println(Arrays.toString(i));
        for(int i=0; i<arr.length; i++){
            if(st.isEmpty()) st.push(arr[i]);
            else{
                int[] temp = st.peek();
                if(temp[1] >= arr[i][0]) {
                    temp[1] = Math.max(arr[i][1], temp[1]);
                    st.pop();
                    st.push(temp);
                }
                else if(temp[1] < arr[i][0])
                    st.push(arr[i]);
                }
            }
        return st.toArray(new int[st.size()][]);
    }
}