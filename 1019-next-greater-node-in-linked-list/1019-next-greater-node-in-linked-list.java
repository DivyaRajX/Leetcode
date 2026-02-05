/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> ll = new ArrayList<>();
        Deque<Integer> st = new ArrayDeque<>();
        while(head != null){
            ll.add(head.val);
            head = head.next;
        }

        for(int i=ll.size()-1; i>=0; i--){
            int num = ll.get(i);
            while(!st.isEmpty() && st.peek()<=num) st.pop();
            if(st.isEmpty()){
                st.push(num);
                ll.set(i, 0);
            }
            else{
                ll.set(i, st.peek());
            }
            st.push(num);
        }
        //System.out.println(ll);
        return ll.stream().mapToInt(i -> i).toArray();
    }
}