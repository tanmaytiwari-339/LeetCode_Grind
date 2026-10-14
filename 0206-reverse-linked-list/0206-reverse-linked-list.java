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
    public ListNode reverseList(ListNode head) {
        if (head==null || head.next==null) return head;
        ListNode temp=head;
        ListNode pre=null;
        ListNode nex=null;
        while(temp.next!=null){
            nex=temp.next;
            temp.next=pre;
            pre=temp;
            temp=nex;
        }
        temp.next=pre;
        return temp;
    }
}