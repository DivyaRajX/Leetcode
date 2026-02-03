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
    public ListNode doubleIt(ListNode head) {
        ListNode temp = head;
        ListNode curr1 = helper(temp);
        ListNode curr2 = curr1;
        // return curr1;
        int x = 0;
        while(curr1 != null ){
            x += curr1.val*2;
            curr1.val = x%10;
            x = x/10;
            curr1 = curr1.next;   
        }
        ListNode head1 = helper(curr2);
        if(x>0){
            ListNode prev = new ListNode(x, head1);
            return prev;
        }
        return head1;

    }
    static ListNode helper(ListNode head){
        ListNode prev = null, curr = head, next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }return prev;
    }
}