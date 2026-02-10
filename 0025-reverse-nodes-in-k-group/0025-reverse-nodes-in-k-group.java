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
    public ListNode reverseKGroup(ListNode head, int k) {
        ArrayList<Integer> ll = new ArrayList<>();
        while(head != null){
            ll.add(head.val);
            head = head.next;
        }

        for(int i=0; (i+k)<ll.size(); i+=k){
            swap(ll, i, i+k-1);
        }
        ListNode res = new ListNode(ll.get(0));
        ListNode t = res;
        for(int i=1; i<ll.size(); i++){
            ListNode temp = new ListNode(ll.get(i));
            t.next = temp;
            t = temp;
        }return res;
    }
    static void swap(ArrayList<Integer> ll, int i, int j){
        while(i<j){
            int temp = ll.get(i);
            ll.set(i, ll.get(j));
            ll.set(j, temp);
            i++;
            j--;
        }
    }
}