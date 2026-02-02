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
    public int getDecimalValue(ListNode head) {
        ListNode dmy = head;
        int cnt = 0;
        int dec = 0;
        while(dmy.next != null){
            dmy = dmy.next;
            cnt++;
        }
        while(head != null){
            if(head.val == 1) dec += (int) Math.pow(2, cnt);
            cnt--;
            head = head.next;
        }return dec;
    }
}