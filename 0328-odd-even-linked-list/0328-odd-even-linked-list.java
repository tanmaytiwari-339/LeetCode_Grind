

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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null) return head;
        ListNode head1 = head;
        ListNode head2 = head.next;
        ListNode temp = head.next;
        while(head1!=null && temp!=null){
            head1.next = temp.next;
            if(head1.next==null) break ;
            head1=head1.next;
            temp.next = head1.next;
            temp=temp.next;

        }

        head1.next=head2;
        return head;

    }
}