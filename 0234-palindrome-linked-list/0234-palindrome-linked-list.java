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
    public boolean isPalindrome(ListNode head) {
        /*
        ListNode s = head;
        ListNode f = head;
        while(f!=null && f.next != null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode prev = null;
        ListNode curr = s.next;
        
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            
        }
        s.next = prev;
        ListNode check1=head;
        ListNode check2=s.next;
       
        while(check2!=null){
            if(check1.val!=check2.val) return false;
            check1=check1.next;
            check2=check2.next;
        }
        return true;
        */

        if(head.next==null) return true;
        ListNode slow =  head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        if (fast != null) {
            slow = slow.next;
        }
        
        ListNode temp = null;
        ListNode nex = slow;
        while(nex!=null){
            ListNode future = nex.next;
            nex.next=temp;
            temp=nex;
            nex=future;
        }
        ListNode pre = temp;
        ListNode a = head;
        while(pre!=null){
            if(a.val!=pre.val) return false;
            a=a.next;
            pre=pre.next;
        }
        return true; 
    
    }
}